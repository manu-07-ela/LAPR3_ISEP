package lapr.project.data;

import lapr.project.controller.App;
import lapr.project.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SendToJava {

    DatabaseConnection databaseConnection;

    public SendToJava(){
        this.databaseConnection = App.getInstance().getDatabaseConnection();
    }

    public void importShips(){
        try {
            importShipFromDatabase(databaseConnection);
        } catch (Exception e){
            System.out.println("Error when importing data from the database.");
        }
    }

    public void importPorts(){
        try {
            importPortFromDatabase(databaseConnection);
        } catch (Exception e){
            System.out.println("Error when importing data from the database.");
        }
    }
    /**
     * Retrieves a ship from the database to the ship tree.
     *
     * @param databaseConnection to the database
     * @throws SQLException in case an error with the database occurs
     */
    private void importShipFromDatabase(DatabaseConnection databaseConnection)
            throws SQLException {

        Connection connection = databaseConnection.getConnection();

        boolean isShipOnDatabase;

        String sqlCommand = "select * from ship";

        PreparedStatement getShipsPreparedStatement =
                connection.prepareStatement(sqlCommand);

        try (ResultSet shipsResultSet = getShipsPreparedStatement.executeQuery()) {

            isShipOnDatabase = shipsResultSet.next();

            while(isShipOnDatabase){
                Ship newShip = new Ship();

                newShip.setMMSI(shipsResultSet.getNString(1));
                newShip.setShipID(shipsResultSet.getNString(2));
                newShip.setNumberGenerators(shipsResultSet.getInt(3));
                newShip.setGeneratorOutput(shipsResultSet.getFloat(4));
                newShip.setCallSign(shipsResultSet.getNString(5));
                newShip.setDraft(shipsResultSet.getFloat(6));
                newShip.setName(shipsResultSet.getNString(7));
                newShip.setVesselType(shipsResultSet.getInt(8));
                newShip.setLength(shipsResultSet.getFloat(9));
                newShip.setWidth(shipsResultSet.getFloat(10));
                newShip.setCargo(shipsResultSet.getNString(11));

                importPositionFromDatabase(databaseConnection, newShip);

                App.getInstance().getCompany().getBstShip().insert(newShip);
                isShipOnDatabase = shipsResultSet.next();
            }
            shipsResultSet.close();

        } finally {
            getShipsPreparedStatement.close();
        }
    }

    private void importPositionFromDatabase(DatabaseConnection databaseConnection, Ship ship)
            throws SQLException {

        Connection connection = databaseConnection.getConnection();

        boolean isPositionOnDatabase;

        String sqlCommand = "select * from shipPosition where shipMmsiCode = ?";

        PreparedStatement getPositionPreparedStatement =
                connection.prepareStatement(sqlCommand);

        getPositionPreparedStatement.setString(1, ship.getMMSI());

        try (ResultSet positionResultSet = getPositionPreparedStatement.executeQuery()) {
            isPositionOnDatabase = positionResultSet.next();
            while(isPositionOnDatabase){
                ShipLocation shipLocation = new ShipLocation();

                shipLocation.setMMSI(positionResultSet.getNString(1));
                shipLocation.setMessageTime(positionResultSet.getDate(2));
                shipLocation.setLatitude(positionResultSet.getNString(3));
                shipLocation.setLongitude(positionResultSet.getNString(4));
                shipLocation.setSOG(positionResultSet.getFloat(5));
                shipLocation.setCOG(positionResultSet.getFloat(6));
                shipLocation.setHeading(positionResultSet.getNString(7));
                shipLocation.setPosition(positionResultSet.getNString(8));
                shipLocation.setTransceiverClass(positionResultSet.getNString(9));

                ship.getShipPosition().insert(shipLocation);
                isPositionOnDatabase = positionResultSet.next();
            }

            positionResultSet.close();
        } finally {
            getPositionPreparedStatement.close();
        }
    }

    public void importPortFromDatabase(DatabaseConnection databaseConnection) throws SQLException{
        Connection connection = databaseConnection.getConnection();

        boolean isPortOnDatabase;

        String sqlCommand = "select * from port";

        PreparedStatement getPortsPreparedStatement =
                connection.prepareStatement(sqlCommand);

        try (ResultSet shipsResultSet = getPortsPreparedStatement.executeQuery()) {

            isPortOnDatabase = shipsResultSet.next();

            while(isPortOnDatabase){
                int code = shipsResultSet.getInt(1);
                String portName = shipsResultSet.getNString(2);
                double latitude = Double.parseDouble(shipsResultSet.getNString(3));
                double longitude = Double.parseDouble(shipsResultSet.getNString(4));
                PlaceLocation placeLocation = new PlaceLocation(latitude, longitude);

                Country country = importCountryFromDatabase(databaseConnection, placeLocation);

                Ports port = new Ports(country, code, portName, placeLocation);

                App.getInstance().getCompany().getPortStr().getPortsLst().add(port);
                isPortOnDatabase = shipsResultSet.next();
            }
            shipsResultSet.close();

        } finally {
            getPortsPreparedStatement.close();
        }
    }

    public Country importCountryFromDatabase(DatabaseConnection databaseConnection, PlaceLocation placeLocation) throws SQLException{
        Connection connection = databaseConnection.getConnection();

        Country country;

        String sqlCommand = "select countryName from PlaceLocation where latitude = ? and longitude = ?";

        PreparedStatement getCountriesPreparedStatement =
                connection.prepareStatement(sqlCommand);

        getCountriesPreparedStatement.setString(1, String.format("%.2f", placeLocation.getLatitude()));
        getCountriesPreparedStatement.setString(2, String.format("%.2f", placeLocation.getLongitude()));

        try (ResultSet shipsResultSet = getCountriesPreparedStatement.executeQuery()) {

            String countryName = shipsResultSet.getNString(1);

            sqlCommand = "select * from Country where countryName = ?";
            getCountriesPreparedStatement = connection.prepareStatement(sqlCommand);
            getCountriesPreparedStatement.setString(1, countryName);


            try(ResultSet countryResultSet = getCountriesPreparedStatement.executeQuery()){
                countryResultSet.next();
                String continent = countryResultSet.getNString(2);
                country = new Country(continent, countryName);
                countryResultSet.close();
            }
            shipsResultSet.close();

        } finally {
            getCountriesPreparedStatement.close();
        }
        return country;
    }
}

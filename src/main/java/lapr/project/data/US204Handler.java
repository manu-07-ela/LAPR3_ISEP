package lapr.project.data;

import lapr.project.controller.App;
import lapr.project.utils.WriteForAFile;

import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class US204Handler {

    private Connection databaseConnection;

    private WriteForAFile writeForAFile;

    private String containerLocation;

    public US204Handler() throws SQLException, IOException {
        databaseConnection = App.getInstance().getDatabaseConnection().getConnection();
        writeForAFile = new WriteForAFile();
    }

    public String getContainerLocation(int containerNumber) throws IOException {

        try(CallableStatement callStmt = databaseConnection.prepareCall("{ ? = call get_container_position (?)}")) {

            callStmt.setInt(2, containerNumber);


            callStmt.registerOutParameter(1, Types.LONGNVARCHAR);

            callStmt.execute();

            this.containerLocation = callStmt.getString(1);


            writeForAFile.writeForAFile(containerLocation, "US204_" + containerNumber, new File(".\\outputs\\US204"));

            return containerLocation;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

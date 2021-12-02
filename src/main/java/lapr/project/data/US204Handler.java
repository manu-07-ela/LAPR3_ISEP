package lapr.project.data;

import lapr.project.controller.App;
import lapr.project.utils.WriteForAFile;

import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe responsável pela operações com a base de dados que envolvam Farmacia
 */
public class US204Handler {

    private Connection databaseConnection;

    private WriteForAFile writeForAFile;

    private String containerLocation;

    public US204Handler(String containerNumber) throws SQLException, IOException {
        databaseConnection = App.getInstance().getDatabaseConnection().getConnection();
        writeForAFile = new WriteForAFile();
        initialize(containerNumber);
    }

    private void initialize(String containerNumber) throws SQLException, IOException {
        CallableStatement callStmt = databaseConnection.prepareCall("{CALL US204(?)}");

        callStmt.setString(1, containerNumber);

        callStmt.execute();

        this.containerLocation = callStmt.getString(1);

        writeForAFile.writeForAFile(containerLocation, "US204_" + containerNumber, new File("target\\generated-sources\\annotations\\US204"));
        callStmt.close();
        databaseConnection.close();
    }
}

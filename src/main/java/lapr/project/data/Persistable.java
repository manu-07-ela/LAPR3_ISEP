package lapr.project.data;

/**
 * @author Francisco Redol <1201239@isep.ipp.pt>
 */
public interface Persistable {
    /**
     * Save a ship to the database.
     *
     * @param databaseConnection the database connection
     * @param object the object that is going to be saved
     */
    void saveShip(DatabaseConnection databaseConnection, Object object);

    /**
     * Save a Position to the database.
     *
     * @param databaseConnection the database connection
     * @param object the object that is going to be saved
     */
    void savePosition(DatabaseConnection databaseConnection, Object object);

    /**
     * Save a port to the database
     *
     * @param databaseConnection the database connection
     * @param object the object that is going to be saved
     */
    void savePort(DatabaseConnection databaseConnection, Object object);

    /**
     * Save a Container to the database
     *
     * @param databaseConnection the database connection
     * @param object the object that is going to be saved
     */
    void saveContainer(DatabaseConnection databaseConnection, Object object);
}
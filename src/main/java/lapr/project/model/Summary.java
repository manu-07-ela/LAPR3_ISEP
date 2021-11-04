package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a summary that will be generated by the dynamic data of a journey
 * @author Manuela Leite <1200720@isep.ipp.pt>
 */

public class Summary {

    /**
     * The MMSI code of a ship
     */
    private String mmsiCode;

    /**
     * The ships name
     */
    private String name;

    /**
     * The date and time of starting of journey
     */
    private Date startBaseDate;

    /**
     * The date and time of end of journey
     */
    private Date endBaseDate;

    /**
     * The total time spend in the journey
     */
    private String totalMovementTime;

    /**
     * The total movements made in the journey
     */
    private int totalMovements;

    /**
     * The maximum speed over ground of a ship
     */
    private double maximumSog;

    /**
     * The mean speed over ground of a ship
     */
    private double meanSog;

    /**
     * The maximum course over ground of a ship
     */
    private double maximumCog;

    /**
     * The mean course over ground of a ship
     */
    private double meanCog;

    /**
     * The departure latitude of the journey
     */
    private float departureLatitude;

    /**
     * The departure longitude of the journey
     */
    private float departureLongitude;

    /**
     * The arrival latitude of the journey
     */
    private float arrivalLatitude;

    /**
     * The arrival longitude of the journey
     */
    private float arrivalLongitude;

    /**
     * The total distance travelled
     */
    private double travelledDistance;

    /**
     * The delta distance of the journey
     */
    private double deltaDistance;

    Summary(Ship ship){
        mmsiCode = ship.getMMSI();
        name = ship.getName();
        ShipLocationBST treeOfPositions = ship.getShipLocationBST();
        startBaseDate = treeOfPositions.getStartBase();
        endBaseDate = treeOfPositions.getEndBase();
        totalMovements = treeOfPositions.getTotalMovements();
        totalMovementTime = treeOfPositions.getTotalMovementsTime();
        maximumSog = treeOfPositions.getMaximumSog();
        meanSog = treeOfPositions.getMeanSog();
        maximumCog = treeOfPositions.getMaximumCog();
        meanCog = treeOfPositions.getMeanCog();
        departureLatitude = treeOfPositions.getLatitudeDeparture();
        departureLongitude = treeOfPositions.getLongitudeDeparture();
        arrivalLatitude = treeOfPositions.getArrivalLatitude();
        arrivalLongitude = treeOfPositions.getArrivalLongitude();
        travelledDistance = treeOfPositions.getTravelledDistance();
        deltaDistance = treeOfPositions.getDeltaDistance();

    }

    /**
     * Get the MMSI code associated with a ship
     * @return the MMSI code
     */
    public String getMmsiCode() {
        return mmsiCode;
    }

    /**
     * Get the ships name
     * @return the ship name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the date and time the ship leaves the port where the voyage began
     * @return the date of start of a journey
     */
    public Date getStartBaseDate() {
        return startBaseDate;
    }

    /**
     * Get the date and time the ship arrives at its port of destination
     * @return the date of arrival in port
     */
    public Date getEndBaseDate() {
        return endBaseDate;
    }

    /**
     * Get the total time of movements made by a ship in the travel
     * @return the total time of movements
     */
    public String getTotalMovementTime() {
        return totalMovementTime;
    }

    /**
     * Get the total number of movements made by a ship in the travel
     * @return the total number of movements
     */
    public int getTotalMovements() {
        return totalMovements;
    }

    /**
     * Get the maximum speed over ground of a ship
     * @return the maximum speed over ground
     */
    public double getMaximumSog() {
        return maximumSog;
    }

    /**
     * Get the mean speed over ground of a ship
     * @return the mean speed over ground
     */
    public double getMeanSog() {
        return meanSog;
    }

    /**
     * Get the maximum course over ground of a ship
     * @return the maximum course over ground
     */
    public double getMaximumCog() {
        return maximumCog;
    }

    /**
     * Get the mean course over ground of a ship
     * @return the mean course over ground
     */
    public double getMeanCog() {
        return meanCog;
    }

    /**
     * Get the latitude of the departure of a ship
     * @return the departure latitude
     */
    public double getDepartureLatitude() {
        return departureLatitude;
    }

    /**
     * Get the longitude of the departure of a ship
     * @return the departure longitude
     */
    public float getDepartureLongitude() {
        return departureLongitude;
    }

    /**
     * Get the latitude of the arrival of a ship
     * @return the arrival latitude
     */
    public float getArrivalLatitude() {
        return arrivalLatitude;
    }

    /**
     * Get the longitude of the arrival of a ship
     * @return the arrival longitude
     */
    public float getArrivalLongitude() {
        return arrivalLongitude;
    }

    /**
     * Get the travelled distance of a ship
     * @return the traveled distance
     */
    public double getTravelledDistance() {
        return travelledDistance;
    }

    /**
     * Get the delta distance traveled by a ship
     * @return the delta distance
     */
    public double getDeltaDistance() {
        return deltaDistance;
    }

}

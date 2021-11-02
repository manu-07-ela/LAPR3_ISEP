package lapr.project.mapper.dto;

import lapr.project.model.Summary;

import java.util.Date;

/**
 * Represents a data transfer object of Summary
 * @author Manuela Leite <1200720@isep.ipp.pt>
 */

public class SummaryDto {

    /**
     * The call sign of a ship
     */
    private String callSign;

    /**
     * The MMSI code of a ship
     */
    private String mmsiCode;

    /**
     * The ships name
     */
    private String name;

    /**
     * The IMO code of a ship
     */
    private String imoCode;

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
    private int departureLatitude;

    /**
     * The departure longitude of the journey
     */
    private int departureLongitude;

    /**
     * The arrival latitude of the journey
     */
    private int arrivalLatitude;

    /**
     * The arrival longitude of the journey
     */
    private int arrivalLongitude;

    /**
     * The total distance travelled
     */
    private float travelledDistance;

    /**
     * The delta distance of the journey
     */
    private float deltaDistance;

    /**
     * Creates a new instance of SummaryDto
     * @param callSign call sign associated with the ship
     * @param mmsiCode MMSI code associated with a ship
     * @param name ships name
     * @param imoCode IMO code associated with a ship
     * @param startBaseDate the start base of journey
     * @param endBaseDate the end base of journey
     * @param totalMovementTime the time spend in journey
     * @param totalMovements the total movements made in journey
     * @param maximumSog the maximum speed over ground of a ship
     * @param meanSog the mean speed over ground of a ship
     * @param maximumCog the maximum course ver ground of a ship
     * @param meanCog the mean speed over ground of a ship
     * @param departureLatitude the latitude of the departure location
     * @param departureLongitude the longitude of the departure location
     * @param arrivalLatitude the latitude of the arrival location
     * @param arrivalLongitude the longitude of the arrival location
     * @param travelledDistance the travelled distance made in a journey
     * @param deltaDistance the delta distance made in a journey
     */
    public SummaryDto(String callSign, String mmsiCode, String name, String imoCode, Date startBaseDate, Date endBaseDate, String totalMovementTime, int totalMovements, double maximumSog, double meanSog, double maximumCog, double meanCog, int departureLatitude, int departureLongitude, int arrivalLatitude, int arrivalLongitude, float travelledDistance, float deltaDistance) {
        this.callSign = callSign;
        this.mmsiCode = mmsiCode;
        this.name = name;
        this.imoCode = imoCode;
        this.startBaseDate = startBaseDate;
        this.endBaseDate = endBaseDate;
        this.totalMovementTime = totalMovementTime;
        this.totalMovements = totalMovements;
        this.maximumSog = maximumSog;
        this.meanSog = meanSog;
        this.maximumCog = maximumCog;
        this.meanCog = meanCog;
        this.departureLatitude = departureLatitude;
        this.departureLongitude = departureLongitude;
        this.arrivalLatitude = arrivalLatitude;
        this.arrivalLongitude = arrivalLongitude;
        this.travelledDistance = travelledDistance;
        this.deltaDistance = deltaDistance;
    }

    /**
     * Creates a new instance of SummaryDto receiving a Summary as parameter
     * @param summary the summary
     */
    public SummaryDto(Summary summary){
        this.callSign = summary.getCallSign();
        this.mmsiCode = summary.getMmsiCode();
        this.name = summary.getName();
        this.imoCode = summary.getImoCode();
        this.startBaseDate = summary.getStartBaseDate();
        this.endBaseDate = summary.getEndBaseDate();
        this.totalMovementTime = summary.getTotalMovementTime();
        this.totalMovements = summary.getTotalMovements();
        this.maximumSog = summary.getMaximumSog();
        this.meanSog = summary.getMeanSog();
        this.maximumCog = summary.getMaximumCog();
        this.meanCog = summary.getMeanCog();
        this.departureLatitude = summary.getDepartureLatitude();
        this.departureLongitude = summary.getDepartureLongitude();
        this.arrivalLatitude = summary.getArrivalLatitude();
        this.arrivalLongitude = summary.getArrivalLongitude();
        this.travelledDistance = summary.getTravelledDistance();
        this.deltaDistance = summary.getDeltaDistance();
    }
    /**
     * Get the call sign associated with a ship
     * @return the call sign
     */
    public String getCallSign() {
        return callSign;
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
     * Get the IMO code associated with a ship
     * @return the IMO code
     */
    public String getImoCode() {
        return imoCode;
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
    public int getDepartureLatitude() {
        return departureLatitude;
    }

    /**
     * Get the longitude of the departure of a ship
     * @return the departure longitude
     */
    public int getDepartureLongitude() {
        return departureLongitude;
    }

    /**
     * Get the latitude of the arrival of a ship
     * @return the arrival latitude
     */
    public int getArrivalLatitude() {
        return arrivalLatitude;
    }

    /**
     * Get the longitude of the arrival of a ship
     * @return the arrival longitude
     */
    public int getArrivalLongitude() {
        return arrivalLongitude;
    }

    /**
     * Get the travelled distance of a ship
     * @return the traveled distance
     */
    public float getTravelledDistance() {
        return travelledDistance;
    }

    /**
     * Get the delta distance traveled by a ship
     * @return the delta distance
     */
    public float getDeltaDistance() {
        return deltaDistance;
    }

    /**
     * Textual description of the contents in a summary
     * @return Information that characterizes a summary
     */
    @Override
    public String toString() {
        return "SummaryDto{" +
                "callSign='" + callSign + '\'' +
                ", mmsiCode='" + mmsiCode + '\'' +
                ", name='" + name + '\'' +
                ", imoCode='" + imoCode + '\'' +
                ", startBaseDate=" + startBaseDate +
                ", endBaseDate=" + endBaseDate +
                ", totalMovementTime='" + totalMovementTime + '\'' +
                ", totalMovements=" + totalMovements +
                ", maximumSog=" + maximumSog +
                ", meanSog=" + meanSog +
                ", maximumCog=" + maximumCog +
                ", meanCog=" + meanCog +
                ", departureLatitude=" + departureLatitude +
                ", departureLongitude=" + departureLongitude +
                ", arrivalLatitude=" + arrivalLatitude +
                ", arrivalLongitude=" + arrivalLongitude +
                ", travelledDistance=" + travelledDistance +
                ", deltaDistance=" + deltaDistance +
                '}';
    }
}
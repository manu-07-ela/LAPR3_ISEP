package lapr.project.mapper.dto;

import java.util.Date;

/**
 * Represents a data transfer object of Summary
 * @author Manuela Leite <1200720@isep.ipp.pt>
 */

public class SummaryDto {

    /**
     * The MMSI code of a ship
     */
    private String mmsiCodeDto;

    /**
     * The ships name
     */
    private String nameDto;

    /**
     * The date and time of starting of journey
     */
    private Date startBaseDateDto;

    /**
     * The date and time of end of journey
     */
    private Date endBaseDateDto;

    /**
     * The total time spend in the journey
     */
    private String totalMovementTimeDto;

    /**
     * The total movements made in the journey
     */
    private int totalMovementsDto;

    /**
     * The maximum speed over ground of a ship
     */
    private double maximumSogDto;

    /**
     * The mean speed over ground of a ship
     */
    private double meanSogDto;

    /**
     * The maximum course over ground of a ship
     */
    private double maximumCogDto;

    /**
     * The mean course over ground of a ship
     */
    private double meanCogDto;

    /**
     * The departure latitude of the journey
     */
    private String departureLatitudeDto;

    /**
     * The departure longitude of the journey
     */
    private String departureLongitudeDto;

    /**
     * The arrival latitude of the journey
     */
    private String arrivalLatitudeDto;

    /**
     * The arrival longitude of the journey
     */
    private String arrivalLongitudeDto;

    /**
     * The total distance travelled
     */
    private double travelledDistanceDto;

    /**
     * The delta distance of the journey
     */
    private double deltaDistanceDto;

    /**
     * Creates a new instance of SummaryDto
     * @param mmsiCodedto MMSI code associated with a ship
     * @param nameDto ships name
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
    public SummaryDto(String mmsiCodedto, String nameDto, Date startBaseDate, Date endBaseDate, String totalMovementTime, int totalMovements, double maximumSog, double meanSog, double maximumCog, double meanCog, String departureLatitude, String departureLongitude, String arrivalLatitude, String arrivalLongitude, double travelledDistance, double deltaDistance) {
        this.mmsiCodeDto = mmsiCodedto;
        this.nameDto = nameDto;
        this.startBaseDateDto = startBaseDate;
        this.endBaseDateDto = endBaseDate;
        this.totalMovementTimeDto = totalMovementTime;
        this.totalMovementsDto = totalMovements;
        this.maximumSogDto = maximumSog;
        this.meanSogDto = meanSog;
        this.maximumCogDto = maximumCog;
        this.meanCogDto = meanCog;
        this.departureLatitudeDto = departureLatitude;
        this.departureLongitudeDto = departureLongitude;
        this.arrivalLatitudeDto = arrivalLatitude;
        this.arrivalLongitudeDto = arrivalLongitude;
        this.travelledDistanceDto = travelledDistance;
        this.deltaDistanceDto = deltaDistance;
    }

    /**
     * Creates a new instance of SummaryDto receiving a Summary as parameter
     * @param summary the summary
     */
    public SummaryDto(lapr.project.model.Summary summary){
        this.mmsiCodeDto = summary.getMmsiCode();
        this.nameDto = summary.getName();
        this.startBaseDateDto = summary.getStartBaseDate();
        this.endBaseDateDto = summary.getEndBaseDate();
        this.totalMovementTimeDto = summary.getTotalMovementTime();
        this.totalMovementsDto = summary.getTotalMovements();
        this.maximumSogDto = summary.getMaximumSog();
        this.meanSogDto = summary.getMeanSog();
        this.maximumCogDto = summary.getMaximumCog();
        this.meanCogDto = summary.getMeanCog();
        this.departureLatitudeDto = summary.getDepartureLatitude();
        this.departureLongitudeDto = summary.getDepartureLongitude();
        this.arrivalLatitudeDto = summary.getArrivalLatitude();
        this.arrivalLongitudeDto = summary.getArrivalLongitude();
        this.travelledDistanceDto = summary.getTravelledDistance();
        this.deltaDistanceDto = summary.getDeltaDistance();
    }

    /**
     * Get the MMSI code associated with a ship
     * @return the MMSI code
     */
    public String getMmsiCodeDto() {
        return mmsiCodeDto;
    }

    /**
     * Get the ships name
     * @return the ship name
     */
    public String getNameDto() {
        return nameDto;
    }


    /**
     * Get the date and time the ship leaves the port where the voyage began
     * @return the date of start of a journey
     */
    public Date getStartBaseDateDto() {
        return startBaseDateDto;
    }

    /**
     * Get the date and time the ship arrives at its port of destination
     * @return the date of arrival in port
     */
    public Date getEndBaseDateDto() {
        return endBaseDateDto;
    }

    /**
     * Get the total time of movements made by a ship in the travel
     * @return the total time of movements
     */
    public String getTotalMovementTimeDto() {
        return totalMovementTimeDto;
    }

    /**
     * Get the total number of movements made by a ship in the travel
     * @return the total number of movements
     */
    public int getTotalMovements() {
        return totalMovementsDto;
    }

    /**
     * Get the maximum speed over ground of a ship
     * @return the maximum speed over ground
     */
    public double getMaximumSogDto() {
        return maximumSogDto;
    }

    /**
     * Get the mean speed over ground of a ship
     * @return the mean speed over ground
     */
    public double getMeanSogDto() {
        return meanSogDto;
    }

    /**
     * Get the maximum course over ground of a ship
     * @return the maximum course over ground
     */
    public double getMaximumCogDto() {
        return maximumCogDto;
    }

    /**
     * Get the mean course over ground of a ship
     * @return the mean course over ground
     */
    public double getMeanCogDto() {
        return meanCogDto;
    }

    /**
     * Get the latitude of the departure of a ship
     * @return the departure latitude
     */
    public String getDepartureLatitudeDto() {
        return departureLatitudeDto;
    }

    /**
     * Get the longitude of the departure of a ship
     * @return the departure longitude
     */
    public String getDepartureLongitudeDto() {
        return departureLongitudeDto;
    }

    /**
     * Get the latitude of the arrival of a ship
     * @return the arrival latitude
     */
    public String getArrivalLatitudeDto() {
        return arrivalLatitudeDto;
    }

    /**
     * Get the longitude of the arrival of a ship
     * @return the arrival longitude
     */
    public String getArrivalLongitudeDto() {
        return arrivalLongitudeDto;
    }

    /**
     * Get the travelled distance of a ship
     * @return the traveled distance
     */
    public double getTravelledDistanceDto() {
        return travelledDistanceDto;
    }

    /**
     * Get the delta distance traveled by a ship
     * @return the delta distance
     */
    public double getDeltaDistanceDto() {
        return deltaDistanceDto;
    }

    /**
     * Textual description of the contents in a summary
     * @return Information that characterizes a summary
     */
    @Override
    public String toString() {
        return String.format("----------* Summary *----------\n " +
                "MMSI Code: %s \n" +
                "Ship name: %s \n" +
                "Start Base Date: %s \n" +
                "End Base Date: %s \n" +
                "Total Movements Time: %s \n" +
                "Total Movements: %d \n" +
                "Maximum Speed Over Ground: %.2f \n" +
                "Mean Speed Over Ground: %.2f \n" +
                "Maximum Course Over Ground: %.2f \n" +
                "Mean Course Over Ground: %.2f \n" +
                "Departure Latitude: %s \n" +
                "Departure Longitude: %s \n" +
                "Arrival Latitude: %s \n" +
                "Arrival Longitude: %s \n" +
                "Travelled Distance: %.2f km\n" +
                "Delta Distance: %.2f km\n"
                , mmsiCodeDto, nameDto, startBaseDateDto, endBaseDateDto, totalMovementTimeDto, totalMovementsDto, maximumSogDto, meanSogDto, maximumCogDto, meanCogDto, departureLatitudeDto, departureLongitudeDto, arrivalLatitudeDto, arrivalLongitudeDto, travelledDistanceDto, deltaDistanceDto

        );


    }
}

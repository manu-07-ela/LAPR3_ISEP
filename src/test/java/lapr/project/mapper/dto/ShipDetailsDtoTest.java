package lapr.project.mapper.dto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShipDetailsDtoTest {

    @Test
    public void getMMSI() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getMMSI(), "211331640");
    }

    @Test
    public void getName() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getName(), "SEOUL EXPRESS");
    }

    @Test
    public void getShipID() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getShipID(), "IMO2113432");
    }

    /*@Test
    public void getEnergyGenerators() {
    }

    @Test
    public void getGeneratorOutput() {
    }*/

    @Test
    public void getCallSign() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getCallSign(), "DHBN");
    }

    @Test
    public void getVesselType() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getVesselType(), 70);
    }

    @Test
    public void getLength() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getLength(), 294,0.0);

    }

    @Test
    public void getWidth() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getWidth(), 32,0.0);

    }

    /*@Test
    public void getCapacity() {
    }*/

    @Test
    public void getDraft() {
        ShipDetailsDto ship1 = new ShipDetailsDto("211331640","SEOUL EXPRESS","IMO2113432","DHBN",70,294,32,13);
        Assert.assertEquals(ship1.getDraft(), 13,0.0);
    }
}
package creational.builder;

public class Boeing extends AircraftBuilder {

    private Aircraft aircraft = new Aircraft();

    @Override
    public void setType() {
        aircraft.aircraftType = "Passenger";
    }

    @Override
    public void setCapacity() {
        aircraft.aircraftCapacity = 180;
    }


    @Override
    public void setMake() {
        aircraft.make = "Boeing";
    }

    @Override
    public Aircraft getAircraft() {
        return aircraft;
    }
}

package creational.builder;

public class F16 extends AircraftBuilder{

    private Aircraft aircraft = new Aircraft();

    @Override
    public void setType() {
        aircraft.aircraftType = "Cargo";
    }

    @Override
    public void setCapacity() {
        aircraft.aircraftCapacity = 20;
    }

    @Override
    public void setMake() {
        aircraft.make = "F16";
    }

    @Override
    public Aircraft getAircraft() {
        return aircraft;
    }


}

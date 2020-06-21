package creational.builder;

public class AircraftDirector {
    public void makeAircraft(AircraftBuilder aircraftBuilder){
        aircraftBuilder.setCapacity();
        aircraftBuilder.setMake();
        aircraftBuilder.setType();
    }
}

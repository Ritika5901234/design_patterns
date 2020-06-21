package creational.builder;

public abstract class AircraftBuilder {
    public abstract void setType();
    public abstract void setCapacity();
    public abstract void setMake();
    public abstract Aircraft getAircraft();
}

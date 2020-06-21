package creational.builder;

public class Aircraft {

    public String aircraftType;
    public Integer aircraftCapacity;
    public boolean isPassengerCarrier;
    public String make;

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Integer getAircraftCapacity() {
        return aircraftCapacity;
    }

    public void setAircraftCapacity(Integer aircraftCapacity) {
        this.aircraftCapacity = aircraftCapacity;
    }

    public boolean isPassengerCarrier() {
        return isPassengerCarrier;
    }

    public void setPassengerCarrier(boolean passengerCarrier) {
        isPassengerCarrier = passengerCarrier;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aircraft{");
        sb.append("aircraftType='").append(aircraftType).append('\'');
        sb.append(", aircraftCapacity=").append(aircraftCapacity);
        sb.append(", isPassengerCarrier=").append(isPassengerCarrier);
        sb.append(", make='").append(make).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

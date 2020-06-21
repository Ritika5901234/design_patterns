package creational.singleton;

public class TestSingleton {

    public static void main(String[] args){
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}

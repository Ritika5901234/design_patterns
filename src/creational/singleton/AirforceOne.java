package creational.singleton;

public class AirforceOne {

    private static AirforceOne onlyInstance;

    //private constructor so only members of this class can access it
    // and this class object cannot be created from anywhere else
    private AirforceOne(){

    }

    public void fly(){
        System.out.println("Airforce one is flying");
    }

    public static AirforceOne getInstance(){
        if(onlyInstance == null){
            onlyInstance = new AirforceOne();
        }
        return onlyInstance;
    }
}

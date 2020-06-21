package creational.builder;

public class TestBuilderPattern {

    public static void main(String[] args){
        MealDirector director = new MealDirector();

        MealBuilder builder = new MexicanMeal();
        director.makeMeal(builder);
        Meal mexicanMeal = builder.getMeal();
        System.out.println(mexicanMeal.toString());

        builder = new Vegmeal();
        director.makeMeal(builder);
        Meal vegMeal = builder.getMeal();
        System.out.println(vegMeal.toString());

        AircraftDirector aircraftDirector = new AircraftDirector();

        AircraftBuilder aircraftBuilder = new Boeing();
        aircraftDirector.makeAircraft(aircraftBuilder);
        Aircraft boeing = aircraftBuilder.getAircraft();
        System.out.println(boeing.toString());

        aircraftBuilder = new F16();
        aircraftDirector.makeAircraft(aircraftBuilder);
        Aircraft f16 = aircraftBuilder.getAircraft();
        System.out.println(f16.toString());

    }



}

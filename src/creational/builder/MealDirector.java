package creational.builder;

public class MealDirector {

    public void makeMeal(MealBuilder mealBuilder){
        mealBuilder.addDrink();
        mealBuilder.addSandwich();
        mealBuilder.addOffer();
        mealBuilder.calculatePrice();
    }
}

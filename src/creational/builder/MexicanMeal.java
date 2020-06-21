package creational.builder;

public class MexicanMeal extends MealBuilder {

    private Meal _meal = new Meal();

    @Override
    public void addSandwich() {
        _meal.sandwich = "Mexican spicy sandwich";
    }

    @Override
    public void addDrink() {
        _meal.drink = "Orange juice";
    }

    @Override
    public void addOffer() {
        _meal.offer = "10% off";
    }

    @Override
    public void calculatePrice() {
        _meal.price = 129;
    }

    @Override
    public Meal getMeal() {
        return _meal;
    }
}

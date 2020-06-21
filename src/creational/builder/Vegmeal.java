package creational.builder;

public class Vegmeal extends MealBuilder {

    private Meal _meal = new Meal();

    @Override
    public void addSandwich() {
        _meal.sandwich = "Veg sandwich";
    }

    @Override
    public void addDrink() {
        _meal.drink = "Coke";
    }

    @Override
    public void addOffer() {
        _meal.offer = "One plus one offer";
    }

    @Override
    public void calculatePrice() {
        _meal.price = 89;
    }

    @Override
    public Meal getMeal() {
        return _meal;
    }
}

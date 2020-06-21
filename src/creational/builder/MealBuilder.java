package creational.builder;

public abstract class MealBuilder {

    public abstract void addSandwich();

    public abstract void addDrink();

    public abstract void addOffer();

    public abstract void calculatePrice();

    public abstract Meal getMeal();
}

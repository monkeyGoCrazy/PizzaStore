package factories;

import materials.*;

/**
 * Created by mengleisun on 1/8/16.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new Dough();
    }
    public Sauce createSauce() {
        return new Sauce();
    }
    public Cheese createCheese() {
        return new Cheese();
    }
    public Veggies[] createVeggies() {
        return new Veggies[4];
    }
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
    public Clams createClam() {
        return new Clams();
    }
}

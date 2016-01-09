package pizzas;

import materials.*;

/**
 * Created by mengleisun on 1/8/16.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    public abstract void prepare();
    public void bake() {
        System.out.println("Backe for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

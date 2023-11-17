/*
 * Created on Thu Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

 package CoffeeFactory;

public class PlainFlavorFactory extends FlavorFactory {

    public Coffee makeLatteMacchiato() {
        return new LatteMacchiato(Flavor.PLAIN);
    }

    public Coffee makeCappuccino() {
        return new Cappuccino(Flavor.PLAIN);
    }

    public Coffee makeDripCoffee() {
        return new DripCoffee(Flavor.PLAIN);
    }
}

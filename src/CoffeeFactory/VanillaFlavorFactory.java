/*
 * Created on Thu Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

package CoffeeFactory;

public class VanillaFlavorFactory extends FlavorFactory {
    public Coffee makeLatteMacchiato() {
        return new LatteMacchiato(Flavor.VANILLA);
    }

    public Coffee makeCappuccino() {
        return new Cappuccino(Flavor.VANILLA);
    }

    public Coffee makeDripCoffee() {
        return new DripCoffee(Flavor.VANILLA);
    }
}
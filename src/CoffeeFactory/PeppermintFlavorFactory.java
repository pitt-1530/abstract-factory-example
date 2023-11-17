/*
 * Created on Thu Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

package CoffeeFactory;

public class PeppermintFlavorFactory extends FlavorFactory {
    public Coffee makeLatteMacchiato() {
        return new LatteMacchiato(Flavor.PEPPERMINT);
    }

    public Coffee makeCappuccino() {
        return new Cappuccino(Flavor.PEPPERMINT);
    }

    public Coffee makeDripCoffee() {
        return new DripCoffee(Flavor.PEPPERMINT);
    }
}

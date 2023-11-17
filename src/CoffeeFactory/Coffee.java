/*
 * Created on Tue Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

package CoffeeFactory;

// Abstract product
public abstract class Coffee {
    protected Flavor flavor;

    public Coffee(Flavor flavor) {
        if (flavor == null) {
            System.out.println("No flavor selected, choosing plain");
            this.flavor = Flavor.PLAIN;
            return;
        }
        this.flavor = flavor;
    }

    public void make() {
        System.out.printf("Making a %s Latte Macchiato ...\n", flavor.getString());
    }
}

// Concrete products
class LatteMacchiato extends Coffee {
    LatteMacchiato(Flavor flavor) {
        super(flavor);
    }
}

class Cappuccino extends Coffee {
    Cappuccino(Flavor flavor) {
        super(flavor);
    }
}

class DripCoffee extends Coffee {
    DripCoffee(Flavor flavor) {
        super(flavor);
    }
}

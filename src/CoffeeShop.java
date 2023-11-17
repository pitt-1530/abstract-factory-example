/*
 * Created on Tue Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

import CoffeeFactory.*;

public class CoffeeShop {
    public static void main(String[] args) {
        FlavorFactory flavorFactory = new VanillaFlavorFactory();

        Coffee latte = flavorFactory.makeLatteMacchiato();
        latte.make();

        Coffee cappuccino = flavorFactory.makeCappuccino();
        cappuccino.make();

        Coffee dripCoffee = flavorFactory.makeDripCoffee();
        dripCoffee.make();
    }
}
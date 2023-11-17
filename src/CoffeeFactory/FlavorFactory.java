/*
 * Created on Tue Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

 package CoffeeFactory;

// Abstract factory
public abstract class FlavorFactory {
    public abstract Coffee makeLatteMacchiato();
    public abstract Coffee makeCappuccino();
    public abstract Coffee makeDripCoffee();
}

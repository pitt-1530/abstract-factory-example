/*
 * Created on Thu Nov 14 2023
 *
 * Copyright (c) 2023 Nadine von Frankenberg
 */

package CoffeeFactory;

public enum Flavor {
    PLAIN("Plain"),
    VANILLA("Vanilla"),
    PEPPERMINT("Peppermint");

    private final String text;

    private Flavor(String flavor) {
        this.text = flavor;
    }

    public String getString() {
        return this.text;
    }
}

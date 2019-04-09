package com.John;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deluxe deluxe = new Deluxe(7.00, "White", "Beef");
        Burger regular = new Burger(5, "White", "Beef", 4);
        HealthyBurger healthy = new HealthyBurger(7, "Veggie");

        regular.addAdditions("Lettuce", .50);
        regular.addAdditions("Tomatoes", .50);
        regular.addAdditions("Onions", .75);
        regular.addAdditions("Pickle", .30);
        regular.addAdditions("Radish", 1);
        regular.getTotal();

        healthy.addAdditions("Lettuce", .50);
        healthy.addAdditions("Tomatoes", .50);
        healthy.addAdditions("Onions", .75);
        healthy.addAdditions("Pickle", .30);
        healthy.addAdditions("Radish", 1);
        healthy.getTotal();

        deluxe.addAdditions("Lettuce", .50);
        deluxe.addAdditions("Tomatoes", .50);
        deluxe.getTotal();
    }

}

package com.John;

public class Deluxe extends Burger {
    public Deluxe(double price, String breadRoll, String meat) {
        super(price, breadRoll, meat, 0);
    }

    public void addAdditions() {
        System.out.println("Fries and drink are added  to the meal for " + 2.75);
        this.setTotal(this.getTotal() + 2.75);
    }
}

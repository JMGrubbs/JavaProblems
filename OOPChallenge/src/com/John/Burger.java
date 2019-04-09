package com.John;

public class Burger {

    private String name;
    private double price;
    private String breadRoll;
    private String meat;
    private int additions;
    private double total;


    public Burger(double price, String breadRoll, String meat, int additions) {
        this.name = "Burger";
        this.price = 5.00;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.additions = additions;
        this.total = 5.00;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addAdditions(String addition, double price) {
        if(additions > 0){
            this.additions = this.additions - 1;
            System.out.println("Added " + addition + " to your burger for a price of " + price);;
            this.total = this.total + price;
        }else{
            System.out.println("You cont add anymore to this burger.:(");
        }
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public int getAdditions() {
        return additions;
    }

    public double getTotal() {
        System.out.println("The total for a "+ this.name + " is " + this.total);
        return total;
    }
}

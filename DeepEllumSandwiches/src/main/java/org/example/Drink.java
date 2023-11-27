package org.example;

public enum Drink {

    SMALL("Small", 2.00),
    MEDIUM("Medium", 2.50),
    LARGE("Large", 3.00);



    private String size;
    private double price;


    Drink(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}

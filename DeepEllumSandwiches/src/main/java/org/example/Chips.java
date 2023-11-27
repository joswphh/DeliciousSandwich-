package org.example;

public enum Chips {
    BBQ("BQQ", 1.50),
    PLAIN("Plain", 1.50),
    PICKLE("Pickle", 1.50),
    HOT("Hot", 1.50);


    private String chipType;
    private double chipPrice;

    Chips(String chipType, double chipPrice) {
        this.chipType = chipType;
        this.chipPrice = chipPrice;
    }

    public String getChipType() {
        return chipType;
    }

    public double getChipPrice() {
        return chipPrice;
    }
}

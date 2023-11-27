package org.example;

public enum BreadType {
    WHITE("White", 5.50),
    WHEAT("wheat", 5.50),
    RYE("Rye", 5.50),
    WRAP("Wrap", 5.50);
    private String breadType;
    private double breadBasePrice;


    BreadType(String breadType, double breadBasePrice) {
        this.breadType = breadType;
        this.breadBasePrice = breadBasePrice;
    }

    public String getBreadName(){
        return breadType;
    }


    public double getBreadPrice(){
        return breadBasePrice;
    }


}

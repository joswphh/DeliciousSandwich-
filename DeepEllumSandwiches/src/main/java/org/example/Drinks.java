package org.example;

 SandwichUpdate
public class Drinks extends Items {
    private DrinkType drinkSize;
    private DrinkOptions drinkFlavor;

    public Drinks(String name, double price, DrinkType drinkSize, DrinkOptions drinkFlavor) {
        super(name, price);
        this.drinkSize = drinkSize;
        this.drinkFlavor = drinkFlavor;
    }


    public DrinkType getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(DrinkType drinkSize) {
        this.drinkSize = drinkSize;
    }

    public DrinkOptions getDrinkFlavor() {
        return drinkFlavor;
    }

    public void setDrinkFlavor(DrinkOptions drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
    }
}
=======
public enum Drinks{

    SMALL("Small", 2.00),
    MEDIUM("Medium", 2.50),
    LARGE("Large", 3.00);



    private final String size;
    private final double price;


    Drinks(String size, double price) {
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
 master

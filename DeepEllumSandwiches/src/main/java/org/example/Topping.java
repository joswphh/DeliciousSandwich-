package org.example;

public enum Topping {


    //Free toppings
    LETTUCE("Lettuce", 0.0, ToppingType.REGULAR),
    PEPPER("Pepper", 0.0, ToppingType.REGULAR),
    ONIONS("Onions", 0.0, ToppingType.REGULAR),
    TOMATOES("Tomatoes", 0.0, ToppingType.REGULAR),
    JALAPENOS("Jalapenos", 0.0, ToppingType.REGULAR),
    CUCUMBERS("Cucumbers", 0.0, ToppingType.REGULAR),
    PICKLES("Pickles", 0.0, ToppingType.REGULAR),
    GUACAMOLE("Guacamole", 0.0, ToppingType.REGULAR),
    MUSHROOMS("Mushrooms", 0.0, ToppingType.REGULAR),
    STEAK("Steak", 1.00, ToppingType.PREMIUM),
    HAM("Ham", 1.0, ToppingType.PREMIUM),
    SALAMI("Salami", 1.0, ToppingType.PREMIUM),
    ROAST_BEEF("Roast beef" , 1.0, ToppingType.PREMIUM),
    BACON("Bacon", 1.0, ToppingType.PREMIUM),
    CHICKEN("Chicken", 1.0, ToppingType.PREMIUM),
    AMERICAN("American", 0.75, ToppingType.PREMIUM),
    PROVOLONE("Provolone", 0.75, ToppingType.PREMIUM),
    CHEDDAR("Cheddar", 0.75, ToppingType.PREMIUM),
    SWISS("Swiss", 0.75, ToppingType.PREMIUM),
    EXTRA_MEAT("Extra meat",.50, ToppingType.PREMIUM),
    EXTRA_CHEESE("Extra cheese", .30, ToppingType.PREMIUM);



    private  String toppingName;
    private final double toppingPrice;
    private final ToppingType toppingType;
    Topping(String toppingName, double toppingPrice, ToppingType toppingType) {
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
        this.toppingType = toppingType;
    }

    public String getName(){
        return toppingName;
    }

    public double getPrice(SandwichSize sandwichSize){
        double total = toppingPrice;
        if(sandwichSize == SandwichSize.EIGHT_INCH){
            total *= 2.00;
        } else if (sandwichSize == SandwichSize.TWELVE_INCH){
            total *= 3.0;
        }
        return total;
    }

    public ToppingType getToppingType(){
        return toppingType;
    }




}

package org.example;

import java.util.Scanner;

public class UserInterface {
    public void display() {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("Welcome to Deep Ellum Sandwiches! What would you like to do?");
            System.out.println("1) Make a new Order");
            System.out.println("0) Exit");

            Scanner banner = new Scanner(System.in);
            int userInput = banner.nextInt();

            switch (userInput) {
                case 1:
                    //make a new order
                    processMakeNewOrder();


                case 0:
                    System.exit(0);
                    break;

            }

            }
        }

    private void processMakeNewOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here is the order screen! Select a number");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");

        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                processAddSandwich();
                break;
            case 2:
                processAddDrink();
                break;
            case 3:
                processAddChips();
                break;
            case 4:
                processCheckout();
                break;
            case 0:
                System.out.println("You have canceled your order! We will go back to the home screen!");
                break;


        }
    }

    private void processAddSandwich() {

    }

    private void processAddDrink() {

    }

    private void processAddChips() {

    }

    private void processCheckout() {

    }

}


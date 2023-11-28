package org.example;

public enum Sauce {
    MAYO("Mayo"),
    MUSTARD("Mustard"),
    KETCHUP("Ketchup"),
    RANCH("Ranch"),
    THOUSAND_ISLAND("Thousand island"),
    VINAIGRETTE("Vinaigrette");

    private String sauce;

    Sauce(String sauce) {
        this.sauce = sauce;
    }
}

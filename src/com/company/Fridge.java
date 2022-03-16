package com.company;

public class Fridge extends Device{
    private char energyRating;
    public Fridge(Colors color, double price, String brand, char energyRating) throws NoBrand {
        super(color, price, brand);
        this.energyRating = energyRating;
    }
    public char getEnergyRating() {
        return energyRating;
    }
    protected void action() {
        System.out.println("I am cooling your food");
    }
}

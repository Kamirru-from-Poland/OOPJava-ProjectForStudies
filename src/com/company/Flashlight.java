package com.company;

public class Flashlight extends MobileDevice{
    public Flashlight(Colors color, double price, String brand) throws NoBrand {
        super(color, price, brand);
    }
    protected void action() {
        System.out.println("It shines brightly");
    }
}

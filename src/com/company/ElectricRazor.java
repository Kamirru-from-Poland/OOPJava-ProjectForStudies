package com.company;

public class ElectricRazor extends MobileDevice{
    public ElectricRazor(Colors color, double price, String brand) throws NoBrand {
        super(color, price, brand);
    }
    protected void action() {
        System.out.println("It shaves");
    }
}
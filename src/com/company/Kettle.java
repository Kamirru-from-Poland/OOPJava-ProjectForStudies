package com.company;

public class Kettle extends Device{
    private float capacity;
    public Kettle(Colors color, double price, String brand, float capacity) throws NoBrand {
        super(color, price, brand);
        this.capacity = capacity;
    }
    public float getCapacity() {
        return capacity;
    }
    protected void action() {
        System.out.println("The water is boiled");
    }
}

package com.company;

import java.util.Locale;

class Device{
    public Device(Colors color, double price, String brand) throws NoBrand{
        this.color = color;
        this.price = price;
        if(brand.length()==0){
            throw new NoBrand();
        }
        this.brand = brand;
    }
    private Colors color;
    private double price;
    private String brand;
    private Boolean powerOn = false;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Colors getColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }
    void tryAction(){
        if(isRunning()){
            action();
        }
        else {
            System.out.println("First, turn on your device.");
        }
    }
    protected void action() {
            System.out.println("Work! Work!");
    }
    public Boolean isRunning() {
        return powerOn;
    }
    public void powerSwitch() {
        this.powerOn = !this.powerOn;
    }
    @Override
    final public String toString() {
        return "\nThe "+ color.toString().toLowerCase(Locale.ROOT) +" device from "+ brand +" costs $" +(String.format("%,.2f%n",price));
    }
}

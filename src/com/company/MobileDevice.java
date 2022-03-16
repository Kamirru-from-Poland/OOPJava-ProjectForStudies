package com.company;

class MobileDevice extends Device{
    public MobileDevice(Colors color, double prize, String brand) throws NoBrand {
        super(color, prize, brand);
    }
    @Override
    void tryAction(){
        if(isRunning()){
            batteryUssing();
        }
        else {
            System.out.println("First, turn on your device.");
        }
    }
    public String getBatteryPercentage() {
        return (batteryPercentage+"%");
    }
    private int batteryPercentage=20;
    protected void charge(){
        this.batteryPercentage=100;
    }
    protected void batteryUssing(){
        if (batteryPercentage>=10){
            this.batteryPercentage-=10;
            action();
        }
        else {
            System.out.println("\nThe device can not run without energy!\n Please charge it to perform an action.");
        }
    }
}

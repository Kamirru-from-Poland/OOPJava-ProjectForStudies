package com.company;

public class Computer extends Device{
    public Computer(Colors color, double prize, String brand, int ram, int capacity, double processorFrequency, int processorCores, int processorThreads) throws NoBrand {
        super(color, prize, brand);
        this.ram = ram;
        this.capacity = capacity;
        this.processorFrequency = processorFrequency;
        this.processorCores = processorCores;
        this.processorThreads = processorThreads;
    }
    private int ram;
    private int capacity;
    private double processorFrequency;
    private int processorCores;
    private int processorThreads;
    public int getRam() {
        return ram;
    }
    public int getCapacity() {
        return capacity;
    }
    public double getProcessorFrequency() {
        return processorFrequency;
    }
    public int getProcessorCores() {
        return processorCores;
    }
    public int getProcessorThreads() {
        return processorThreads;
    }
    @Override
    protected void action() {
        for (int i=0; i<=100; i+=20){
            System.out.printf("\nWorking on updates %d%%\nDon't turn off your PC. This will take a while\n\nYour PC will restart several times.",i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
    class Arduino{
        void action() {
            System.out.println("\nArduino does not support Windows.\nHowever, you can find out the weather with weather station.");
        }
        public void whatIsTheWeather(){
            System.out.println("\nThe weather is: Sensor error!");
        }
    }
}

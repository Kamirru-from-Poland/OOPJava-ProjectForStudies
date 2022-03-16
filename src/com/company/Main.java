package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Kettle smallKettle = new Kettle(Colors.WHITE, 25.99,"Russell Hobbs",1.2f);
            System.out.println(smallKettle.toString());
            smallKettle.tryAction();
            smallKettle.powerSwitch();
            smallKettle.tryAction();
            Fridge grayFridge = new Fridge(Colors.GREY, 230,"Sharp",'B');
            grayFridge.powerSwitch();
            grayFridge.tryAction();
            Flashlight pocketFlashlight = new Flashlight(Colors.RED, 2.4,"Fenix");
            pocketFlashlight.powerSwitch();
            System.out.println(pocketFlashlight.getBatteryPercentage());
            pocketFlashlight.tryAction();
            System.out.println(pocketFlashlight.getBatteryPercentage());
            pocketFlashlight.tryAction();
            System.out.println(pocketFlashlight.getBatteryPercentage());
            pocketFlashlight.tryAction();
            System.out.println(pocketFlashlight.getBatteryPercentage());
            pocketFlashlight.charge();
            System.out.println(pocketFlashlight.getBatteryPercentage());
            pocketFlashlight.tryAction();
            pocketFlashlight.tryAction();
            pocketFlashlight.tryAction();
            pocketFlashlight.tryAction();
            System.out.println(pocketFlashlight.getBatteryPercentage());
            ElectricRazor noiseElectricRazor = new ElectricRazor(Colors.BLACK,75,"Philips");
            noiseElectricRazor.powerSwitch();
            noiseElectricRazor.tryAction();
            System.out.println(noiseElectricRazor.toString());
            Computer pc = new Computer(Colors.BLACK,1000,"DELL",8,1024,4.4,4,8);
            pc.powerSwitch();
            System.out.println(pc.toString());
            pc.tryAction();
            Computer professorsComputer = new Computer(Colors.MESMERIZING,999999999.99,"Toshiba",256,4096,5.3,8,16){
                @Override
                protected void action(){
                    System.out.println("\nExam answers:\n1.A 2.A 3.C 4.D 5.A 6.C 7.A 8.B");
                }
            };
            professorsComputer.powerSwitch();
            professorsComputer.tryAction();
            System.out.printf("Professor computer has a %dGB RAM",professorsComputer.getRam());
            if(professorsComputer instanceof Device){
                System.out.println("\nThe professor's computer is also a device :)");
            }
            Computer.Arduino pcArduino = pc.new Arduino();
            pcArduino.action();
            pcArduino.whatIsTheWeather();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Computer bugTester = new Computer(Colors.RUSTY,0,"",0,0,0,0,0);
            System.out.println("If my exception catch a bug this will not show at all");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package coffeeMachine;

import java.util.Scanner;

public class Calculate {

    final private static int waterInCoffee = 200;
    final private static int milkInCoffee = 50;
    final private static int beansInCoffee = 15;

    private static int mlOfWaterInMachine;
    private static int mlOfMilkInMachine;
    private static int gramsOfCoffeInMachine;
    private static int numberOfCupsNeeded;
    private static int cupsIcanPrepare;

    public static void main(String[] args) {

        getResourcesAndOrder();
        cupsIcanPrepare = howManyCupsCanBeProduced(mlOfWaterInMachine, mlOfMilkInMachine, gramsOfCoffeInMachine);
        produceResponse (cupsIcanPrepare, numberOfCupsNeeded);
    }

    private static void produceResponse(int cupsIcanPrepare, int numberOfCupsNeeded) {

        if (cupsIcanPrepare == numberOfCupsNeeded) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (numberOfCupsNeeded > cupsIcanPrepare) {
            System.out.println("No, I can make only " + cupsIcanPrepare + " cup(s) of coffee");
        } else if (cupsIcanPrepare > numberOfCupsNeeded) {
            int additionalCoffies = cupsIcanPrepare - numberOfCupsNeeded;
            System.out.println("Yes, I can make that amount of coffee (and even " + additionalCoffies + " more than that)");
        }

    }

    private static void getResourcesAndOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        mlOfWaterInMachine = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        mlOfMilkInMachine = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        gramsOfCoffeInMachine = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        numberOfCupsNeeded = scanner.nextInt();


        Scanner scanner2 = new Scanner(System.in);
        String shape = scanner2.nextLine();


        switch (shape){
            case "triangle":
                double aT = scanner2.nextDouble();
                double bT = scanner2.nextDouble();
                double cT = scanner2.nextDouble();

                double s=(aT+bT+cT)/2;
                double area = Math.sqrt(s*(s-aT)*(s-bT)*(s-cT));

                System.out.println(area);

                break;
            case "rectangle":
                double aR = scanner2.nextDouble();
                double bR = scanner2.nextDouble();

                System.out.println(aR*bR);

                break;
            case "circle":
                double rR = scanner2.nextDouble();
                System.out.println(3.14*(rR*rR));

                break;
            default:
                System.out.println("Unknown shape");
        }



    }

    private static int howManyCupsCanBeProduced(int mlOfWater, int mlOfMilk, int gramsOfCoffee) {
        int cupsCounter =0;

        while (mlOfWater >= waterInCoffee && mlOfMilk >= milkInCoffee && gramsOfCoffee >= beansInCoffee) {

            mlOfWater -= waterInCoffee;
            mlOfMilk -= milkInCoffee;
            gramsOfCoffee -= beansInCoffee;
            cupsCounter++;
        }

        return cupsCounter;

    }


}

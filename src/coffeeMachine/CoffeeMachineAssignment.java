package coffeeMachine;
import java.util.Scanner;

public class CoffeeMachineAssignment {

    private static int mlOfWaterInMachine = 400;
    private static int mlOfMilkInMachine = 540;
    private static int gramsOfCoffeeInMachine = 120;
    private static int disposableCupsInMachine = 9;
    private static int cashInMachine = 550;

    private static int waterNeededForChosenCoffee;
    private static int coffeeBeansNeededForChosenCoffee;
    private static int milkNeededForChosenCoffee;
    private static int priceOfChosenCoffee;

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        callToAction();
    }


    private static void redirectChoice(String userChoice) {

        switch (userChoice) {

            case "buy": {
                buy();
                break;
            }

            case "fill": {
                fill();
            break;
            }

            case "take": {
                take();
            break;
            }

            case "remaining": {
                presentCoffeeMachineState();
                break;
            }

            case "exit": {
                break;
            }

            default: {
                System.out.println("sorry I did not get that");
            }

        }
    }

    private static void take() {
        System.out.println("I gave you " + "$" + cashInMachine);
        cashInMachine = 0;
        callToAction();
    }

    private static void fill() {

        System.out.println("Write how many ml of water do you want to add:");
        mlOfWaterInMachine += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add: ");
        mlOfMilkInMachine += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        gramsOfCoffeeInMachine += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCupsInMachine += scanner.nextInt();

        callToAction();

    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeTypeOrBack = scanner.next();


        switch (coffeeTypeOrBack) {

            case "1": {

                waterNeededForChosenCoffee = 250;
                milkNeededForChosenCoffee = 0;
                coffeeBeansNeededForChosenCoffee = 16;
                priceOfChosenCoffee = 4;
                break;
                }

                case "2": {

                    waterNeededForChosenCoffee = 350;
                    milkNeededForChosenCoffee = 75;
                    coffeeBeansNeededForChosenCoffee = 20;
                    priceOfChosenCoffee = 7;
                    break;

                }

                case "3": {


                    waterNeededForChosenCoffee = 200;
                    milkNeededForChosenCoffee = 100;
                    coffeeBeansNeededForChosenCoffee = 12;
                    priceOfChosenCoffee = 6;
                    break;
                }

                case "back": {

                    break;
                }


                default: {
                    System.out.println("dont know how to make this one");
                    break;
                }
            }


            if (checkWater() && checkMilk() && checkBeans() && checkCups() && !coffeeTypeOrBack.equals("back") )
            {
                mlOfWaterInMachine -= waterNeededForChosenCoffee;
                mlOfMilkInMachine -= milkNeededForChosenCoffee;
                gramsOfCoffeeInMachine -= coffeeBeansNeededForChosenCoffee;
                disposableCupsInMachine -= 1;
                cashInMachine += priceOfChosenCoffee;
                System.out.println("I have enough resources, making you a coffee!\n");
                callToAction();
            } else {
                callToAction();
            }

        }

    private static boolean checkCups() {
        if (disposableCupsInMachine > 0){
            return true;
        } else
        {
            System.out.println("Sorry, not enough disposable cups!");
//            callToAction();
            return false;
        }
    }

    private static boolean checkBeans() {
        if (coffeeBeansNeededForChosenCoffee <= gramsOfCoffeeInMachine){
            return true;
        } else
        {
            System.out.println("Sorry, not enough coffee beans!");
//            callToAction();
            return false;
        }
    }

    private static boolean checkMilk() {
        if (milkNeededForChosenCoffee <= mlOfMilkInMachine){
            return true;
        } else
        {
            System.out.println("Sorry, not enough milk!");
//            callToAction();
            return false;
        }
    }

    private static boolean checkWater() {
        if (waterNeededForChosenCoffee <= mlOfWaterInMachine){
            return true;
        } else
        {
            System.out.println("Sorry, not enough water!");
//            callToAction();
            return false;
        }
    }


    private static void callToAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String userChoice = scanner.next();
        redirectChoice (userChoice);
    }

    private static void presentCoffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(mlOfWaterInMachine + " of water");
        System.out.println(mlOfMilkInMachine + " of milk");
        System.out.println(gramsOfCoffeeInMachine + " of coffee beans");
        System.out.println(disposableCupsInMachine + " of disposable cups");
        System.out.println("$" + cashInMachine + " of money");
        System.out.println();

        callToAction();

    }

}
package coffeeMachine;

import java.util.Scanner;


public class BusTour {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridgesToCheck = scanner.nextInt();
        boolean allBridgesAreSafe = true;

            for (int i = 0; i < numberOfBridgesToCheck; i++) {

                    int bridgeHeight = scanner.nextInt();

                    if (bridgeHeight <= busHeight) {
                        System.out.println();
                        System.out.println("Will crash on bridge " + (i + 1));
                        allBridgesAreSafe = false;
                        scanner.close();
                        break;
                    }
                }



                if (allBridgesAreSafe) {System.out.println("Will not crash");}




        }

    }


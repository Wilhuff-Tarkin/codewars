package coffeeMachine;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            int natural = scanner.nextInt();

            if (natural != 0) {
                if (natural % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                break;
            }

        }
    }
}
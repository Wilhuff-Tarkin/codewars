package coffeeMachine;

import java.util.Arrays;
import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int given = scanner.nextInt();
        int tmp = given;
        System.out.print(tmp + " ");

        while (tmp != 1) {

            given = tmp;
            if (given % 2 == 0){
                tmp = given / 2;
            } else {
                tmp = given * 3 + 1;
            }

            System.out.print(tmp + " ");

            int[] numbers; // initialize the array

            numbers = new int[]{12, 17, 8, 101, 33};

            System.out.println(Arrays.toString(numbers));
        }
    }
}

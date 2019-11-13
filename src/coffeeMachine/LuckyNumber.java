package coffeeMachine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String base = scanner.nextLine();

        int [] baseArray = new int [base.length()];

        for (int i = 0; i < base.length(); i++) {
            baseArray[i] = Integer.valueOf(base.charAt(i))-48;
        }

        int halfOfTheArray = base.length()/2;

        int counterFristHalf = 0;
        int counterSecondHalf = 0;

        for (int i = 0; i < baseArray.length ; i++) {

            if (i<halfOfTheArray){
                counterFristHalf += baseArray[i];
            } else {
                counterSecondHalf += baseArray[i];
            }
        }

        if (counterFristHalf == counterSecondHalf) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}

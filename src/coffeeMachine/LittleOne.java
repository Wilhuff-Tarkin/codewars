package coffeeMachine;

import java.util.Scanner;

public class LittleOne {
    public static void main(String[] args) {
        char ch = '1' + '3';
        System.out.println("ch = " + ch);

        for (int i = 0; i <= 9; i++) {
            System.out.print(" " + i);
        }

        System.out.println();

        int startIncl = 1;
        int endExcl = 11;
        int sum = 0;

        for (int i = startIncl; i < endExcl; i++) {
            sum += i;
        }

        System.out.println(sum);

        for (int i = 0; i < 5; i++) {

        }

        Scanner scanner = new Scanner(System.in);

//        int a1 = scanner.nextInt();
//        int b1 = scanner.nextInt();
//        int n1 = scanner.nextInt();
//        int counter = 0;
//
//        for (int i = a1; i <= b1; i++) {
//            if (i % n1 == 0) {
//                counter++;
//            }
//        }
//        System.out.println(counter);



        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result = 1;

        for (int i = a; i < b ; i++) {

                result *= i;
            }

        System.out.println(result);

        }



    }








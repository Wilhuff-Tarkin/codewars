package coffeeMachine;

import java.util.Scanner;

public class TheOrderedSequence {

    public static void main(String[] args) {

//        9 8 7 6 5 4 3 2 1 0

        Scanner scanner = new Scanner(System.in);
        boolean isAscending = false;
        boolean isDescending = false;

        int tmp;
        int tmp2;
        int lastHighest = 0;
        int lastLowest = 0;
        int iterationCounter = 1;
        do{

                tmp = scanner.nextInt();
                if (tmp == 0){
                break;
                }
                tmp2 = scanner.nextInt();
                if (tmp2 == 0) {
                    if (iterationCounter == 1) {
                        System.out.println("true");
                        break;
                    }


                    break;
                }

                if (iterationCounter == 1) {

                    if (tmp > tmp2) {
                        lastHighest = tmp;
                        lastLowest = tmp2;
                    } else {
                        lastHighest = tmp2;
                        lastLowest = tmp;
                    }
                iterationCounter++;
                }


            if (tmp >= tmp2 && tmp2 <= lastLowest) {
                if (tmp2 != 0) {
                    isDescending = true;
                    lastLowest = tmp2;

                }

            } else if (tmp2 >= tmp && tmp2 >= lastHighest){
                isAscending = true;
                lastHighest = tmp2;

            } else {
                isAscending = false;
                isDescending = false;
            }

        } while (tmp != 0 || tmp2 != 0);

//        System.out.println("asc " + isAscending);
//        System.out.println("dsc " + isDescending);
        if (iterationCounter!=1) {
            System.out.println(isAscending ^ isDescending);
        }
        }

}


//  MUCH BETTER SOLUTION:


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        long num = sc.nextLong();
//        long old;
//
//        boolean rordered = true;
//        boolean lordered = true;
//
//        while (true) {
//            old = num;
//            num = sc.nextLong();
//
//            if (num == 0) {
//                break;
//            }
//
//            if (rordered && num < old) {
//                rordered = false;
//                continue;
//            }
//
//            if (lordered && num > old) {
//                lordered = false;
//                continue;
//            }
//
//            if (!rordered && !lordered) {
//                break;
//            }
//        }
//
//        System.out.println(lordered || rordered);
//    }

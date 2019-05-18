/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a
single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

 */

public class FindTheParityOutlier {

    static int find(int[] integers){

        int outlier = 0;

        if (checkIfArrayContainEvenValues(integers)){
            outlier = findOdd(integers);
        } else {
            outlier = findEven(integers);
        }

        return outlier;
    }

    private static boolean checkIfArrayContainEvenValues(int[] tab) {
        int counter = 0;

        for (int i = 0; i < 2; i++) {
            if (tab [i] % 2 == 0){
                counter++;
            }
        }

        return counter >= 2;
        //if there are at least two even values under first three indexes
    }


    private static int findEven(int[] tab) {

        int result = 0;

        for (int i : tab){
            if (i % 2 == 0){
                result = i;
            }
        }
        return result;
    }

    private static int findOdd(int[] tab) {

        int result = 0;

        for (int i : tab){
            if (i % 2 != 0){
                result = i;
            }
        }
        System.out.println("result = " + result);
        return result;

    }

    public static void main(String[] args) {

        int [] tab = {2, 2, 1};
        find(tab);

    }
}

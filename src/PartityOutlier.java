//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//        The array is either entirely comprised of odd integers or entirely comprised of even integers except for
//        a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.


public class PartityOutlier {

    static int find(int[] integers){

        int outlier = 0;

        if (isThisArrayOfEvenValues(integers)){
            outlier = findOdd(integers);
        } else {
            outlier = findEven(integers);
        }

        return outlier;
    }

    private static boolean isThisArrayOfEvenValues(int[] tab) {
        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i < 3; i++) {
            if (tab[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("evenCounter " + evenCounter);
        System.out.println("oddCounter " + oddCounter);

        return evenCounter>oddCounter;

    }


    private static int findEven(int[] tab) {

        int result = 0;

        for (int i : tab){
            if (i % 2 == 0){
                result = i;
            }
        }

        System.out.println("result = " + result);
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
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {11,13,1,-19,4};
        int[] exampleTest3 = {11,13,1,-19,4};
        find(exampleTest2);
    }


}


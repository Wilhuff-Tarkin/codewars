/*
Given an array, find the int that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */



public class FindOddInt {
    public static int findIt(int[] array) {
        for (int i : array){
            int x = i;
            int count = 0;

            for(i = 0; i < array.length; i++)

             {
                if (array[i] == x)
                {
                    count++;
                }
            }
            System.out.println("count = " + count);
            if (count % 2 != 0) {
                return x;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        int [] tab = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(findIt(tab));
    }


}
/*

In this little assignment you are given a string of space separated numbers,
and have to return the highest and lowest number.

Output string must be two numbers separated by a single space, and highest number is first.


 */


import java.util.Arrays;

public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        String [] arraysOfStrings = numbers.split(" ");
        int [] arraysOfIntegers = new int [arraysOfStrings.length];

        for (int i = 0; i < arraysOfIntegers.length; i++) {
            arraysOfIntegers[i] = Integer.parseInt(arraysOfStrings[i]);
        }

        Arrays.sort(arraysOfIntegers);
        int highest = arraysOfIntegers[arraysOfIntegers.length-1];
        int lowest = arraysOfIntegers[0];

        return highest + " " + lowest;
    }

    public static void main(String[] args) {
        System.out.println(HighAndLow("34 4 6 1 2 3 4 5"));
    }


}

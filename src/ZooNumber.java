import java.util.Arrays;

public class ZooNumber {
    public static int missing (int [] numbers){
            Arrays.sort(numbers);
            int n = numbers [numbers.length-1]; //max value in array

            if (numbers.length == 0) return 1; //if array is empty
            if (numbers [numbers.length-1] == numbers.length)  return n + 1;   //if value at last index equals numbers length missing element must by next (n+1)

            for (int i = numbers.length-1 ; i >= 0 ; i--) { //iterating from the last index to the first
                if (numbers [i] == n ){           //iterating from max value (last index) to 0, looking for missing element, if found - return n
                    n--;
                } else return n;
            }

            return n;
    }

    public static void main(String[] args) {

        System.out.println(missing(new int[] {1, 3, 4})); // 2
        System.out.println(missing(new int[] {1, 2, 3})); // 4
        System.out.println(missing(new int[] {4, 2, 3})); // 1
    }

}

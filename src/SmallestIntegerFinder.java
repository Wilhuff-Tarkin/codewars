import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
   // int result;
    Arrays.sort(args);
    int result = args [0];

    return result;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78,56,-2,12,8,-33}));
    }

}
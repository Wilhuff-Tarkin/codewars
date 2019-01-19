import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {
        sortDesc(74985);
    }

    public static int sortDesc(final int num){
        String numToString = String.valueOf(num);
        char[] toCharArray = numToString.toCharArray();
        Arrays.sort(toCharArray);
        int[] array = new int[toCharArray.length];

        for (int i = toCharArray.length - 1; i >= 0; i--)
            array[toCharArray.length-i-1] = (int) toCharArray[i];

        for (int j = array.length - 1; j >= 0; j--)
            array [j] = array [j] - 48;

        StringBuilder strNum = new StringBuilder();

        for (int val : array)
        {
            strNum.append(val);
        }
        int result = Integer.parseInt(strNum.toString());
        System.out.println(result);

        return result;
    }
}

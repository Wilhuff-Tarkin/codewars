import java.util.Arrays;

public class SpojWyrrek {

    public static String [] wyrrek (String [] args, String [] reverse, int counter){

        if (counter < args.length) {
            if (reverse[counter] == null) {
                reverse[counter] = args[args.length - counter - 1];
                counter++;
                wyrrek(args,reverse, counter);
            }
        }

        return reverse;
    }


    public static void main (String[] args) {
        int counter = 0;
        String [] initialArray = {"test1", "test2", "test3"};
        String [] reverse = new String[initialArray.length];
        String [] result = wyrrek(initialArray, reverse, counter);
        System.out.println(Arrays.toString(result));
    }
}

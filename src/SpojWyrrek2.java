import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpojWyrrek2 {

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


    public static List <String> listCreator (String tmp){
        List<String> userInput = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        userInput.add(tmp);

        if (scanner.hasNextLine())
            listCreator(scanner.nextLine());

    return userInput;
    }

    public static void main (String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()){
            listCreator(scanner.nextLine());
        }



    //    String [] initialArray = userInput.toArray(new String[userInput.size()]);
//        String [] reverse = new String[initialArray.length];
//        String [] result = wyrrek(initialArray, reverse, counter);
//        System.out.println(Arrays.toString(result));
    }
}

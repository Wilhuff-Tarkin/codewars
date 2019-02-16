import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpojWyrrek3 {

    public static List<String> listCreator (String tmp, List <String> userInput){
        Scanner scanner = new Scanner(System.in);
        userInput.add(tmp);

        if (scanner.hasNextLine()){
            listCreator(scanner.nextLine(), userInput);}

        return userInput;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userInput = new LinkedList<>();


        if (scanner.hasNextLine()){
            listCreator(scanner.nextLine(), userInput);
        }
        scanner.close();


    }

}

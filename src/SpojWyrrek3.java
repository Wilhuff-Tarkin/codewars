import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpojWyrrek3 {

    public static void odwracam (List <String> lista){

        if (!lista.isEmpty()){
            int ostatni = ((lista.size())-1);
            System.out.println(lista.get(ostatni));
            lista.remove(ostatni);
            odwracam(lista);

        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userInput = new LinkedList<>();


        while (scanner.hasNextLine()){
            userInput.add(scanner.nextLine());
        }
        scanner.close();

        odwracam(userInput);
    }

}

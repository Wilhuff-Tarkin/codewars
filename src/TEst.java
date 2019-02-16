import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int rowsOfText = scanner.nextInt();
        arrayCreator(rowsOfText);
    }

    public static void arrayCreator(int rows){
        Scanner scanner = new Scanner(System.in);

        String [] tab = new String[rows];

        for (int i = 0; i < rows ; i++) {
            tab [i] = scanner.nextLine();
        }

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length(); j++) {
                char c = tab[i].charAt(j);
                if (map.containsKey(c)) {
                    int counter = map.get(c);
                    map.put(c, ++counter);
                } else {
                    map.put(c, 1);
                }
            }
        }

        char c;

        for(c = 'a'; c <= 'z'; ++c)
            if (map.containsKey(c)){
                System.out.println(c + " " + map.get(c).intValue());
            }

        for(c = 'A'; c <= 'Z'; ++c)
            if (map.containsKey(c)){
                System.out.println(c + " " + map.get(c).intValue());
            }
    }
}
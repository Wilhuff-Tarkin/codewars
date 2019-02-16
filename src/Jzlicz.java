import java.util.*;

public class Jzlicz {

    public static void sorter(Map<Character, Integer> map){

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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsOfText = scanner.nextInt()+1;
        String [] tab = new String[rowsOfText];
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < rowsOfText ; i++) {
            tab [i] = scanner.nextLine();
        }

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

        sorter(map);
    }
}

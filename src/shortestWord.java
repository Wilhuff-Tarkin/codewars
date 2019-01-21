import java.util.Arrays;
import java.util.Comparator;

public class shortestWord {
    public static int findShort(String s) {
        String [] words;
        words = s.split("\\s+");
        Arrays.sort(words, Comparator.comparingInt(String::length));

        return words[0].length();
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));

    }
}

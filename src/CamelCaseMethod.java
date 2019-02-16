import java.util.Arrays;

public class CamelCaseMethod {

    public static String camelCase (String str){

        if (str.isEmpty()) return "";
        String [] tab = str.split(" ");

        for (int i = 0; i < tab.length ; i++) {
            if (tab[i].isEmpty()) continue;
            String asProvided = tab[i];
            String capitalized = asProvided.substring(0, 1).toUpperCase() + asProvided.substring(1);
            tab [i] = capitalized;
        }

        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < tab.length; i++) {
            stb.append(tab[i]);
        }

        return stb.toString();
    }

    public static void main(String[] args) {

        System.out.println(camelCase("jestem  takim sobie stringiem"));

    }
}

//Your task is to write a function that takes a string and return a new string with all vowels removed.

public class DisemvowelTrolls {

    public static String disemvowel(String str) {

       String disemvoweled = str.replaceAll("[aAeEiIoOuU]", "");
        return disemvoweled;
        }

    public static void main(String[] args) {
        System.out.println(disemvowel("trolololo bim dunba"));
    }
}

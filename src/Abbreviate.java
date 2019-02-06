public class Abbreviate {

    public static String abbrev (String name){

        String [] tab = name.split(" ");
        char a = (tab [0].charAt(0));
        char b = (tab [1].charAt(0));

        return Character.toUpperCase(a) + "." + Character.toUpperCase(b);
    }


    public static void main(String[] args) {
        System.out.println(abbrev("Ryszard Walizka"));
    }
}

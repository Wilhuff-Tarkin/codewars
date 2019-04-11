import java.util.Arrays;

public class ReverseWords {

    public static String reverseWords(final String original)
    {
        char [] array = original.toCharArray();
        char [] array2 = new char [array.length];
        int length = array.length-1;

        for (char a : array) {
            array2 [length] = a;
            length--;
        }




        return new String(array2);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!")); // "sihT si na !elpmaxe"
        System.out.println(reverseWords("test  numer 2"));
    }

}

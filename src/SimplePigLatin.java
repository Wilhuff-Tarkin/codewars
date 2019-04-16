//Move the first letter of each word to the end of it,
//then add "ay" to the end of the word. Leave punctuation marks untouched.

//igPay atinlay siay oolcay

import javax.xml.stream.events.Characters;
import java.util.Arrays;

public class SimplePigLatin {

    public static String pigIt(String str) {
        String[] array = str.split(" ");

        for (int i = 0; i < array.length ; i++) {
            String s = array [i];
            if (Character.isLetter(s.charAt(0))){
            char tmp = s.charAt(0);
            String tmp_string = s.substring(1);
            array [i] = tmp_string + tmp + "ay";}

        }

        return String.join(" ", array);
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool!"));
    }

}

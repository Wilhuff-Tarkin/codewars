//Returns the number (count) of vowels in the given string.


public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] array = str.toCharArray();

        for (char c : array) {
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                vowelsCount += 1;
            }

        }
        return vowelsCount;
    }

            public static void main (String[]args){
                System.out.println(getCount("abracadabra!"));
            }

        }

/*
Complete the function scramble(str1, str2) that returns true
if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 */


import java.util.Arrays;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

            char[] fromString1 = str1.toCharArray();
            char[] fromString2 = str2.toCharArray();

            Arrays.sort(fromString1);
            Arrays.sort(fromString2);

            int matchingPoints = 0;

            for (int i = 0; i < fromString2.length; i++) {
                for (int j = 0; j < fromString1.length; j++) {
                    if (fromString2[i] == fromString1[j]) {
                        fromString1[j] = '*';
                        fromString2[i] = '*';
                        matchingPoints += 1;
                    }
                }

            }

            boolean result;

            if (matchingPoints == str2.length()) {
                result = true;
            } else {
                result = false;
            }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(scramble("rkqodlwbb", "worldb"));
    }



}


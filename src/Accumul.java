// This time no story, no theory. The examples below show you how to write function accum:
// Examples:
// Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
// Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {

    public static String accum(String s) {
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (j == i + 1) {stb.append(s.toUpperCase().charAt(i));}
                if (j == 1) {stb.append("-");}
                else stb.append(s.toLowerCase().charAt(i));
                }
            }
            return stb.toString().substring(0,stb.length()-1); //substring from indexes between zero (inclusive) and last index (exclusive)
        }


        public static void main (String[]args){
            System.out.println(accum("abc"));
            System.out.println(accum("NNoN"));
            System.out.println(accum("ono"));
        }
    }


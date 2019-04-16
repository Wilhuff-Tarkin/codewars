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
            System.out.println(accum("NNN"));
            System.out.println(accum("ono"));
            System.out.println(accum("ono"));
        }
    }


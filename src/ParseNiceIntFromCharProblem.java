public class ParseNiceIntFromCharProblem {

    public static int howOld(final String herOld) {
        String tempString = String.valueOf(herOld.charAt(0));
        return Integer.parseInt(tempString);
    }


    public static void main(String[] args) {

        System.out.println(howOld("5 years old"));

    }

}

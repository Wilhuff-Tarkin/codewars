//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

public class ExesAndOhs {


    public static boolean getXO (String str) {

        int countOhs = 0;
        int countExs = 0;
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i))== 'X') countExs += 1;
            else
            if ((str.charAt(i))== 'O') countOhs += 1;
        }

        if (countExs == countOhs){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getXO("xxXooOoo"));
    }

}

//Given an integral number, determine if it's a square number:

public class YouAreAsquare {

    //not mine solution

    public static boolean isSquare(int n) {

        double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {

        System.out.println(isSquare(-1));
        System.out.println(isSquare(3));
        System.out.println(isSquare(25));
        System.out.println(isSquare(4));
        System.out.println(isSquare(26));

    }

}

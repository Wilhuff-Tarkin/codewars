public class SequencesAndSeries {
    public static long getScore (int n) {
        long result =0;
        if (n > 0) {
            result=  n * 50 + (getScore(n - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getScore(1));
        System.out.println(getScore(2));
        System.out.println(getScore(3));
        System.out.println(getScore(4));
        System.out.println(getScore(5));
    }
}

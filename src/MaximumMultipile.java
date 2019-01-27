public class MaximumMultipile {
    public static int szukam(int divisor, int bound){

        int n = bound/divisor;
        return n*divisor;
    }

    public static void main(String[] args) {
        System.out.println(szukam(2,7));
        System.out.println(szukam(10,50));
    }


}

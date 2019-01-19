public class GrassHopper {
    public static int summation (int n){

        int result = 0;
        for (int i = n; n >= 0; n--) {result += n;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(2));
        System.out.println(summation(3));
        System.out.println(summation(4));
        System.out.println(summation(5));
        System.out.println(summation(6));
        System.out.println(summation(7));
        System.out.println(summation(8));


    }
}

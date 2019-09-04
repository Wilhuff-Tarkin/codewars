public class ReturnNegative {
    public static class Kata {

        public static int makeNegative(final int x) {
            int result = x;
            if (x > 0)
            {
                return result *= -1;
            }
            return result;
        }


        public static void main(String[] args) {
            System.out.println("input dodatni = " + makeNegative(5));
            System.out.println("input ujemny = " + makeNegative(-5));


        }


    }
}

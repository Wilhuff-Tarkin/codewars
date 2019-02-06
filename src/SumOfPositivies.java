public class SumOfPositivies {

    public static int sumitup (int [] tab){
        int sum = 0;
        for (int e : tab){
            if (e > 0) {
                sum += e;
            }
        }

        return sum;
    }



    public static void main(String[] args) {
        System.out.println(sumitup(new int[]{1,2,3,4,5}));
        System.out.println(sumitup(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sumitup(new int[]{1,2,3,4,5}));
        System.out.println(sumitup(new int[]{1,2,3,4,5}));
        System.out.println(sumitup(new int[]{-1,2,3,4,-5}));
    }
}

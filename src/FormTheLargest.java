import java.util.Comparator;
import java.util.stream.Collectors;

//niechlubnie zapożyczone z rozwiazania z innego zadania w celach edukacyjnych

public class FormTheLargest {
    public static long maxNumber(long n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));

    }
        public static void main (String[]args){
            System.out.println(maxNumber(124));
        }
    }


//    public class DescendingOrder {
//        public static int sortDesc(final int num) {
//            return Integer.parseInt(String.valueOf(num)
//                    .chars()
//                    .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
//                    .sorted(Comparator.reverseOrder())
//                    .collect(Collectors.joining()));

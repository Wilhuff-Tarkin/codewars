import java.util.Arrays;

public class SortTheOdd {

   public static int [] sorter (int [] array){
       if (array.length == 0) return array;

       for (int i = 0; i < array.length ; i++) {
           if (array[i] % 2 != 0) {
               for (int j = 0; j < array.length; j++) {
                   if (array [j] > array [i] && array[j] % 2 != 0) {
                       int temp = array [j];
                       array [j] = array [i];
                       array [i] = temp;
                   }
               }
           }
       }


       System.out.println(Arrays.toString(array));
       return array;
   }




    public static void main(String[] args) {
        System.out.println(sorter(new int[]{ 1, 3, 2, 8, 0, 4 }));
    }
}

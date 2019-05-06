import java.util.Arrays;

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in

public class MultipleOf3and5 {


    public static int solution(int number) {

        int [] tab = new int [number];

        for (int i = 0; i < number ; i++) {
            tab [i] = i;
        }

  //      System.out.println(Arrays.toString(tab));
        int result = 0;

        for (int i : tab){
            if ((i%3==0)||(i%5==0)){
    //            System.out.println("i = " + i);
                result += i;
            }
        }

        System.out.println(number);
        System.out.println(result);
    return result;

    }

    public static void main(String[] args) {


        solution(10);
    }
}

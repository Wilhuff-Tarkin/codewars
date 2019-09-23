//Given two integers a and b, which can be positive or negative, find the sum of all
//        the numbers between including them too and return it. If the two numbers are equal return a or b.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOfNumbers {

    public static int GetSum(int a, int b)
    {

        if (a == b) {
            System.out.println("a = " + a);
            return a;
        }

        else {

            if (a>b){

                List<Integer> values = new LinkedList<>();





            }

            int result = a + b;
            System.out.println("result = " + result);
            return result;
        }


    }

    public static void main(String[] args) {

        GetSum(1, 0);
        GetSum(1, 2);
        GetSum(0, 1);
        GetSum(1, 1);
        GetSum(-1, 0);
        GetSum(-1, 2);


    }

}

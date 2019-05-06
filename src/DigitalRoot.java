/*
A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue
reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
*/

public class DigitalRoot {
    public static int digital_root(int n) {
        return 1 + (n-1) % 9;

        //got lost in recursion found this formula on wikipedia
    }


    public static void main(String[] args) {
        System.out.println(digital_root(128));
    }
}

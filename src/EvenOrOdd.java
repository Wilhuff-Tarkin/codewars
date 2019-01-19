public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(12));
        System.out.println(even_or_odd(0));
        System.out.println(even_or_odd(99));
        System.out.println(even_or_odd(3));
        even_or_odd(0);
        even_or_odd(99);
    }
}
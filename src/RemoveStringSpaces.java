public class RemoveStringSpaces {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("bla bla a "));

    }
}
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stb = new StringBuilder();
        for (int i = repeat; i > 0; i--) stb.append(string);
        return stb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(2,"hello"));
    }
}

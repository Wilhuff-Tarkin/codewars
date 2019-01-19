public class shortestWord {
    public static int findShort(String s) {
        String [] words = s.split("\\s+");
        System.out.println(words.toString());

        for (int i = words.length; i > 0; i--){
            int shortest = words [i-1].length();
        }

int a = 0;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findShort("to jest test tegowlasnie programu"));
    }
}
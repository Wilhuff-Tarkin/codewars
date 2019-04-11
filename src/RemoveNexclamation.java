public class RemoveNexclamation {

    public static String remove (String source, int n){

        for (int i = 0; i < n ; i++) {
            source = source.replaceFirst("!", "");
        }

        return source;
    }


    public static void main(String[] args) {
        System.out.println(remove("Hi!", 1));
      System.out.println(remove("Hi!!!", 100));
       System.out.println(remove("!!!Hi !!hi!!! !hi",1));
    }
}

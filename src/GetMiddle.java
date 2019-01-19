public class GetMiddle {
    public static String getMiddle(String word) {
        String middleCharacterOr2;

        if (word.length()%2==0){
            int middleCharacterPosition = (int)(word.length()/2.);
            middleCharacterOr2 = word.substring(middleCharacterPosition-1,middleCharacterPosition+1);
        }
        else {
          int middleCharacterPosition = (int) (word.length()/2.);
            middleCharacterOr2 = word.substring(middleCharacterPosition,middleCharacterPosition+1);
        }

        return middleCharacterOr2;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("BABA"));
        System.out.println(getMiddle("BAOBABY"));
        System.out.println(getMiddle("DUPA"));

    }
}
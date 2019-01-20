public class TrainInspector {

    public static int countMissingCarriages(String train) {
        int lastCarriageAscii = train.charAt(train.length()-1);
        int howManyCarriegesShouldBe = lastCarriageAscii - 64; //Because ASCII code for A is 65
        return howManyCarriegesShouldBe - train.length();
    }

    public static void main(String[] args) {
        System.out.println(countMissingCarriages("ABC"));
        System.out.println(countMissingCarriages("G"));
        System.out.println(countMissingCarriages("ABCZ"));
    }
}
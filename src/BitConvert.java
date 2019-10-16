public class BitConvert {

    public static int countBits(int n){

        String binary = Integer.toBinaryString(n);
        int result = 0;

        for (int i = 0; i < binary.length() ; i++) {
            result += Character.getNumericValue(binary.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        countBits(1234);
    }
}

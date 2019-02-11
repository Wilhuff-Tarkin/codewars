public class PrinterError {

    public static String printerError(String s) {
            int stringLength = s.length();
            int numberOfErrors = 0;


            for (int i = 0; i < stringLength ; i++) {
            if ((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 109){
                continue;
            }
            else numberOfErrors ++;
            }

            String report = (numberOfErrors + "/" + stringLength);
            return report;
        }

    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        System.out.println(printerError("aaabbbbhaijjjm"));
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));

    }
}

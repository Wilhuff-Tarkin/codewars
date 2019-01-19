import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardIssuerChecking {
    public static String getIssuer(String cardNumber) {
        Pattern amex = Pattern.compile("[3][4|7]\\d{13}");
        Pattern discover = Pattern.compile("(6011)\\d{12}");
        Pattern mastercard = Pattern.compile("[5][12345]\\d{14}");
        Pattern visa = Pattern.compile("[4]\\d{14}\\d");
        Pattern visa2 = Pattern.compile("[4]\\d{11}\\d");


        Matcher cardmatcher1 = amex.matcher(cardNumber);
        Matcher cardmatcher2 = discover.matcher(cardNumber);
        Matcher cardmatcher3 = mastercard.matcher(cardNumber);
        Matcher cardmatcher4 = visa.matcher(cardNumber);
        Matcher cardmatcher5 = visa2.matcher(cardNumber);

        String issuer;

        if ((cardmatcher1.matches())) issuer = "AMEX";
            else
        if ((cardmatcher2.matches())) issuer = "Discover";
            else
        if ((cardmatcher3.matches())) issuer = "Mastercard";
            else
        if ((cardmatcher4.matches())) issuer = "VISA";
            else
        if ((cardmatcher5.matches())) issuer = "VISA";
            else issuer = "Uknown";

        return issuer;
    }

    public static void main(String[] args) {
//        System.out.println(getIssuer("4111111111111111"));
//        System.out.println(getIssuer("4111111111111"));
//        System.out.println(getIssuer("378282246310005"));

        System.out.println(getIssuer("4111111111111111"));// == "VISA"
        System.out.println(getIssuer("4111111111111"));// == "VISA"
        System.out.println(getIssuer("4012888888881881")); //== "VISA"
        System.out.println(getIssuer("378282246310005")); //== "AMEX"
        System.out.println(getIssuer("6011111111111117"));// == "Discover"
        System.out.println(getIssuer("5105105105105100"));// == "Mastercard"
        System.out.println(getIssuer("5105105105105106"));// == "Mastercard"
        System.out.println(getIssuer("9111111111111111"));// == "Unknown"

    }
}


//|          Card Type  | Begins With          | Number Length |
//        |------------|----------------------|---------------|
//        | AMEX       | 34 or 37             | 15            |
//        | Discover   | 6011                 | 16            |
//        | Mastercard | 51, 52, 53, 54 or 55 | 16            |
//        | VISA       | 4                    | 13 or 16      |
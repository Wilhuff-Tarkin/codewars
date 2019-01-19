import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bio {
    public static String dnaToRna(String dna) {
        Pattern dnaCheck = Pattern.compile("[GATC]+");
        Matcher matcher = dnaCheck.matcher(dna);
        String NotAnDNA  = "Not an DNA, please use only \"G\", \"A\", \"T\" or \"C\".";
        if (matcher.matches()){
        String rna = dna.replace("T","U");
        return rna;}
        else return NotAnDNA;

    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("dupa"));
    }

}

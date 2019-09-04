//Write a function findNeedle() that takes an array full of junk but containing one "needle"
//After your function finds the needle it should return a message (as a string) that says:
//"found the needle at position " plus the index it found the needle

import java.util.Arrays;
import java.util.List;

public class Needle {

    private static String findNeedle(Object[] objects) {

        List list = Arrays.asList(objects);
        int position = list.indexOf("needle");
        return "found the needle at position " + position;
    }

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }
}

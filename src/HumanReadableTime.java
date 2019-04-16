import java.text.DecimalFormat;

//converts seconds to human readable time format 00:00:00 with max in 99:59:59

public class HumanReadableTime {

    public static String makeReadable(int seconds) {

        int sec = 0;
        int min = 0;
        int hou = 0;

        sec = seconds;
        if (sec > 59){
            min = sec / 60;
            sec = sec - min*60;
        }

        if (min > 59){
            hou = min / 60;
            min = min - hou * 60;
        }

        if (hou > 99){
            hou = 99;
        }

        DecimalFormat formatter = new DecimalFormat("00");
        String hoursTotal = formatter.format(hou);
        String minutesTotal = formatter.format(min);
        String secondsTotal = formatter.format(sec);

        return hoursTotal + ":" + minutesTotal + ":" + secondsTotal;

    }
    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(15));
        System.out.println(makeReadable(70));
        System.out.println(makeReadable(6000));
        System.out.println(makeReadable(61235));
    }
}

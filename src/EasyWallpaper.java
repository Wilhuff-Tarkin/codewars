public class EasyWallpaper {

    public static String wallpaper(double l, double w, double h) {
        if (l*w*h == 0) return "zero";

        double wallsSurface = 2 * (l * h) + 2 * (w * h);  //        how many square meters of wall John have
        final double coverageFromOneRoll = 0.52 * 10; //            how many square meters of wallpaper comes from each roll
        final double fearFactor = 1.15;

        double numberOfRolls = (wallsSurface * fearFactor)/coverageFromOneRoll;
        int numberOfRollsRounded = (int) Math.ceil(numberOfRolls);

        String numberOfRollsEn = "";

        switch (numberOfRollsRounded){

            case 1:
                numberOfRollsEn = "one";
                break;
            case 2:
                numberOfRollsEn = "two";
                break;
            case 3:
                numberOfRollsEn = "three";
                break;
            case 4:
                numberOfRollsEn = "four";
                break;
            case 5:
                numberOfRollsEn = "five";
                break;
            case 6:
                numberOfRollsEn = "six";
                break;
            case 7:
                numberOfRollsEn = "seven";
                break;
            case 8:
                numberOfRollsEn = "eight";
                break;
            case 9:
                numberOfRollsEn = "nine";
                break;
            case 10:
                numberOfRollsEn = "ten";
                break;
            case 11:
                numberOfRollsEn = "eleven";
                break;
            case 12:
                numberOfRollsEn = "twelve";
                break;
            case 13:
                numberOfRollsEn = "thirteen";
                break;
            case 14:
                numberOfRollsEn = "fourteen";
                break;
            case 15:
                numberOfRollsEn = "fifteen";
                break;
            case 16:
                numberOfRollsEn = "sixteen";
                break;
            case 17:
                numberOfRollsEn = "seventeen";
                break;
            case 18:
                numberOfRollsEn = "eighteen";
                break;
            case 19:
                numberOfRollsEn = "nineteen";
                break;
            case 20:
                numberOfRollsEn = "twenty";
                break;
        }

        return numberOfRollsEn;
    }
    public static void main(String[] args) {
        System.out.println(wallpaper(4,3.5, 3));
        System.out.println(wallpaper(6.3, 4.5, 3.29));
        System.out.println(wallpaper(6.3, 5.8, 3.13));
    }
}

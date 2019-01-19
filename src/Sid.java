public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        String[] petals = new String[]{"I love you", "a little", "a lot", "passionately","madly","not at all"};

        String message = "";

       // if (nb_petals % 6 != 0) message = (petals[nb_petals%6-1]);
        if (nb_petals < 6 && nb_petals > 0) message = (petals[nb_petals-1]);
                else if (nb_petals % 6 != 0) message = (petals[nb_petals%6 -1]);
                else message = (petals[petals.length-1]);

        return message;
    }



    public static void main(String[] args) {

        System.out.println(howMuchILoveYou(49));
        System.out.println(howMuchILoveYou(74));
        System.out.println(howMuchILoveYou(91));
        System.out.println(howMuchILoveYou(80));
        System.out.println(howMuchILoveYou(30));
        System.out.println(howMuchILoveYou(64));
        System.out.println(howMuchILoveYou(0));
        System.out.println(howMuchILoveYou(30));

    }

}
//
//    Testing number = 49, I love you
//    Testing number = 74, a little
//        Testing number = 91, I love you
//        Testing number = 80, a little
//        Testing number = 8, a little
//        Testing number = 14, a little
//        Testing number = 30, not at all
//        Testing number = 99, a lot
//        Testing number = 54, not at all
//        Testing number = 64, passionately
//        Testing number = 33, a lot
//        Testing number = 58, passionately
//        Testing number = 74, a little
//        Testing number = 87, a lot
//        Testing number = 52, passionately
//        Testing number = 12, not at all
//        Testing number = 94, passionately
//        Testing number = 10, passionately
//        Testing number = 64, passionately
//        Testing number = 63, a lot
//        Testing number = 44, a little
//        Testing number = 58, passionately
//        Testing number = 56, a little
//        Testing number = 54, not at all
//        Testing number = 58, passionately
//        Testing number = 12, not at all
//        Testing number = 54, not at all
//        Testing number = 14, a little
//        Testing number = 84, not at all
//        Testing number = 37, I love you
//        Testing number = 6, not at all
//        Testing number = 99, a lot
//        Testing number = 21, a lot
//        Testing number = 0, not at all
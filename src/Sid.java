public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        String[] petals = new String[]{"I love you", "a little", "a lot", "passionately","madly","not at all",};

        String message = "";

        for (int i = nb_petals; i > 0; i--){
            if (nb_petals > 6) message = (petals[nb_petals%6-1]);
            else message = (petals[nb_petals-1]);
        }
        return message;
    }

    public static void main(String[] args) {

        
    }

}
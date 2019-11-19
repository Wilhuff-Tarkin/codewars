package coffeeMachine;


public class LittleOne {

    public static int getNumberOfMaxParam(int a, int b, int c) {

        int [] given = {a, b, c};
        int result = 0;
        int tmpHighest = given[0];

        for (int i = 0; i < given.length ; i++) {

            if (given [i] > tmpHighest)
            {
                result = i+1;
                tmpHighest = given [i];
                }

        }
        if (result > 0){
            return result;}
        else return 1;
        }


    /* Do not change code below */
    public static void main(String[] args) {

        System.out.println(getNumberOfMaxParam(5, 7, 7));

    }
}











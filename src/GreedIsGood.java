import com.sun.org.apache.bcel.internal.generic.SWITCH;

/*
Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a
throw according to these rules. You will always be given an array with five six-sided dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point

 */
public class GreedIsGood {

    public static int greedy(int[] dice) {

        int points = 0;

        //count the number of occurrences for each dice side and add it to new array
        int[] counter = new int[6];

        for (int i : dice) {
            switch (i) {
                case 1:
                    counter[0]++; //counts all "1s"
                    break;
                case 2:
                    counter[1]++; //counts all "2s"
                    break;
                case 3:
                    counter[2]++; //counts all "3s"
                    break;
                case 4:
                    counter[3]++; //counts all "4s"
                    break;
                case 5:
                    counter[4]++; //counts all "5s"
                    break;
                case 6:
                    counter[5]++; //counts all "6s"
                    break;
                default:
                    System.out.println("incorrect dice");
            }
        }


        // count points from 1s
        if (counter[0] >= 3) {
            points += 1000;
            counter[0] -= 3;
        }
        if (counter[0] > 0) {
            points += (counter[0] * 100);
            counter[0] = 0;
        }
        // count points from other results if there are 3 of the kind
        for (int i = 1; i < 6; i++) {
            if (counter[i] >= 3) {
                points += ((i + 1) * 100);
                counter[i] -= 3;
            }
        }

        // count points from single "5" results
        if (counter[4] > 0) {
            points += (counter[4]*50);
            counter[4] = 0;
        }
        return points;
    }


    public static void main(String[] args) {
        int [] tab = {5, 5, 5, 5, 1};
        System.out.println(greedy(tab));

    }
}

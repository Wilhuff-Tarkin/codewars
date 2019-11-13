package coffeeMachine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ascendingOrDescending {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double z1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();
        double z2 = scanner.nextInt();

        double box1diagonal = Math.sqrt((x1*x1)+(y1*y1)+(z1*z1));
        double box2diagonal = Math.sqrt((x2*x2)+(y2*y2)+(z2*z2));

        double box1volume = x1 * y1 * z1;
        double box2volume = x2 * y2 * z2;

        double [] box1vals = {x1, y1, z1};
        double [] box2vals = {x2, y2, z2};

        Arrays.sort(box1vals);
        Arrays.sort(box2vals);

        if (box1vals[0]==box2vals[0]&&box1vals[1]==box2vals[1]&&box1vals[2]==box2vals[2]) {
            System.out.println("Box 1 = Box 2");
        } else if (box1vals[0]>=box2vals[0]&&box1vals[1]>=box2vals[1]&&box1vals[2]>=box2vals[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1vals[0]<=box2vals[0]&&box1vals[1]<=box2vals[1]&&box1vals[2]<=box2vals[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }


    }
}

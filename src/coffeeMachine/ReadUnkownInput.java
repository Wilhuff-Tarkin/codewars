package coffeeMachine;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class ReadUnkownInput {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int local;

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s1.replace(" ", "").equals(s2.replace(" ", "")));

//        System.out.println(s.endsWith("burg"));

//        do {
//            int tmp = scanner.nextInt();
//            local = tmp;
//            sum += tmp;
//
//        } while (local != 0);
//
//
//        System.out.println(sum);

//        long l = Integer.MAX_VALUE; // (1)
//        int i = l; // (2)
//        char ch = i; // (3)
//        double d = ch; // (4)
//        float f = d; // (5)


    }

}

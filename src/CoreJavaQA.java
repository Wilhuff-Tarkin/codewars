import java.util.Scanner;

public class CoreJavaQA {

    //inner class and subclass

    public static class Fruit {

        protected static void plant (){
            System.out.println("planted!");
        }

        public Fruit() {
        }

        public static class Apple {
            Apple apple = new Apple();

        }



    }

    static class Pear extends Fruit {



    }

    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.plant();

        Pear pear = new Pear();
        pear.plant();

//        Fruit.Apple apple1 = new Fruit.Apple();
        //try to plant apple1

        Scanner scanner = new Scanner(System.in);

        int poleHeight = scanner.nextInt();
        int heightDoneByDay = scanner.nextInt();
        int heightLostByNight = scanner.nextInt();
        int currentHeight = 0;
        int numberOfDays = 0;

        while (currentHeight < poleHeight) {
            currentHeight += heightDoneByDay;
          if (currentHeight < poleHeight) {
              currentHeight -= heightLostByNight;
          }
            numberOfDays++;
        }

        System.out.println(numberOfDays);
//        int result= n%k;
//        System.out.println("result = " + result);


//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }


//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

    }

}

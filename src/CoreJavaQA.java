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

        Fruit.Apple apple1 = new Fruit.Apple();
        //try to plant apple1
    }

}

public class WillThereBeEnoughSpace {

    public static int czyJest (int cap, int on, int wait){
      int howManyWontFit = 0;

      if (on + wait > cap ) return ((on + wait) - cap);
      else return 0;

    }


    public static void main(String[] args) {
        System.out.println(czyJest(100, 50, 10));
        System.out.println(czyJest(100, 80, 30));
    }

}

public class Butelka {
    private double ileLitrow;
    private double pojemnosc;

    public Butelka(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }


    void wlej (double ilosc){
        if ((ileLitrow + ilosc)>= pojemnosc){
            System.out.println("butelka jest pełna");
            double spill = (ileLitrow + ilosc) - pojemnosc;
            System.out.println("wylało sie " + spill + " litrow");
        }
        this.ileLitrow += ilosc;
    }

    boolean wylej (double ilosc){
        if (ilosc <= ileLitrow){
            this.ileLitrow -= ilosc;
            System.out.println("wylano " + ilosc + " litrow. Zostalo " + getIleLitrow());
        }
        else {
            System.out.println("w butelce nie ma tyle wody!");
            return false;
        }

    return true;
    }



    void przelej (double ilosc, Butelka gdzie){

        if (this.wylej(ilosc)) {
            gdzie.wlej(ilosc);
        }
            else
            System.out.println("za mało");
    }

    public Butelka() {
    }

    public static void main(String[] args) {

        Butelka butelka1 = new Butelka(2, 5);
        Butelka butelka2 = new Butelka(3, 5);
        Butelka butelka3 = new Butelka(5, 5);

        butelka3.wylej(10);
        butelka2.wylej(3);
        butelka1.wylej(1);
//butelka2.wlej(3);
//butelka1.wlej(4);
    }


}

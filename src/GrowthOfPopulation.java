public class GrowthOfPopulation {

    public static int nb_years (int p0,int percent, int aug, int p){
    int howManY = 0;
    int currentP = p0;


    while (currentP < p){

        currentP += currentP*(percent/100)+ aug;
        howManY += 1;
    }


    return howManY;
    }


    public static void main(String[] args) {
        System.out.println(nb_years(1500, 5, 100, 5000));
    }
}

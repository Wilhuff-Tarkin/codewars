public class NumberShapeArea {

    public static int policzPole (int n){

        int fieldsOnLongDiagonals = n*n;
        int fieldsOnShortDiagonals = (n-1) * (n-1);
        return fieldsOnLongDiagonals + fieldsOnShortDiagonals;

    }

    public static void main(String[] args) {
        System.out.println("pole dla 1 to: " + policzPole(1));
        System.out.println("pole dla 2 to: " + policzPole(2));
        System.out.println("pole dla 3 to: " + policzPole(3));
    }
}

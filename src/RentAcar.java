public class RentAcar {
    //Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.
    // Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
    public static int rentcost (int days) {
        int cost = 0;
        if (days > 0) cost = days * 40;
        if (days >= 3 && days < 7) cost -= 20;
        if (days >= 7) cost -= 50;


        return cost;
    }



    public static void main(String[] args) {
        System.out.println(rentcost(10));
    }


}

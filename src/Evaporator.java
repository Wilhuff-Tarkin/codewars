public class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
int days = 0;
double pressureInTheCan = 100.00;

while (pressureInTheCan > threshold) {
    pressureInTheCan -= (pressureInTheCan*evap_per_day)/100;
    days += 1;
}

return days;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10,10,10));
    }

}

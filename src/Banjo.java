//If name starts with R this person plays banjo :)

public class Banjo {
    public static String areYouPlayingBanjo(String name) {

       String initial = String.valueOf(name.charAt(0));
       if ((initial.equals("r"))||(initial.equals("R"))) return name + " plays banjo";
       return name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Roboerto"));
        System.out.println(areYouPlayingBanjo("Goboerto"));

    }

}
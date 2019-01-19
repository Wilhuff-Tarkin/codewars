public class Kata {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        String sheeps = "";
        for (int i = 1; i <= num; i++) sheeps = String.valueOf(sb.append(i).append(" sheep..."));
        return sheeps;
    }

    public static void main(String[] args) {
        countingSheep(1441);
        System.out.println(countingSheep(141));
    }


}

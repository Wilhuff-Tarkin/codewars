
public class FeastOf {
    public static boolean feast(String beast, String dish) {
        String beastInit = String.valueOf(beast.charAt(0));
        String dishInit = String.valueOf(dish.charAt(0));
        boolean firstLetterMatches = beastInit.toUpperCase().equals(dishInit.toUpperCase());

        String beastLast = String.valueOf(beast.charAt(beast.length()-1));
        String dishLast = String.valueOf(dish.charAt(dish.length()-1));
        boolean lastLetterMatches = beastLast.toUpperCase().equals(dishLast.toUpperCase());

        return firstLetterMatches && lastLetterMatches;

    }




    public static void main(String[] args) {
        System.out.println(feast("gish", "gooh"));
        System.out.println(feast("cisR", "CoowwwwwwwwwwwwR"));
        System.out.println(feast("Dish", "boo"));
        System.out.println(feast("Dish", "boo"));
        System.out.println(feast("Dish", "boo"));
        System.out.println(feast("Lish", "looh"));

    }
}
/*
All of the animals are having a feast! Each animal is bringing one dish.
There is just one rule: the dish must start and end with the same letters as the animal's name.
For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
Write a function feast that takes the animal's name and dish as arguments and returns true or false to
indicate whether the beast is allowed to bring the dish to the feast.
 */

public class FeastOf {

    private static boolean feast(String beast, String dish) {
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
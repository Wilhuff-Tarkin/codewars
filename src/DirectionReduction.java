/*
Write a function dirReduc which will take an array of strings and returns an array of strings
with the needless directions removed (W<->E or S<->N side by side).
The Haskell version takes a list of directions with data Direction = North | East | West | South.
The Clojure version returns nil when the path is reduced to nothing.
The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirectionReduction {

    public static String[] dirReduc(String[] arr) {

        List<String> listOfDirections = new LinkedList<>(Arrays.asList(arr));
        String [] reducedDirections = actualDirectionReduction(listOfDirections).toArray(new String[listOfDirections.size()]);
        System.out.println(Arrays.toString(reducedDirections));
        return reducedDirections;
    }

    private static List <String> actualDirectionReduction(List<String> listOfDirections) {

        boolean anyChanges = false;

        for (int i = 0; i <= listOfDirections.size() - 2; i++) {

            anyChanges |= tryRemovePair("NORTH", "SOUTH", listOfDirections, i);
            anyChanges |= tryRemovePair("SOUTH", "NORTH", listOfDirections, i);
            anyChanges |= tryRemovePair("EAST", "WEST", listOfDirections, i);
            anyChanges = anyChanges || tryRemovePair("WEST", "EAST", listOfDirections, i);
        }

        if (anyChanges) {
            actualDirectionReduction(listOfDirections);
        }
        return listOfDirections ;
    }


    private static boolean tryRemovePair(String direction1, String direction2, List<String> arr, int i) {

        if (arr.size() > 1 && arr.get(i).equals(direction1)) {
            if (arr.get(i + 1).equals(direction2)) {
                arr.remove(i + 1);
                arr.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String[] dir = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] dir = {"NORTH", "SOUTH"};
        //expects WEST
        dirReduc(dir);

    }
}


/*
Write a function dirReduc which will take an array of strings and returns an array of strings
with the needless directions removed (W<->E or S<->N side by side).
The Haskell version takes a list of directions with data Direction = North | East | West | South.
The Clojure version returns nil when the path is reduced to nothing.
The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.

TODO recursion error - still returns both correct and incorrect results
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirectionReduction {


    public static String[] dirReduc(String[] arr) {

        boolean ns = false;
        boolean sn = false;
        boolean we = false;
        boolean ew = false;


            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("NORTH")) {
                        if (arr[i+1].equals("SOUTH")) {
                            arr[i+1] = " ";
                            arr[i] = " ";
                            ns = true;
                            break;
                        }
                    }
                }

            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("SOUTH")) {
                    if (arr[i+1].equals("NORTH")) {
                        arr[i+1] = " ";
                        arr[i] = " ";
                        sn = true;
                        break;
                        }
                    }
                }


            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("WEST")) {
                    if (arr[i+1].equals("EAST")) {
                        arr[i+1] = " ";
                        arr[i] = " ";
                        we = true;
                        break;
                        }
                    }
                }


            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("EAST")) {
                    if (arr[i+1].equals("WEST")) {
                        arr[i+1] = " ";
                        arr[i] = " ";
                        ew = true;
                        break;
                         }
                    }
                }


        List<String> result = new LinkedList<>();

        for (String s : arr) {
                if (!s.equals(" ")) {
                    result.add(s);
                }
            }


        if (ns || sn || we || ew){
        dirReduc(result.toArray(new String[result.size()]));
        }

        if (!ns && !sn && !we && !ew){
            System.out.println("result");
            System.out.println(Arrays.toString(result.toArray()));
            return result.toArray(new String[result.size()]);
        }

        return result.toArray(new String[result.size()]);


    }

    public static void main(String[] args) {
        String [] dir = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(dir)));
    }
    }


import java.util.LinkedList;
import java.util.List;

public class DirectionReduction {


    public static String[] dirReduc(String[] arr) {

            List<String> result = new LinkedList<>();


            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("NORTH")) {
                        if (arr[i+1].equals("SOUTH")) {
                            arr[i+1] = " ";
                            arr[i] = " ";
                            break;
                        }
                    }
                }

            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("SOUTH")) {
                    if (arr[i+1].equals("NORTH")) {
                        arr[i+1] = " ";
                        arr[i] = " ";
                        break;
                    }
                    }
                }


            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("WEST")) {
                    if (arr[i+1].equals("EAST")) {
                        arr[i+1] = " ";
                        arr[i] = " ";
                        break;
                    }
                    }
                }


            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i].equals("EAST")) {
                    if (arr[i+1].equals("WEST")) {
                        arr[i+1] = " ";
                        arr[i] = " ";
                        break;
                    }
                    }
                }



            for (String s : arr) {
                if (!s.equals(" ")) {
                    result.add(s);
                }

            }


            System.out.println("result = " + result);

            return result.toArray(new String[result.size()]);


    }

    public static void main(String[] args) {
       // String [] dir = {"NORTH", "NORTH", "NORTH", "SOUTH", "WEST", "WEST", "EAST", "EAST", "WEST", "EAST", "SOUTH", "WEST"};
        String [] dir = {"NORTH", "WEST", "SOUTH", "EAST"};
        dirReduc(dir);
    }
    }


import java.util.LinkedList;
import java.util.List;

public class DirectionReduction {


    public static String[] dirReduc(String[] arr) {

            List<String> result = new LinkedList<>();


            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].equals("NORTH")) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j].equals("SOUTH")) {
                            arr[i] = " ";
                            arr[j] = " ";
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].equals("SOUTH")) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j].equals("NORTH")) {
                            arr[i] = " ";
                            arr[j] = " ";
                            break;

                        }
                    }
                }
            }

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].equals("WEST")) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j].equals("EAST")) {
                            arr[i] = " ";
                            arr[j] = " ";
                            break;

                        }
                    }
                }
            }

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].equals("EAST")) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j].equals("WEST")) {
                            arr [i] = " ";
                            arr [j] = " ";
                            break;

                        }
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
        String [] dir = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        dirReduc(dir);
    }
    }


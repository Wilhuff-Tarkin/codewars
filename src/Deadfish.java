import java.util.Arrays;

public class Deadfish {

    private static int countArraySize (String data){
        int arraySize = 0;

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'o')
            {
                arraySize += 1;
            }
        }

        return arraySize;
    }


    public static int[] parse(String data) {

        int [] array = new int [countArraySize(data)];
        int arrayPosition = 0;

        int numberOfCommands = data.length();
        int value = 0;


        for (int i = 0; i < numberOfCommands; i++) {
            char command = data.charAt(i);

            switch (command) {
                case 'i':
                    value += 1;
                    break;
                case 'd':
                    value -= 1;
                    break;
                case 's':
                    value = value * value;
                    break;
                case 'o':
                    array [arrayPosition] = value;
                    arrayPosition +=1;
                    break;
                default:
                    break;

            }
        }

        return array;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }


//    i increments the value (initially 0)
//    d decrements the value
//    s squares the value
//    o outputs the value into the return array


}

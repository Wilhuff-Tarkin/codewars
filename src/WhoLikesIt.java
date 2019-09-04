public class WhoLikesIt {

    public static String wholikes (String [] names){
        int arrayLength = names.length;
        String answer = "";

        switch (arrayLength){
            case 0:
                answer = "no one likes this";
                break;
            case 1:
                answer = names[0] + " likes this";
                break;

            case 2:
                answer = names[0] + " and " + names[1] + " like this";
                break;

            case 3:
                answer = names[0] + ", " + names[1] + " and " + names [2] + " like this";
                break;

            default:
                int numberOfOthers = names.length - 2;
                answer = names[0] + ", " + names[1] + " and " + numberOfOthers + " others like this";
        }

    return answer;

    }


    public static void main(String[] args) {
        String [] names = new String[0];
        String [] names1 = {"John"};
        String [] names2 = {"John", "Bob"};
        String [] names3 = {"John", "Bob", "Tom"};
        String [] names4 = {"John", "Bob", "Tom", "John", "Bob", "Tom"};
        System.out.println(wholikes(names));
        System.out.println(wholikes(names1));
        System.out.println(wholikes(names2));
        System.out.println(wholikes(names3));
        System.out.println(wholikes(names4));
    }

}

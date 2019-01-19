public class Nessie {
    public static boolean isLockNessMonster(String s){
            if (s.contains("3.50")) return true;
            if (s.contains("tree fiddy")) return true;
            if (s.contains("three fifty")) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLockNessMonster("3.50"));
        System.out.println(isLockNessMonster("tree fiddy"));
        System.out.println(isLockNessMonster("three fifty"));
        System.out.println(isLockNessMonster("cos innego"));


    }

}



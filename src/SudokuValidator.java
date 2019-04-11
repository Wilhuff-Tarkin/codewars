import java.util.Arrays;

public class SudokuValidator {

    private static boolean check(int[][] sudoku) {

        if (checkSize(sudoku)){
            int rowCorrectionPoints = checkEachRow(sudoku);
            int columnCorrectionPoints = checkEachColumn(sudoku);
            System.out.println((rowCorrectionPoints + columnCorrectionPoints) == 18);
            return (rowCorrectionPoints + columnCorrectionPoints) == 18;}
        else return false;

    }


    private static int checkEachRow(int[][] tab) {


        int [] toBeChecked = new int [9];
        int points = 0;

        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9 ; j++) {
                toBeChecked [j] = tab [i][j];
            }

//            System.out.println("toBeChecked = " + Arrays.toString(toBeChecked));
//            System.out.println(sortAndCount(toBeChecked));
            if (sortAndCount(toBeChecked)) points +=1;
        }

        return points;
    }

    private static int checkEachColumn(int[][] tab) {
        int[] toBeChecked = new int[9];
        int points = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                toBeChecked[j] = tab[j][i];
            }

//            System.out.println("toBeChecked = " + Arrays.toString(toBeChecked));
//            System.out.println(sortAndCount(toBeChecked));
            if (sortAndCount(toBeChecked)) points += 1;
        }

        return points;

    }

    private static boolean sortAndCount(int[] tab) {
        int [] pattern = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.sort(tab);
        if (Arrays.equals(tab, pattern)) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean checkSize(int[][] multi) {

        if (multi.length == 9) return true;
        else return false;
    }

    public static void main(String[] args) {

        int[][] multi = new int[][]{
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };

        if (checkSize(multi)) check(multi);

    }


}

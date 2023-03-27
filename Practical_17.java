import java.util.Random;

public class Practical_17 {
    public static void isRowsOdd(int[][] arr) {
        for (int i = 0; i < 6 ; i++) {
            int rowCount = 0;
            for (int j = 0; j < 6; j++) {
                if (arr[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount % 2 != 0) {
                System.out.println("Row No. - " + (i + 1) + " have ODD no of 1s");
            }
        }
    }

    public static void isColumnOdd(int[][] arr) {
        for (int i = 0; i < 6; i++) {
            int columnCount = 0;
            for (int j = 0; j < 6; j++) {
                if (arr[j][i] == 1) {
                    columnCount++;
                }
            }
            if (columnCount % 2 != 0) {
                System.out.println("Column No. - " + (i + 1) + " have ODD no of 1s");
            }
        }
    }


    public static void main(String[] args) {
        int row = 6;
        int col = 6;
        Random ra = new Random();
        int[][] arr = new int[6][6];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                arr[i][j] = ra.nextInt(2);
            }
        }
        System.out.println("The 2D array is: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        isRowsOdd(arr);
        isColumnOdd(arr);
    }
}
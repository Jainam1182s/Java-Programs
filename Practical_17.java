/*Question := Write a program that generate 6*6 two dimensional matrix, filled with 
              0’s and 1’s , display the matrix, check every raw and column have an 
              odd number’s of 1’s. */

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

/*
Output := 
The 2D array is: 
0 1 0 1 1 1 
1 1 1 1 1 1 
0 0 0 1 0 1 
1 1 1 1 1 1 
0 1 0 1 1 0 
1 1 1 1 0 1 

Row No. - 5 have ODD no of 1s
Row No. - 6 have ODD no of 1s
Column No. - 1 have ODD no of 1s
Column No. - 2 have ODD no of 1s
Column No. - 3 have ODD no of 1s
Column No. - 6 have ODD no of 1s

*/

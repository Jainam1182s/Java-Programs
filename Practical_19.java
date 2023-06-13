/*Question := Write a program to do the addition of two matrices */

import java.util.Random;
import java.util.Scanner;

public class Practical_19 {

   static void getData(int row, int col, int[][] arr1, int[][] arr2) {
       Random ra = new Random();
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                arr1[i][j] = ra.nextInt(10);
            }
        }
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                arr2[i][j] = ra.nextInt(10);
            }
        }
   }

    static void displayData(int row, int col, int[][] arr1, int[][] arr2) {
        System.out.println("The First array is: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The Second array is: ");
        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void matrixSum(int row, int col, int[][] arr1, int[][] arr2){
        int[][] sum = new int [row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of two Arrays := ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows :=");
        int row = sc.nextInt();
        System.out.println("Enter Number of Columns :=");
        int col = sc.nextInt();


        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];


        getData(row, col, arr1, arr2);
        displayData(row, col, arr1, arr2);
        matrixSum(row, col, arr1, arr2);
    }
}

/*
Output :=
Enter Number of Rows :=
4
Enter Number of Columns :=
4
The First array is: 
8 4 5 1 
2 3 4 6 
4 2 5 6 
2 1 2 0 

The Second array is: 
4 9 7 6 
7 9 5 3 
7 5 2 2 
5 2 8 7 

Sum of two Arrays := 
12 13 12 7 
9 12 9 9 
11 7 7 8 
7 3 10 7 
*/

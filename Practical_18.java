//This Program is run on terminal.

/*Question := Write a program to sort the elements from given array of integer. Specify 
              size of array and elements of array from command line argument.*/

import java.util.Arrays;
import java.util.Scanner;

public class Practical_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
Output :=
java Practical_18 5 10 15 20 25 30
Enter Number Of Elements: 5
5
10
15
20
25

*/

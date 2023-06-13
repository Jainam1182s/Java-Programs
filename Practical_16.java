/*Question := Write a test program that prompts the user to enter ten numbers, invoke a method 
              to reverse the numbers, display the numbers.*/

import java.util.Scanner;

public class Practical_16 {
    public static void reverse(int[] arr) {
        int i = 0, temp;
        while (i < arr.length / 2) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter at Position " + (i + 1) + " := ");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("After reversing numbers in an Array :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value at Position " + (i + 1) + " := " + arr[i]);
        }
    }
}

/*
Output :=
Enter at Position 1 := 4
Enter at Position 2 := 2
Enter at Position 3 := 3
Enter at Position 4 := 7
Enter at Position 5 := 1
Enter at Position 6 := 5
Enter at Position 7 := 6
Enter at Position 8 := 9
Enter at Position 9 := 8
Enter at Position 10 := 0
After reversing numbers in an Array :
Value at Position 1 := 0
Value at Position 2 := 8
Value at Position 3 := 9
Value at Position 4 := 6
Value at Position 5 := 5
Value at Position 6 := 1
Value at Position 7 := 7
Value at Position 8 := 3
Value at Position 9 := 2
Value at Position 10 := 4
*/

/*Question := Write a program that reads an integer and displays all its smallest factors in 
              increasing order. For example if input number is 120, the output should be as 
              follows:2,2,2,3,5.*/

import java.util.Scanner;

public class Practical_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer := ");
        int a = sc.nextInt();
        int div = 2;
        System.out.print("1");
        while (a > 1) {
            if (a % div == 0) {
                System.out.print(", " + div);
                a = a / div;
            }
            else {
                div++;
            }
        }
        System.out.println(".");
    }
}

/*
Output :=
Enter an Integer := 
360
1, 2, 2, 2, 3, 3, 5.
*/

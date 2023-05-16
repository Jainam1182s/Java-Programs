/* Question := Write a program that prompts the user to enter three integers and display
               the maximum number among these numbers. */

import java.util.Scanner;

public class Practical_05 {
    static void maxNo(int a, int b, int c) {
        if(a > b) {
            if(a > c) {
                System.out.println(a + " is Maximum.");
            }
            else{
                System.out.println(c + " is Maximum.");
            }
        }
        else if(a < b) {
            if(b > c) {
                System.out.println(b + " is Maximum.");
            }
            else {
                System.out.println(c + " is Maximum.");
            }
        }
        else{
            System.out.println("All are Same.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers := ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxNo(a,b,c);
    }
}

/* Output := 
        Enter Three Numbers := 
        23
        65
        12
        65 is Maximum.
*/

/* Question := Write a program to check the given number is Prime or not. */

import java.util.Scanner;

public class Practical_04 {
    static void checkPrime(int n){
        byte flag = 0;
        if(n == 0||n == 1){
            System.out.println(n+" is not prime number.");
        }
        else{
            for (int i = 2; i <= n/2; i++) {
                if(n%i == 0) {
                    System.out.println(n+" is not prime number.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(n+" is prime number.");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :=");
        int n = sc.nextInt();
        checkPrime(n);
    }
}

/* Output := 
        Enter a Number := 
        131
        131 is prime number.
*/

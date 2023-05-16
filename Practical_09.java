/* Question := Write a program to find that given number or string is palindrome or not. */

import java.util.Scanner;

public class Practical_09 {
    static void checkPalindrome(String s) {
        String r = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        if(s.equals(r)) {
            System.out.println(s + " is Palindrome.");
        }
        else {
            System.out.println(s + " is not Palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number or string := ");
        String s = sc.next();
        checkPalindrome(s);
    }
}

/* Output := 
        Enter Number or string := 
        mom
        mom is Palindrome.  
*/

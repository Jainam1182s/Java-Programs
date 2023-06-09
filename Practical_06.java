/* Question := Write a program that prompts the user to enter a letter and check whether a letter 
               is a vowel or consonant.*/

import java.util.Scanner;

public class Practical_06 {
    static void checkVowel(int x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println("Vowel");
        }
        else if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter := ");
        char x = sc.next().charAt(0);
        checkVowel(x);
    }
}

/* Output := 
        Enter a Letter := 
        d
        Consonant
*/

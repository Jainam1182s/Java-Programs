/*Question := Write a program that prompts the user to enter a decimal number and displays 
              the number in a fraction.*/

import java.util.Scanner;

public class Practical_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number as String := ");
        String s = sc.nextLine();
        int index = s.indexOf('.');
        String s2 = s.substring(0,index);
        String s1 = s.substring(index+1);

        System.out.println("Integer Part is := " + s2);
        System.out.println("Fraction Part is := 0." + s1);
    }
}

/*
Output :=
Enter a Decimal Number as String := 
23.7
Integer Part is := 23
Fraction Part is := 0.7
*/

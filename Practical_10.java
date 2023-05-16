/* Question := Write an interactive program to print a string entered in a pyramid. For instance, the 
               string “stream” has to be displayed as follows:
               S
              S t
             S t r
            S t r e
           S t r e a
          S t r e a m     */

import java.util.Scanner;

public class Practical_10 {
    public static void pattern(String s) {
        for (int i=0; i<s.length(); i++) {
            for(int j=s.length()-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String := ");
        String s = sc.nextLine();
        pattern(s);
    }
}

/* Output := 
        Enter a String := 
        Vadodara
                V 
               V a 
              V a d 
             V a d o 
            V a d o d 
           V a d o d a 
          V a d o d a r 
         V a d o d a r a 
*/

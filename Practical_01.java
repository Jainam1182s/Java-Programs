/* Question := Use Cramer's rule to solve the following 2 X 2system of linear equations for x and y:
               ax + by = e x = (ed - bf)/(ad - bc)
               cx + dy = f y = (af - ec)/(ad -bc)
               --> Write a Java program that prompts the user to enter the constants a, b, c, d, e 
                   and f and the display the solution (x =?? and y =??). If ad-bc is 0, then your
                   program prints “The equation has no solution".*/

import java.util.Scanner;

public class Practical_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();

        if(((a*d)-(b*c)) == 0 || e == 0 || f == 0){
            System.out.println("The equation has no solution.");
        }

        else{
            float x = (((e*d)-(b*f)) / ((a*d)-(b*c)))/ e ;
            float y = (((a*f)-(e*c)) / ((a*d)-(b*c))) / f ;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}

/* Output :=
        Enter Values : 
        a = 23
        b = 24
        c = 35
        d = 12
        e = 56
        f = 2
        x = -0.019756839
        y = 1.6968085
*/

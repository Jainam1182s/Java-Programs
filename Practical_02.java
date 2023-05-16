/* Question := Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in 
               kilograms and dividing by the square of your height in meters. Write a program that prompts the user
               to enter a weight in pounds and height in inches and displays the BMI.
                
               Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters */

import java.util.Scanner;

public class Practical_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Weight in pounds:= ");
        float pounds= sc.nextFloat();

        float kg=pounds*0.45359237f;
        System.out.println( "Weight in kilograms:= "+kg);

        System.out.print("Height in inches:= ");
        float inches= sc.nextFloat();

        float h=inches*0.0254f;
        System.out.println("Height in meters:=" + h);

        float BMI=kg/(h*h);
        System.out.println("Body Mass Index(BMI):= "+BMI);

    }
}

/* Output := 
        Weight in pounds:= 25
        Weight in kilograms:= 11.339809
        Height in inches:= 35
        Height in meters:=0.889
        Body Mass Index(BMI):= 14.348359
*/

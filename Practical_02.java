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

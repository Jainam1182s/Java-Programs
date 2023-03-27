import java.util.Scanner;

public class Practical_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in METERS:= ");
        float meter = sc.nextFloat();
        float feet = meter * 3.28084f;
        System.out.println("Value of Feet:= " + feet);
    }
}
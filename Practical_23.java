import java.util.Scanner;

public class Practical_23 {
    Double Area;

    Practical_23(double radius) {
        Area = (Double) (3.14 * radius * radius);
    }

    Practical_23(int radius) {
        Area = (Double) (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius in Double := ");
        double r1 = sc.nextDouble();
        Practical_23 p1 = new Practical_23(r1);
        Practical_23 p2 = new Practical_23((int)r1);
        System.out.println("Area of the circle is := " + p1.Area);
        System.out.println("Area of the circle is := " + p2.Area);
    }
}

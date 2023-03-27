import java.util.Scanner;

public class Practical_1 {
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
            //System.out.printf("x = %.2f\n", x);
            System.out.println("y = " + y);

        }
    }
}

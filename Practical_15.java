import java.util.Scanner;

public class Practical_15 {
    public static int gcd(int a, int b) {
        byte flag = 0;
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for(int j=i; j>1; j--) {
            if (a % j == 0 && b % j == 0) {
                System.out.println(j);
                flag = 1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("1");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integers := ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        gcd(a, b);
    }
}

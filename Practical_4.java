import java.util.Scanner;

public class Practical_4 {
    static void checkPrime(int n){
        byte flag = 0;
        if(n == 0||n == 1){
            System.out.println(n+" is not prime number.");
        }
        else{
            for (int i = 2; i <= n/2; i++) {
                if(n%i == 0) {
                    System.out.println(n+" is not prime number.");
                    flag = 1;
                    break;
                }
                /*
                else {
                     System.out.println(n+" is prime number.");
                }
                */
            }
            if(flag == 0) {
                System.out.println(n+" is prime number.");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        int n = sc.nextInt();
        checkPrime(n);
    }
}

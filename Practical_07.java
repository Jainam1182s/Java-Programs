import java.util.Scanner;

public class Practical_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String := ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println();
        System.out.println("Second-Half of the String is := ");
        System.out.println(str.substring(length/2,length));
    }
}

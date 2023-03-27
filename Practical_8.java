import java.util.Scanner;

public class Practical_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String := ");
        String s = sc.nextLine();
        char c;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        System.out.println(count);
    }
}

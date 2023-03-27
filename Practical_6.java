import java.util.Scanner;

public class Practical_6 {
    static void checkVowel(int x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println("Vowel");
        }
        else if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character := ");
        char x = sc.next().charAt(0);
        checkVowel(x);
    }
}

import java.util.Scanner;

public class Practical_16 {
    public static void reverse(int[] arr) {
        int i = 0, temp;
        while (i < arr.length / 2) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter at Position " + (i + 1) + " := ");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("After reversing numbers in an Array :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value at Position " + (i + 1) + " := " + arr[i]);
        }
    }
}

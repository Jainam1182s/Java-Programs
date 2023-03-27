//This Program is run on terminal.

import java.util.Arrays;
import java.util.Scanner;

public class Practical_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}

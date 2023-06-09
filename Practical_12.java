/*Question := Assume a vehicle plate number consists of three uppercase letters followed by
              four digits. Write a program to generate a plate number.*/

import java.util.Random;

public class Practical_12 {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt(1000,9999);
        int n = 'Z' - 'A' + 1;
        char ch;
        String alpha = "";
        for (int i = 0; i < 3; i++) {
            ch = (char) ('A' + Math.random() * n);
            alpha += ch;
        }
        System.out.println(alpha + num);
    }
}

/*
Output := 
IYV9221
*/

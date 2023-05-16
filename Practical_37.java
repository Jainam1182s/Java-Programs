/* Question := Write a program to copy the content of one file to another file. */

import java.io.*;
import java.util.*;

class Practical_37{
    public static void main(String[] arg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name := ");
        String source = sc.nextLine();
        System.out.print("Enter destination file name := ");
        String destination = sc.nextLine();
        FileReader fin = new FileReader(source);
        FileWriter fout = new FileWriter(destination, true);
        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        System.out.println("Copy finish...");
        fin.close();
        fout.close();
    }
}

/* Output := 
        Enter source file name := Jainam
        Enter destination file name := Study
        Copy finish...
*/

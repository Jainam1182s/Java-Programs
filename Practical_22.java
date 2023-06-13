/*Question := Write a program of constructor overloading and make zero argument constructor 
              to set a default values of student name, roll no and total marks. And make 
              another constructor with all the three parameters and make use of ‘this’ 
              keyword. Using methods, display values of both the constructors.*/

import java.util.Scanner;

public class Practical_22 {
    String name;
    int enroll;
    int marks;
    Practical_22() {
        this.name = "Jainam";
        System.out.println(this.name);
        this.enroll = 2101201075;
        this.marks = 488;
    }

    Practical_22(String name, int enroll, int marks) {
        this.name = name;
        this.enroll = enroll;
        this.marks = marks;
    }

    public void display() {
        System.out.println(name);
        System.out.println(enroll);
        System.out.println(marks);
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practical_22 p1 = new Practical_22();

        System.out.println("Before Updating := ");
        p1.display();

        System.out.println("=======================================");

        System.out.println("For Update := ");
        System.out.println("Enter Name of Student :=");
        String name = sc.nextLine();
        System.out.println("Enter Enrollment No. :=");
        int enroll = sc.nextInt();
        System.out.println("Enter Total Marks :=");
        int marks = sc.nextInt();

        Practical_22 p2 = new Practical_22(name, enroll, marks);

        System.out.println("=======================================");

        System.out.println("After Updating := ");
        p2.display();

    }
}
/*
Output := 
Before Updating := 
Jainam
2101201075
488
=======================================
For Update := 
Enter Name of Student :=
John
Enter Enrollment No. :=
2101201205
Enter Total Marks :=
79
=======================================
After Updating := 
John
2101201205
79
*/

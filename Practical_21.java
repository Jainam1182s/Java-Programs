/*Question := Write an application that declares a class named Person. It should have instance 
              variables to record name, age & salary. Use the new operator to create a Person 
              object. Set & display its instance variables.*/

import java.util.Scanner;

public class Practical_21 {
    String name;
    int age;
    int salary;
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Person := ");
        name = sc.nextLine();
        System.out.println("Enter Age of := ");
        age = sc.nextInt();
        System.out.println("Enter Salary of := ");
        salary = sc.nextInt();
    }

    public void setData(String name, int age, int salary) {
        System.out.println("Name of Person is := " + name);
        System.out.println("Age of " + name + " is := " + age);
        System.out.println("Salary of " + name + " is := " + salary);
    }

    public static void main(String[] args) {
        Practical_21 pr = new Practical_21();
        pr.getData();
        System.out.println();
        System.out.println("=========================================================");
        System.out.println();
        pr.setData(pr.name, pr.age, pr.salary);
    }
}

/*
Output := 
Enter name of Person := 
John
Enter Age of := 
20
Enter Salary of := 
25000

=========================================================

Name of Person is := John
Age of John is := 20
Salary of John is := 25000
*/

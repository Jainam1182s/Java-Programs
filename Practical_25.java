/*Question := Write a program to create a class called Teaching having one member nameOfSubject
              and another class called NonTeaching having member typeOfWork. Both the classes 
              extend the Employee class. Provide information of two Teaching and two NonTeaching 
              employees. Print all the information of employee by the given empNo. */

import java.util.Scanner;

class Teaching extends Employee{
    String nameOfSubject;
    public Teaching(int empNo, String Name, int Age, int Salary, String nameOfSubject) {
        super(empNo, Name, Age, Salary);
        this.nameOfSubject = nameOfSubject;
    }
}

class NonTeaching extends Employee{
    String typeOfWork;
    public NonTeaching(int empNo, String Name, int Age, int Salary , String typeOfWork) {
        super(empNo, Name, Age, Salary);
        this.typeOfWork = typeOfWork;
    }
}

class Employee {
    int no;
    String name;
    int age;
    int salary;
    public Employee(int empNo, String Name, int Age, int Salary) {
        this.no = empNo;
        this.name = Name;
        this.age = Age;
        this.salary = Salary;
    }
}

public class Practical_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[4];
        employees[0] = new Teaching(1001,"Akshay",24,28000, "Mathematics");
        employees[1] = new Teaching(1002,"Devanshi",26,23000, "Physics");
        employees[2] = new NonTeaching(2001,"Nikhil",32,46000,"Clerical");
        employees[3] = new NonTeaching(2002,"Jhanvi",27,55000,"Janitorial");

        System.out.print("Enter Employee ID := ");
        int empNo = sc.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.no == empNo) {
                found = true;
                if (emp instanceof Teaching t) {
                    System.out.println();
                    System.out.println("===: Teaching Staff :===");
                    System.out.println("Employee ID     :=  " + t.no);
                    System.out.println("Employee Name   :=  " + t.name);
                    System.out.println("Employee Age    :=  " + t.age);
                    System.out.println("Employee Salary :=  " + t.salary);
                    System.out.println("Name of Subject :=  " + t.nameOfSubject);
                } else if (emp instanceof NonTeaching nt) {
                    System.out.println();
                    System.out.println("===: Non-Teaching Staff :===");
                    System.out.println("Employee ID     :=  " + nt.no);
                    System.out.println("Employee Name   :=  " + nt.name);
                    System.out.println("Employee Age    :=  " + nt.age);
                    System.out.println("Employee Salary :=  " + nt.salary);
                    System.out.println("Type of Work    :=  " + nt.typeOfWork);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with empNo " + empNo + " not found.");
        }
    }
}

/*
Output :=
Enter Employee ID := 2001

===: Non-Teaching Staff :===
Employee ID     :=  2001
Employee Name   :=  Nikhil
Employee Age    :=  32
Employee Salary :=  46000
Type of Work    :=  Clerical
*/

import java.util.Scanner;

public class Practical_24 {
    String name;
    int age;
    int emp_no = 1;
    int salary;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name := ");
        name = sc.nextLine();
        System.out.print("Enter the age := ");
        age = sc.nextInt();
        System.out.print("Enter the Salary := ");
        salary = sc.nextInt();
    }

    public void display() {
        System.out.println("Employee Name := " + name);
        System.out.println("Employee Age := " + age);
        System.out.println("Employee No. := " + emp_no);
        System.out.println("Employee Salary := " + salary);
    }

    public static void main(String[] args) {

        Practical_24[] pr = new Practical_24[10];
        for(int i=0; i<10; i++) {
            pr[i] = new Practical_24();
            pr[i].getInput();

            System.out.println("**** Data Entered as below ****");
            pr[i].emp_no = pr[0].emp_no + i;
            pr[i].display();


        }
    }
}

import java.util.Scanner;

public class Practical_22 {
    String name;
    int enroll;
    int marks;
    Practical_22() {
        this.name = "Jainam";
        System.out.println(this.name);
        this.enroll = 2101201075;
        //System.out.println(this.enroll);
        this.marks = 488;
        //System.out.println(this.marks);
    }

    Practical_22(String name, int enroll, int marks) {
        this.name = name;
        //System.out.println(name);
        this.enroll = enroll;
        //System.out.println(enroll);
        this.marks = marks;
        //System.out.println(marks);
    }

    public void display() {
        System.out.println(name);
        System.out.println(enroll);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Update := ");
        System.out.println("Enter Name of Student :=");
        String name = sc.nextLine();
        System.out.println("Enter Enrollment No. :=");
        int enroll = sc.nextInt();
        System.out.println("Enter Total Marks :=");
        int marks = sc.nextInt();

        Practical_22 p1 = new Practical_22();
        Practical_22 p2 = new Practical_22(name, enroll, marks);

        System.out.println("=======================================");

        System.out.println("Before Updating := ");
        p1.display();

        System.out.println("=======================================");

        System.out.println("After Updating := ");
        p2.display();

    }
}

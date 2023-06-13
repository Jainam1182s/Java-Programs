/*Question := Write a program that declares an abstract class A with an abstract method 
              display( ). Provide subclasses A1 & A2 that each implements this method. 
              Create instance of these subclasses & invoke that method. */

abstract class A {
    public abstract void display();
}

class A1 extends A {
    public void display() {
        System.out.println("This is A1 class.");
    }
}

class A2 extends A {
    public void display() {
        System.out.println("This is A2 class.");
    }
}
public class Practical_27 {
    public static void main(String[] args) {
        A a1 = new A1();
        A a2 = new A2();

        a1.display();
        a2.display();
    }
}

/*
Output :=
This is A1 class.
This is A2 class.
*/

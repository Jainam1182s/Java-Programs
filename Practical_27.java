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

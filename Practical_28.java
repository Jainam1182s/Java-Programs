interface Shape2D {
    double getArea();
}

interface Shape3D {
    double getVolume();
}

abstract class Shape {
    public abstract void display();
}

class Circle extends Shape implements Shape2D {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (3.14) * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("The area of the circle is :=" + getArea());
    }
}

class Sphere extends Shape implements Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return ((double) 4 /3) * (3.14) * radius * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("The volume of the sphere is := " + getVolume());
    }
}
public class Practical_28 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Sphere sphere = new Sphere(3);

        circle.display();
        sphere.display();
    }
}

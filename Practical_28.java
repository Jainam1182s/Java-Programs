/*Question := Write a program using interface inheritance. Make two interfaces one is Shape2D 
              which contains a method to calculate the area of the circle and the second 
              interface Shape3D which contains method to calculate the volume of the sphere. 
              Both the classes, Circle and Sphere extends one abstract class Shape which 
              contains a method display( ) to display the area and volume.*/

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

/*
Output := 
The area of the circle is :=78.5
The volume of the sphere is := 113.03999999999998
*/

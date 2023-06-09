/*Question := Create a class Vehicle, which has single variable NoOfWheels. Develop 
              two subclasses, TwoWheeler and FourWheeler. Develop subclasses of 
              these 2 subclasses. Create instances of these classes and print 
              appropriate details. (use super keyword). */

class Vehicle {
    protected int noOfWheels;

    public Vehicle(int wheels) {
        noOfWheels = wheels;
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        super(2);
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler() {
        super(4);
    }
}

class Scooter extends TwoWheeler {
    public Scooter() {
        String type = "Scooter";
        System.out.println("Type of vehicle  := " + type);
        System.out.println("Number of wheels := " + noOfWheels);
        System.out.println();
    }
}

class Motorcycle extends TwoWheeler {
    public Motorcycle() {
        String type = "Motorcycle";
        System.out.println("Type of vehicle  := " + type);
        System.out.println("Number of wheels := " + noOfWheels);
        System.out.println();
    }
}

class Car extends FourWheeler {
    public Car() {
        String type = "Car";
        System.out.println("Type of vehicle  := " + type);
        System.out.println("Number of wheels := " + noOfWheels);
        System.out.println();
    }
}

class SUV extends FourWheeler {
    public SUV() {
        String type = "SUV";
        System.out.println("Type of vehicle  := " + type);
        System.out.println("Number of wheels := " + noOfWheels);
        System.out.println();
    }
}

public class Practical_26 {
    public static void main(String[] args) {
        Scooter sc = new Scooter();
        Motorcycle mc = new Motorcycle();
        Car car = new Car();
        SUV suv = new SUV();
    }
}

/*
Output := 
Type of vehicle  := Scooter
Number of wheels := 2

Type of vehicle  := Motorcycle
Number of wheels := 2

Type of vehicle  := Car
Number of wheels := 4

Type of vehicle  := SUV
Number of wheels := 4
*/

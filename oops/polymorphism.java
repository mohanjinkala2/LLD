//Polymorphism is the ability of an object to take on many forms
//Types of Java Polymorphism
//1)Compile Time Polymorphism-method overloading
//2)Run Time Polymorphism-method overriding

//*****************************************************************************************************************

//1) Java Example: Compile Time Polymorphism

class  method_overloading{
  // method to add two integers
  public int addition(int x, int y) {
    return x + y;
  }

  // method to add three integers
  public int addition(int x, int y, int z) {
    return x + y + z;
  }

  // method to add two doubles
  public double addition(double x, double y) {
    return x + y;
  }
}



//*****************************************************************************************************************

//2) Java Example: Run Time Polymorphism

class Vehicle {
  public void displayInfo() {
    System.out.println("Some vehicles are there.");
  }
}

class Car extends Vehicle {
  // Method overriding
  @Override //here when we inheritance vehicle class we also inheritance its method displayInfo so now we have two methods with same name this cause confusion to place @override keyword before a method(this is will execute)
  public void displayInfo() {
    System.out.println("I have a Car.");
  }
}

class Bike extends Vehicle {
  // Method overriding
  @Override
  public void displayInfo() {
    System.out.println("I have a Bike.");
  }
}


//*****************************************************************************************************************


public class polymorphism{
  // Main method
  public static void main(String[] args) {
    // Creating an object of the method_overloading method
    method_overloading number = new method_overloading();

    // calling the overloaded methods
    int res1 = number.addition(444, 555);
    System.out.println("Addition of two integers: " + res1);

    int res2 = number.addition(333, 444, 555);
    System.out.println("Addition of three integers: " + res2);

    double res3 = number.addition(10.15, 20.22);
    System.out.println("Addition of two doubles: " + res3);


    Vehicle v1 = new Car(); // Upcasting
    Vehicle v2 = new Bike(); // Upcasting

    // Calling the overridden displayInfo() method of Car class
    v1.displayInfo();

    // Calling the overridden displayInfo() method of Bike class
    v2.displayInfo();
  }
}





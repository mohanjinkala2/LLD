# **Composition:**

**What is Composition?**

   -->Composition is a design principle in OOP where one class contains an instance (or instances) of another class as a field. The contained class is often called a 
      component, and the containing class is referred to as a composite class. This helps in building complex systems by combining simpler objects.
      
   -->composition represents a "has-a" relationship.

>**Example:**

        _____________ 
       |             |-->Car_object(container_object or containing_object)
       |   _______   |
       |  |       |--|-->Engine_object(contained_object)
       |  |______ |  |
       |_____________|

       -->Consider a Car that consists of multiple components like an Engine, Wheel, and Transmission. Instead of inheriting from these components, a Car object 
         will contain them as fields:
         
         class Engine {
         private int horsepower;

         public Engine(int horsepower) {
         this.horsepower = horsepower;
         }

         public void start() {
         System.out.println("Engine started with " + horsepower + " HP.");
         }
         }

         class Wheel {
         private String type;

         public Wheel(String type) {
         this.type = type;
         }

         public void rotate() {
         System.out.println("The " + type + " wheel is rotating.");
         }
         }

         class Transmission {
         private String type;

         public Transmission(String type) {
         this.type = type;
         }

         public void shiftGear() {
         System.out.println("Transmission shifted: " + type);
         }
         }

         class Car {
         private Engine engine;
         private Wheel wheel;
         private Transmission transmission;

         public Car(Engine engine, Wheel wheel, Transmission transmission) {
         this.engine = engine;
         this.wheel = wheel;
         this.transmission = transmission;
         }

         public void drive() {
         engine.start();
         wheel.rotate();
         transmission.shiftGear();
         System.out.println("Car is moving!");
         }
         }

         public class CompositionExample {
         public static void main(String[] args) {
         Engine engine = new Engine(150);
         Wheel wheel = new Wheel("Alloy");
         Transmission transmission = new Transmission("Automatic");
        
         Car car = new Car(engine, wheel, transmission);
         car.drive();
         }
         }
       
>**Key Characteristics of Aggregation:**

    -->Represents a has-a relationship.
    -->The contained object can not exist independently of the container.
    -->Implemented using references (pointers) to objects.
    -->Promotes tight coupling between objects.

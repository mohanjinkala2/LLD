class pen{
    //Define attributes or properties
    //1)nstance Variable
    //Belong to the object (instance) of the class.Each object has its own copy.Accessed through the object(objectname.instance_varible_name eg:pen1.color).
    String color;//Instance Variables-A variable that is declared inside a class but outside all the methods and blocks is an instance variable. The general scope of an instance variable is throughout the class except in static methods
    //2)Class (Static) Variables
    //Belong to the class itself, not to any one object.Shared among all instances.Can be accessed using the class name(classname.static_Variable_name).
    //Static is used when all objects have same attribute or method.
    //A variable that is declared inside a class, outside all the blocks, and is marked static is known as a class variable. The general scope of a class variable is throughout the class
    static int type;

    //methods
    public void write(){
        int a=10;//local variable
        System.out.println("writing something");
    }
    //constrator 
    //Types-1)no parameter constrator
    pen(){
         System.out.println("This is constrator");  //here 2 constrator with pen name have this is polymorphism 
     }
    //2)parameter constrator
    pen(String col,int typ){
        this.color=col;//(this) is like self in python
        
        System.out.println("This is pen constrator");
    }
}
public class oops{
    public void main(){
        //creating object
        pen pen1=new pen("red",6);
        pen pen2=new pen("Blue",4);
        System.out.println(pen.type);
        System.out.println(pen1.color);
        System.out.println(pen2.color);
    }

}
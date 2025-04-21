//Default Access Modifier
//Default access modifier means we do not explicitly declare an access modifier for a class, field, method, etc.
//A variable or method declared without any access control modifier is available to any other class in the same package.
//default public
class Client1{
    int phone_no;
    String Name;
    void getinfo(){
        System.out.println(this.phone_no);
        System.out.println(this.Name);
      }
    Client1(int number,String name){
        this.phone_no=number;
        this.Name=name;
    }

}


//Private Access Modifier
//Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.
//Private access modifier is the most restrictive access level. Class and interfaces cannot be private.
//Variables that are declared private can be accessed outside the class, if public getter methods are present in the class.
//Variables that are declared private can be modified outside the class, if public setter methods are present in the class.
//Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.
class Client2{
    private int phone_no;
    private String Name;
    //default(public) Getter method
    void getter(){
        System.out.println(this.phone_no);
        System.out.println(this.Name);
      }
    //constrator
    Client2(int number,String name){
        this.phone_no=number;
        this.Name=name;
    }
    //default(public) setter method
    void setter(int number,String name){
        this.phone_no=number;
        this.Name=name;
    }
}


//Protected Access Modifier
//Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses in other package or any class within the package of the protected members' class.
//The protected access modifier cannot be applied to class and interfaces. Methods, fields can be declared protected, however methods and fields in a interface cannot be declared protected.
//Protected access gives the subclass a chance to use the helper method or variable, while preventing a nonrelated class from trying to use it.
class Client3{
    protected int phone_no;
    protected String Name;
    protected void getinfo(){
        System.out.println(this.phone_no);
        System.out.println(this.Name);
      }
    Client3(int number,String name){
        this.phone_no=number;
        this.Name=name;
    }
}


//Public Access Modifier
//A class, method, constructor, interface, etc. declared public can be accessed from any other class. Therefore, fields, methods, blocks declared inside a public class can be accessed from any class belonging to the Java Universe.
//However, if the public class we are trying to access is in a different package, then the public class still needs to be imported. Because of class inheritance, all public methods and variables of a class are inherited by its subclasses.
class Client4{
    public int phone_no;
    public String Name;
    public void getinfo(){
        System.out.println(this.phone_no);
        System.out.println(this.Name);
      }
    Client4(int number,String name){
        this.phone_no=number;
        this.Name=name;
    }
}
public class Access_modififers{
    public void main(){
        Client1 person=new Client1(7989590,"mohan");
        Client2 person1=new Client2(9963368,"pavan");
        Client3 person2=new Client3(8247638,"hari");
        Client4 person3=new Client4(9898989,"laki");
        person.getinfo();
        person1.getter();
        person2.getinfo();
        person3.getinfo();
    }
}
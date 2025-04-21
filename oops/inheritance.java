//A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
//constrator of parent class is invoked using super keyword.(super) keyword is similar to (this) keyword. 
//super keyword is used to differentiate the members of superclass from the members of subclass, if they have same names.
//If a class is inheriting the properties of another class, the subclass automatically call the default constructor(non parameterized constructor) of the superclass. But if there is a  parameterized constructor of the superclass, you need to use the super keyword as shown below.
//With the use of the extends keyword, the subclasses will be able to inherit all the properties of the superclass except for the private properties of the superclass.
class vehical{
    String name;
    int tyre;
    private int price;//this will not inheritance to subclass
    public void info(String hi){
        System.out.println(this.name);
        System.out.println(this.tyre);
    }
     vehical(){
         System.out.println("vechical called1");
     }
    // vehical(String name,int tyre){
    //     System.out.println("vechical called");
    //     this.name=name;
    // }
}
class hondacar extends vehical{
    // public void info(int id){
    //     System.out.println();
    // }
    hondacar(int tyre,String name){
      //  super(name,tyre); This we need to use if base class has parameter constrator
        this.name=name;
        this.tyre=tyre;
        System.out.println("Hondacar called");
    }

}

public class inheritance{
    public void main(){
        hondacar car1=new hondacar(4,"h21");
        car1.info("check");

    }
}
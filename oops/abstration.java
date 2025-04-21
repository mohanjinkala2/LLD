//Abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
//Java abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
//But, if a class has at least one abstract method, then the class must be declared abstract.
//If a class is declared abstract, it cannot be instantiated(can't be used to create object).
//To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
abstract class vehical{
       int tyre;//we can't use abstract for attribtes
       String color;
       abstract void speed();//when we declare a method as abstract we can't specify it's funtion.And this method must be implement in subclass(derived_class) see(1).
       void start(){
        System.out.println("start engine");
       }
       vehical(){
        System.out.println("vehical started");
       }
}
class car extends vehical{
       void speed(){
        System.out.println("speed of this car");//(1)
       }
       void info(){
        System.out.println(this.color);
        System.out.println(this.tyre);
       }
       car(int tyre,String color){
        this.color=color;
        this.tyre=tyre;
        System.out.println("car started");
       }
}
public class abstration {
        public void main(){
            car car1=new car(4,"red");
            //vehical vehical1=new vehical()->this will not work as vehical class was abstracted
            car1.start();
            car1.speed();
            car1.info();
        }
    
}

//You cannot instantiate(create object for this interface class) an interface.
//An interface does not contain any constructors.
//All of the methods in an interface are abstract.
//An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
//An interface is not extended by a class; it is implemented by a class.
//An interface can extend multiple interfaces.

interface vehical1{
      String color="red";//->in interface we can't use instance variable,we can only use static and final variable.
      public void speed();//we can declare method but can't implement(same like abstract method) in interface.
      //vehical();->constract is not present in interface.

}
interface engine1{
    public void start();
}
interface engine2 extends engine1{//one interface can extends other interface. 
    public void stop();
}
class car1 implements vehical1,engine1{//like this we can implement >=1 no.of interfaces.
    int tyre;
    String color;
    public void speed(){
        System.out.println("car speed");
    }
   public void start(){
        System.out.println("engine was started");
    }
    car1(int ty,String col){
        this.tyre=ty;
        this.color=col;
    }
}


public class interface1{
    public void main(){
        car1 car2=new car1(4,"Blue");
        car2.start();
        System.out.println(car2.color);
    }
}

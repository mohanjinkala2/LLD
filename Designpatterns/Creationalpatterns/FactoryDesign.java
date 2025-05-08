package Designpatterns.Creationalpatterns;
interface vehical{
    void start();
    void stop();
}
class Car implements vehical{
     public void start(){
        System.out.println("car Started");
     }
     public void stop(){
        System.out.println("car Stoped");
     }
}
class Truck implements vehical{
    public void start(){
        System.out.println("Truck Started");
     }
     public void stop(){
        System.out.println("Truck Stoped");
     }
}
class Bus implements vehical{
    public void start(){
        System.out.println("Bus Started");
     }
     public void stop(){
        System.out.println("Bus Stoped");
     }
}
class VehicalsFactory{
   public static vehical getVehical(String s){
      if(s.equals("car")){
         return new Car();
      }
      else if(s.equals("truck")){
         return new Truck();
      }
      else if(s.equals("bus")){
         return new Bus();
      }
      else{
         throw new IllegalArgumentException("Unknow vehical type");
      }
   }
}

public class FactoryDesign{
    public void main(){
     try{ vehical v1=VehicalsFactory.getVehical("car");
          v1.start();
          vehical v2=VehicalsFactory.getVehical("bike");
          v1.start();
    }
    catch(IllegalArgumentException w){
        System.out.println(w.getMessage());
    }

    }
}
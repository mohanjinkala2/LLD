//it consider we have some devices(fan,ac,light) in room,and rooms in floor,and floors in house
//if we need to turnon devices in room or in floor or in house onces,we can use composite pattern
//here in this example individual objects are devices where composite objects are room,floor,house
//this design pattern treats individual objects and composite objects(group of objects) uniformly
//individual objects and composite objects(group of objects) implements common interaface ,and
//composite objects(group of objects) delegate actions to children 
package Designpatterns.Structurepatterns;
import java.util.ArrayList;
interface Device{
    void turnOn();
    void turnOff();
}
class ac implements Device{
    public void turnOn(){
        System.out.println("ac was turn oned");
    }
    public void turnOff(){
        System.out.println("ac was turn offed");
    }
}
class light implements Device{
    public void turnOn(){
        System.out.println("light was turn oned");
    }
    public void turnOff(){
        System.out.println("light was turn offed");
    }
}
class room implements Device{
     ArrayList<Device> devices;
     room(){
        devices=new ArrayList<>();
     }
     void addDevices(Device device){
        devices.add(device);
     }
    public void  turnOn(){
        System.out.println("turn on devices ");
        for(Device Dev:devices){
            Dev.turnOn();
        }
    }
    public void  turnOff(){
        for(Device Dev:devices){
            Dev.turnOff();
        }
    }
}
class floor implements Device{
    ArrayList<room> rooms;
    floor(){
       rooms=new ArrayList<>();
    }
    void addRooms(room Room){
       rooms.add(Room);
    }
   public void  turnOn(){
       System.out.println("turn on rooms ");
       for(room Room:rooms){
           Room.turnOn();
       }
   }
   public void  turnOff(){
       for(room Room:rooms){
           Room.turnOff();
       }
   }
}
class house implements Device{
    ArrayList<floor> floors;
    house(){
       floors=new ArrayList<>();
    }
    void addFloors(floor Floor){
       floors.add(Floor);
    }
   public void  turnOn(){
       System.out.println("turn on floor ");
       for(floor Floor:floors){
           Floor.turnOn();
       }
   }
   public void  turnOff(){
       for(floor Floor:floors){
           Floor.turnOff();
       }
   }
}
public class compositeDesign {
    public void main(){
        ac Ac=new ac();
        light Light=new light();
        room Room=new room();
        floor Floor=new floor();
        house House=new house();
        Room.addDevices(Ac);
        Room.addDevices(Light);
        Floor.addRooms(Room);
        House.addFloors(Floor);
        House.turnOn();

    }
}

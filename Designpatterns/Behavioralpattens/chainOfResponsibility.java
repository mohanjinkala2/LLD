//imagine your in relay race --each runner passes the baton until best suited one finishes the race.
//exactly in this design --a request is passed along a chain of objects until one of them finish processes(excute) it. 
package Designpatterns.Behavioralpattens;
abstract class person {
     public person pointer;
     void addpointer(person new1){
        pointer=new1;
     }
     abstract void processapplication(int file); 
}
class supervisor extends person{
    void processapplication(int file){
        if(file<=3){
            System.out.println("Completed by supervisor");
        }
        else{
            pointer.processapplication(file);
        }
    }
} 
class manager extends person{
    void processapplication(int file){
        if(file<=10){
            System.out.println("Completed by manager");
        }
        else{
            pointer.processapplication(file);
        }
    }
} 
class director extends person{
    void processapplication(int file){
        if(file<=20){
            System.out.println("Completed by director");
        }
        else if(pointer==null){
            System.out.println("Sorry No one above");
        }
    }
} 
public class chainOfResponsibility {
    public void main(){
       person supervisor1=new supervisor();
       person manager1=new manager();
       person director1=new director();
       supervisor1.addpointer(manager1);
       manager1.addpointer(director1);
       supervisor1.processapplication(189);
    }
}

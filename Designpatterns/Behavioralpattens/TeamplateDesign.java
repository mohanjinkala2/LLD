//this helps in code reusability,and other
//let consider tea and coffee preparation has 3 common steps,instead of writing code for coffee and tea sepearatly we create 
//one abstract class which was extends by tea and coffee class
package Designpatterns.Behavioralpattens;
abstract class prepare{
    void make(){
       startHeater();
       boilWater();
       mixPowder();
       OtherItems(); 
       pourIntocup();
    }
    void boilWater(){
        System.out.println("water was boiled");
    }
    void startHeater(){
        System.out.println("stove was turn on");
    }
    void pourIntocup(){
        System.out.println("Poured into cup");
    }
    abstract void mixPowder();//this are different in different classes so we abstracted this.no each class implements there own mixpower funtion
    abstract void OtherItems();//this are different in different classes so we abstracted this.
}
class Tea extends prepare{
         void mixPowder(){
            System.out.println("Tea power is mixed");
         }
         void OtherItems(){
            System.out.println("is Required we add other");
         }
}

class Coffee extends prepare{
    void mixPowder(){
       System.out.println("Coffee power is mixed");
    }
    void OtherItems(){
       System.out.println("is Required we add other");
    }
}
public class TeamplateDesign {
    public void main(){
        prepare tea=new Tea();
        tea.make();
    }
}

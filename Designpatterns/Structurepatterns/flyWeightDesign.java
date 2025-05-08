//imagine there is 1000 objects with same property values.so we end of duplicating values ,this caused memory wastage
//to slove this we use flyweight pattern 
//here we store duplicate values in one object,this object is shared by all other.  
package Designpatterns.Structurepatterns;
import java.util.HashMap;
class shareclass{ //figwight class
    public int hands;
    public int legs;
    shareclass(int hands,int legs){
        this.hands=hands;
        this.legs=legs;
    }
}
class players{
    public shareclass common;
    String color;
    String name;
    players(shareclass common,String color,String name){
        this.common=common;
        this.color=color;
        this.name=name;
    }
    
}
class Factoryclass{
    HashMap<String,shareclass>share;
    Factoryclass(){
        this.share=new HashMap<>();
    }
    public shareclass getflyweight(int hands,int legs){
        if(!share.containsKey(Integer.toString(legs)+" "+Integer.toString(hands))){
            share.put(Integer.toString(legs)+" "+Integer.toString(hands),new shareclass(hands,legs));
        }
        return share.get(Integer.toString(legs)+" "+Integer.toString(hands));
    } 
}
public class flyWeightDesign {
    public void main(){
        Factoryclass factory=new Factoryclass();
        shareclass share=factory.getflyweight(4, 4);
        players player1=new players(share, "red", "1");
        players player2=new players(share, "white", "2");
        players player3=new players(share, "Black", "3");
        
    }
}

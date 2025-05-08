package Designpatterns.Behavioralpattens;
import java.util.ArrayList;
class Bidders1{
    public String name;
    public int Bid;
    Bidders1(String name){
        this.name=name;
        Mediator.addBidders(this);
    }
    void placeBid(int amount,Mediator mid){
        this.Bid=amount;
        mid.notifying(this,Bid);
    }
}
class Mediator{
    public String name;
    static public ArrayList<Bidders1> bidders;
    static public Mediator instance=null;
    private Mediator(String name){
        this.name=name;
        this.bidders=new ArrayList<>();
    }
    static Mediator Getinstance(String name){
        if(instance==null){
            instance=new Mediator(name);
        }
        return instance;
    }
    static void addBidders(Bidders1 bidder){
        bidders.add(bidder);
    }
    void notifying(Bidders1 name,int amount){
        for(Bidders1 Bidder:bidders){
            if(Bidder!=name){
                System.out.println("Notified about bid of "+name.name+" to "+Bidder.name);
            }
        }
    }

}
public class mediatorDesign {
    void main(){
        Mediator midman=Mediator.Getinstance("Sri");
        System.out.println(System.currentTimeMillis());
        Bidders1 mohan=new Bidders1("mohan");
        Bidders1 pavan=new Bidders1("pavan");
        Bidders1 pavan11=new Bidders1("pavan11");
        mohan.placeBid(100000,midman);
    }
}

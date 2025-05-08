//instead of executing a object method directly here we create command object that executes commands indirectly when ever required.
//this helps in decouple the request from the object which perform that request
package Designpatterns.Behavioralpattens;
import java.util.ArrayList;
class Tv{
    public String name;
    Tv(String name){
        this.name=name;
    }
    void IncreaseVolume(int V){
        System.out.println("volume is increased to "+V);
    }
    void DecreaseVolume(int V){
        System.out.println("volume is Decreased to "+V);
    }
    void changeChannel(String channel){
        System.out.println("Channel was Changed to "+channel);
    }
    void offTv(){
        System.out.println("Tv was offed");
    }
    void onTv(){
        System.out.println("Tv was on");
    }
}
interface command{
    public void Executes();
}
class IncreaseVolume implements command{
    public Tv tv;
    public int volume;
    IncreaseVolume(Tv tv,int vol){
        this.tv=tv;
        this.volume=vol;

    }
    public void Executes(){
         tv.IncreaseVolume(volume);
    }
}
class DecreaseVolume implements command{
    public Tv tv;
    public int volume;
    DecreaseVolume(Tv tv,int vol){
        this.tv=tv;
        this.volume=vol;

    }
    public void Executes(){
         tv.DecreaseVolume(volume);
    }
}
class changeChannel implements command{
    public Tv tv;
    public String channel;
    changeChannel(Tv tv,String channel){
        this.tv=tv;
    }
    public void Executes(){
         tv.changeChannel(channel);
    }
}
class Remote{
    static void Command(command New){
        New.Executes();
    }
}
public class commandDesign {
    void main(){
        Tv tv=new Tv("samsung");
        IncreaseVolume IncreaseVolume1=new IncreaseVolume(tv, 15);
        DecreaseVolume DecreaseVolume1=new DecreaseVolume(tv, 10);
        ArrayList<command>ListOfcommand=new ArrayList<>();
        IncreaseVolume1.volume=45;
        ListOfcommand.add(IncreaseVolume1);
        DecreaseVolume1.volume=12;
        ListOfcommand.add(DecreaseVolume1);
        for(command com:ListOfcommand){
            Remote.Command(com);
        }

    }
}

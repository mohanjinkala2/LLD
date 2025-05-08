//This pattern allows one object to notify other objects whenever there is change in its state.
package Designpatterns.Behavioralpattens;
import java.util.ArrayList;
interface subScriber1{
    public void subscribe(youtubechannel1 channel);
   public  void unsubscribe(youtubechannel1 channel);
    public void getUpdate(String new1);
}
interface youtubechannel1{
    public void addSubscriber(subScriber1 Sub);
    public void removeSubscriber(subScriber1 Sub);
    public void upload(String New);
    public void notification();
}
class gmailSubscriber1 implements subScriber1{
    private String mail;
    gmailSubscriber1(String mail){
        this.mail=mail;
    }

    public void subscribe(youtubechannel1 channel){
        channel.addSubscriber(this);
    }
    public void unsubscribe(youtubechannel1 channel){
        channel.removeSubscriber(this);
    }
    public void getUpdate(String new1){
        System.out.println("new Video was uploade "+mail+" "+new1);   
    }

}
class pushSubscriber implements subScriber1{
    private String name;
    pushSubscriber(String name){
        this.name=name;
    }
    public void subscribe(youtubechannel1 channel){
        channel.addSubscriber(this);
    }
    public void unsubscribe(youtubechannel1 channel){
        channel.removeSubscriber(this);
    }
    public void getUpdate(String new1){
        System.out.println("new Video was uploade "+name+" "+new1);   
    }

}
class Youtubechannel implements youtubechannel1{
    private ArrayList<subScriber1> subscribers;
    private String Video;
    public String channelName;
    public Youtubechannel(String name){
        channelName=name;
        this.subscribers=new ArrayList<>();
    }
    public void addSubscriber(subScriber1 Sub){
        subscribers.add(Sub);
    }
    public void removeSubscriber(subScriber1 Sub){
        subscribers.remove(Sub);
    }
    public void upload(String New){
        this.Video=New;
        notification();
    }
    public void notification(){
        for(subScriber1 subscriber:subscribers){
            subscriber.getUpdate(this.Video);
        }
    }
}
public class observerDesign {
    public void main(){
        youtubechannel1 channelYt=new Youtubechannel("YT");
        subScriber1 mohan=new pushSubscriber("mohan");
        subScriber1 pavan=new gmailSubscriber1("pavan@gmail.com");
        mohan.subscribe(channelYt);
        pavan.subscribe(channelYt);
        channelYt.upload("Pak vs Ind");
    }
}

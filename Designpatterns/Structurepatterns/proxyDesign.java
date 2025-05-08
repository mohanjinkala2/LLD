//proxy design helps to provide placeholder(proxy) to another object,this proxy control access to it(online video stream platform).
//ex:-consider any online video stream platform,if any user create an account in that platform ,it(online video stream platform)
//create a proxy for user ,this proxy control access to online video stream platform.
//so whenever we click a video this proxy checks,is the user has access to this video or not,if has access
//then it send video play request to online video stream platform.
//proxy and real_object(online video stram platform) has a common interface 
package Designpatterns.Structurepatterns;
import java.util.HashMap;
interface common{
    void play_video(String userName,String videoName);
}
class video_player implements common{
      public void play_video(String userName,String videoName){
        System.out.println("playing "+videoName+" as per "+userName+" request");
      }
}
class proxy_of_video_player implements common{
    HashMap<String,String> Cache =new HashMap<>();
    HashMap<String,Integer> RequestLimit=new HashMap<>();
    video_player plotFormName;
    proxy_of_video_player(video_player plotFormName){
        this.plotFormName=plotFormName;
    }
    public void play_video(String userName,String videoName){
        if(!RequestLimit.containsKey(userName)){
            RequestLimit.put(userName, 1);
        }
        else{
            RequestLimit.put(userName, RequestLimit.get(userName)+1);
        }
        if(RequestLimit.get(userName)<3){
            if(!Cache.containsKey(userName)){
                Cache.put(userName, videoName);
                plotFormName.play_video(userName, videoName);
            }
            else{
                System.out.println("already video is playing as per your request");
            }
        }
        else{
            System.out.println("access denied as your request limit exceed");
        }
    }
}
public class proxyDesign {
    public void main(){
        video_player YT =new video_player();
        proxy_of_video_player yt_proxy =new proxy_of_video_player(YT);
        yt_proxy.play_video("mohan", "etvnews");
        yt_proxy.play_video("mohan", "etvnews");
        yt_proxy.play_video("mohan", "etvnews1");
    }
}

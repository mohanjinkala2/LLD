//facade(simplifying complexity with a unified interface) 
//Lets consider a music player ,working of music player requires intializing audio drivers,decoding audio formats,managing playback
//so when an user wants to play a music,he has to do all this things in music player.
//but user want a simple,intuitive interface to interact with application like he press start music button and stop music and button
//all interior work are show to user, this can be done using facade pattern
package Designpatterns.Structurepatterns;
class musicPlayer{
    void intializing_Audio_Driver(){
        System.out.println("start intializing audio drivers");
    }
    void decoding_Audio_Formats(){
        System.out.println("start decoding audio formats");
    }
    void managing_Playback(){
        System.out.println("start managing playback");
    }
    void Start_playing(){
        System.out.println("music is playing");
    }
}
class Tv{
    void turnOn(){
        System.out.println("tv is turnOn");
    }
    void Putchannel(){
        System.out.println("tv Channel is playing");
    }
    void turnOff(){
        System.out.println("tv is turnOff");
    }
}
class multiMedia{
    musicPlayer musicplayer;
    Tv tv;
    multiMedia(){
        this.musicplayer=new musicPlayer();
        this.tv=new Tv();
    }
    public void perfromAction(String action){
        if(action.equals("musicPlayer")){
            musicplayer.intializing_Audio_Driver();
            musicplayer.decoding_Audio_Formats();
            musicplayer.Start_playing();
            musicplayer.managing_Playback();
        }
        if(action.equals("Tv")){
            tv.turnOff();
            tv.Putchannel();
            tv.turnOn();
        }
    }
}
public class facadeDesign {
    public void main(){
    multiMedia multimedia=new multiMedia();
    multimedia.perfromAction("musicPlayer");
    }
}

//This is used to traverse a collection of objects
package Designpatterns.Behavioralpattens;

import java.util.ArrayList;

import java.util.Collections;
interface playlist{
   public boolean hadNext();
   public String next();
}
class simplesongplayer implements playlist{
    public ArrayList<String>songs;
    public int PresentSong;
    simplesongplayer(ArrayList<String> s){
        this.songs=s;
        PresentSong=0;
    }
    @Override
    public boolean hadNext(){
        if(PresentSong<this.songs.size()){
            return true;
        }
        return false;
    }
    @Override
    public String next(){
        return songs.get(PresentSong++);
    }
}
class shufflesongplayer implements playlist{
    public ArrayList<String>songs;
    public int PresentSong;
    shufflesongplayer(ArrayList<String> s){
        this.songs=new ArrayList<>(s);
        Collections.shuffle(songs);
        PresentSong=0;
    }
    @Override
    public boolean hadNext(){
        if(PresentSong<this.songs.size()){
            return true;
        }
        return false;
    }
    @Override
    public String next(){
        return songs.get(PresentSong++);
    }
}
class songsPalyer{
    public ArrayList<String>songs;
    void Add(String S){
        songs.add(S);
    }
    songsPalyer(){
        this.songs=new ArrayList<>();
    }
    public playlist playsongs(String Type){
        if(Type.equals("simple")){
            return new simplesongplayer(this.songs);
        }
        else if(Type.equals("Shuffle")){
            return new shufflesongplayer(songs);
        }
        return null;
    }
}
public class iteratorDesign {
    public void main(){
        songsPalyer Maxplay=new songsPalyer();
        Maxplay.Add("Devara");
        Maxplay.Add("Dragon");
        Maxplay.Add("Kalki");
        playlist simple=Maxplay.playsongs("Shuffle");
        while(simple.hadNext()){
            System.out.println(simple.next());
        }

    }
}

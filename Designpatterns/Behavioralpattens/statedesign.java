//this help to change behaviour of class according to state
//gas->liquid->soild->gas repeat
package Designpatterns.Behavioralpattens;
interface state{
       void next(pointer context);
       String type();
}
class gas implements state{
    public String name;
    public static state instance;
    private gas(String name){
        this.name=name;
    }
    public static state Getinstance1(String name){
        if(instance==null){
            instance=new gas(name);
        }
        return instance;
    }
    public void next(pointer context){
        context.setstate(liquid.Getinstance1("liquid"));
    }
    public  String type(){
        return this.name;
    }
}
class liquid implements state{
    public String name;
    public static state instance;
    liquid(String name){
        this.name=name;
    }
    public static state Getinstance1(String name){
        if(instance==null){
            instance=new liquid(name);
        }
        return instance;
    }
    public void next(pointer context){
        context.setstate(solid.Getinstance1("solid"));
    }
    public  String type(){
        return this.name;
    }
}
class solid implements state{
    public String name;
    public static state instance;
    solid(String name){
        this.name=name;
    }
    public static state Getinstance1(String name){
        if(instance==null){
            instance=new solid(name);
        }
        return instance;
    }
    public void next(pointer context){
        context.setstate(gas.Getinstance1("gas"));
    }
    public  String type(){
        return this.name;
    }
}
interface pointer{
   public void next();
   public void setstate(state new1);
   public void type();
}
class handiler implements pointer{
    public state currentState;
    handiler(){
        this.currentState=gas.Getinstance1("gas");
    }
    public void next(){
        currentState.next(this);
    }
    public void setstate(state new1){
        this.currentState=new1;
    }
    public void type(){
        System.out.println(currentState.type());
    }

}
public class statedesign {
    public void main(){
        pointer point=new handiler();
        point.type();
        point.next();
        point.type();
        point.next();
        point.type();
        point.next();
        point.type();
    }
}

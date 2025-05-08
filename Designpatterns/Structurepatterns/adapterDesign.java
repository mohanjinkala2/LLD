//lets consider an example when we are in usa we have socket board with stright holes ,so that our charger with stright pins
//can put into holes and charge our devices but when we are in india we have a round holes socket,so now we cannot charge our device
//as our charger has stright pins which not fix into round holes.
//so in this case we use adater which help to connect this stright pins charger and round holes socket.
//means adapter pattern helps to connect two different classes without altering any class.
package Designpatterns.Structurepatterns;
interface device{
    void turnOff();
    void turnOn();
}
class Ac{
    void connectAc(){
        System.out.println("Ac was Access via wifi");
    }
    void turnOnAc(){
        System.out.println("Ac was turnOned");
    }
    void turnOff(){
        System.out.println("Ac was turnOff");
    }
    void disConnecteAc(){
        System.out.println("Ac was disconnected");
    }
}
//new ac model which can connect only throught blutooth ,now we have two ways 1)create new adapter or 2)modify existing adapter
class Acblutooth{
    void connectAc(){
        System.out.println("Ac was Access via blutooth");
    }
    void turnOnAc(){
        System.out.println("Ac was turnOned");
    }
    void turnOff(){
        System.out.println("Ac was turnOff");
    }
    void disConnecteAc(){
        System.out.println("Ac was disconnected");
    }
}
class acAdapter implements device{
    public Ac ac;
    acAdapter(Ac ac){
        this.ac=ac;
    }
    public void turnOn(){
        ac.connectAc();
        ac.turnOnAc();
    }
    public void turnOff(){
        ac.turnOff();
        ac.disConnecteAc();
    }

}
//so now we need to use new adapter for connecting to new blutooth ac
class acBlutoothAdapter implements device{
    public Acblutooth ac;
    acBlutoothAdapter(Acblutooth ac){
        this.ac=ac;
    }
    public void turnOn(){
        ac.connectAc();
        ac.turnOnAc();
    }
    public void turnOff(){
        ac.turnOff();
        ac.disConnecteAc();
    }

}
public class adapterDesign {
    public void main(){
        Ac ac=new Ac();
        Acblutooth newAc=new Acblutooth();
        acAdapter adapter=new acAdapter(ac);
        acBlutoothAdapter newAdapter=new acBlutoothAdapter(newAc);
        adapter.turnOn();
        adapter.turnOff();
        System.out.println();
        newAdapter.turnOn();
        newAdapter.turnOff();
    }
}

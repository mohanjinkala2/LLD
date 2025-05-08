package Designpatterns.Creationalpatterns;
//method1-without Factory
class carproto implements Cloneable{
    public int seats;
    public String color;
    carproto(int seats,String color){
        this.seats=seats;
        this.color=color;
    }
    @Override
    public carproto clone() throws CloneNotSupportedException {
        return  (carproto)super.clone();
    }
}
//method2-with factory
class busproto implements Cloneable{
    public int seats;
    public String color;
    public busproto(int seats,String color){
        this.seats=seats;
        this.color=color;
    }
    @Override //cannot give error even we cannot mention
    public busproto clone() throws CloneNotSupportedException{
        return (busproto)super.clone();
    }
}
class protoFactory {
    public busproto original;
    public protoFactory(){
        original=new busproto(10,"Green");
     }
     public busproto createProto() throws CloneNotSupportedException{
        busproto Demo=(busproto) original.clone();
        return Demo;
     }
     public busproto createProtoSeats(int seats) throws CloneNotSupportedException{
        busproto Demo=(busproto) original.clone();
        Demo.seats=seats;
        return Demo;
     }
}
public class prototypeDesign {
    public void main(){
        carproto car1=new carproto(6,"red");
        protoFactory busFactory1=new protoFactory();
        try {
            carproto car2=car1.clone();
            car2.seats=8;
            busproto bus2=busFactory1.createProto();
            bus2.seats=25;
            busproto bus3=busFactory1.createProtoSeats(40);
            System.out.println(car2.seats +" " + car1.seats+" "+bus2.seats+" "+bus3.seats);
        }
        catch(CloneNotSupportedException e){
             System.out.println("clone not implemented");
        }

    }
}

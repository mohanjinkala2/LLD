package Designpatterns.Creationalpatterns;
class car{
    private String color;
    private int seats;
    private String engine;
    private boolean sunRoof;
    private boolean Ac;
    private car(carBuilder b){
        this.color=b.color;
        this.seats=b.seats;
        this.engine=b.engine;
        this.sunRoof=b.sunRoof;
        this.Ac=b.Ac;
    }

    public String getColor(){
        return this.color;
    }
    public int getseats(){
        return this.seats;
    }
    public String getengine(){
        return this.engine;
    }
    public boolean getac(){
        return this.Ac;
    }
    public static class carBuilder{
        private String color="red";
        private int seats=4;
        private String engine="Horse1";
        private boolean sunRoof=true;
        private boolean Ac=false;
        public carBuilder setColor(String color){
            this.color=color;
            return this;
        }
        public carBuilder setseats(int seats){
            this.seats=seats;
            return this;
        }
        public carBuilder setengine(String engine){
            this.engine=engine;
            return this;
        }
        public carBuilder setac(boolean Ac){
            this.Ac=Ac;
            return this;
        }
        public car build(){
          return new car(this);
        }


    }
}
public class builderFuntion {
    public void main(){
        car.carBuilder builder=new car.carBuilder();
        car car1=builder.setColor("white").setseats(6).setengine("house4").setac(true).build();
        System.out.println(car1.getseats());
    }
}

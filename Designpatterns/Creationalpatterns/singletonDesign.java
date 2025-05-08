package Designpatterns.Creationalpatterns;
class inventoryManager{
    private int id;
     String name;
    private int salary;
    private static inventoryManager instance;
    private inventoryManager(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static inventoryManager getInstance(int id,String name){
        if(instance==null){
            instance=new inventoryManager(id,name);
        }
        return instance;
    }
}
public class singletonDesign {
    public void main(){
        inventoryManager manager=inventoryManager.getInstance(1210600, "sai");
        inventoryManager manager1=inventoryManager.getInstance(12106002, "kumar");
        if(manager==manager1){
            System.out.println("Same"+manager1.name);
        }
    }
}

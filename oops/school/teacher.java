package school;

public class teacher {
     String name;
     int id;
     int salary;
     public void get(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.salary);
     }
     public teacher(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
     }
}

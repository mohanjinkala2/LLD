package school;

public class student1{
     String name;
     int roll_no;
     String Grade;
     public void get(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
     }
     public student1(String name,int roll_no,String grade){
        this.name=name;
        this.roll_no=roll_no;
        this.Grade=grade;
     }
}


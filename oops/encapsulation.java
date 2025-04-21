//Encapsulation is the concept of wrapping data (variables) and code (methods) together as a single unit and (restricting direct access) to some of the object’s component.
//Encapsulation is implemented by:
//1. Declaring variables as private
//2. Providing public getter and setter methods to access and update the private variables.
class student{
    private String name;
    private int roll_no;
    private long phone_no;
    
    //getter method
    void getInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.phone_no);
    }
    //setter method
    void setInfo(String name,int roll_no,long phone_no){
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
    }
    //constator can be used as setter and getter but once's only at the time of object creation. 
    student(String name,int roll_no,long phone_no){
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
    }
}
public class encapsulation{
    public void main(){
        student st=new student("mohan", 12106022, 79895905);
        st.getInfo();//so we indirectly access private members this is called encapsulation.

    }
}

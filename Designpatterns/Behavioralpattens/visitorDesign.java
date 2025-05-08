//imagine if a patient go to hospital a different types of visitors(doctor,biller,nurse,etc) came to meet patient ,
//so if patient has all this opertions(methods like dignolasis for doctor etc) then it may become problamatic.
//so we visitor Design 
package Designpatterns.Behavioralpattens;
interface patient{
    public void acceptVisitor(Visitor visitor);
}
class childPatient implements patient{
    public void acceptVisitor(Visitor visitor){
         visitor.visit(this);
    }
}
class adultPatient implements patient{
    public void acceptVisitor(Visitor visitor){
         visitor.visit(this);
    }
}
interface Visitor{
    void visit(childPatient child);
    void visit(adultPatient adult);
}
class doctor implements Visitor{
    public void visit(childPatient child){
        System.out.println("Doctor visited child");
    }
    public void visit(adultPatient adult){
        System.out.println("Doctor visited child");
    }
}
public class visitorDesign {
    public void main(){
    patient new1=new childPatient();
    patient new2=new adultPatient();
    Visitor doctor1=new doctor();
    new1.acceptVisitor(doctor1);
}
}

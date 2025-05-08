//this help to change behavioral of object dynamically
//Example payment method
package Designpatterns.Behavioralpattens;

interface paymentMethod {
    public void ProcessPayment();   
}
class phonepay implements paymentMethod{
    @Override
    public void ProcessPayment(){
        System.out.println("phonepay Payment processing");
    }
}
class googlepay implements paymentMethod{
    @Override
    public void ProcessPayment(){
        System.out.println("googlepay Payment processing");
    }
}
class paythmpay implements paymentMethod{
    @Override
    public void ProcessPayment(){
        System.out.println("paythmpay Payment processing");
    }
}
class payment{
      public paymentMethod presentPaymethod;
      public payment(paymentMethod presentPaymethod){
        this.presentPaymethod=presentPaymethod;
      }
      void ProcessPayment(){
        presentPaymethod.ProcessPayment();
      }
      void changePaythm(paymentMethod presentPaymethod){
        this.presentPaymethod=presentPaymethod;
      }
}
public class StrategyDesign{
    public static void main(){
        paymentMethod p1=new googlepay();
        paymentMethod p2=new paythmpay();
        paymentMethod p3=new phonepay();
        payment Payment1=new payment(p1);//initize with p1
        Payment1.ProcessPayment();
        Payment1.changePaythm(p2);
        Payment1.ProcessPayment();


    }
}
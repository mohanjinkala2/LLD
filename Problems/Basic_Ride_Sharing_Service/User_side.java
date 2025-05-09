package Problems.Basic_Ride_Sharing_Service;
import Problems.Basic_Ride_Sharing_Service.*;
public class User_side {
    public void main(){
        Rider_Driver User1=UserFactory.Create_Account("Mohan", 798950);
        Rider_Driver User2=UserFactory.Create_Account("Pavan", 996336);
        Rider_Driver User3=UserFactory.Create_Account("sri", 824763);
        Rider_Driver User4=UserFactory.Create_Account("yerri", 824763);
        User2.RideOn(2, 2);
        User3.RideOn(1,2);
        User1.BookRide(1, 1, 3, 4);
        System.out.print("Your Last Ride Is ");
        for(int check:User1.Rider_history.peek()){
            System.out.print(check+" ");
        }
        User2.RideOff();
        User3.RideOff();

    }
}

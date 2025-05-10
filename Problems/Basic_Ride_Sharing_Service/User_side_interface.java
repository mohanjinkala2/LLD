package Problems.Basic_Ride_Sharing_Service;

import Problems.Basic_Ride_Sharing_Service.*;

public class User_side_interface {

    public void main(){

        Rider_Driver User1=User_Account_Creation_Factory.Create_Account("Mohan", 798950);

        Rider_Driver User2=User_Account_Creation_Factory.Create_Account("Pavan", 996336);

        Rider_Driver User3=User_Account_Creation_Factory.Create_Account("sri", 824763);

        Rider_Driver User4=User_Account_Creation_Factory.Create_Account("yerri", 824763);

        User2.RideOn(2, 2);

        User3.RideOn(1,2);

        User1.BookRide(1, 1, 3, 4);
        
        User1.Rider_History();

        User2.RideOff();

        User3.RideOff();

    }
}

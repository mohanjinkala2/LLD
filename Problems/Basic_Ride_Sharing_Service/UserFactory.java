package Problems.Basic_Ride_Sharing_Service;

public class UserFactory {
    public static Rider_Driver Create_Account(String Name,long PhoneNo){
        Rider_Driver User=Rider_Driver.register(Name,PhoneNo);
        if(User==null){
            System.out.println("Click Forgot UserId To Get Account");
            return null;
        }
        else{
            return User;
        }
    }
}

package Problems.Basic_Ride_Sharing_Service;
import Problems.Basic_Ride_Sharing_Service.Rider_Driver;
import java.util.HashMap;
public class Register {
    static HashMap<Long,Rider_Driver> User_register=new HashMap<>();
    public static boolean check(long phoneNo){
        return User_register.containsKey(phoneNo);
    }
    public static void register(long PhoneNo,Rider_Driver User){
                User_register.put(PhoneNo,User);
    }
    public static Rider_Driver getUserDetails(long PhoneNo){
        return User_register.get(PhoneNo);
    }

}

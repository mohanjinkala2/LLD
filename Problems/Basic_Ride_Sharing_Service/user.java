package Problems.Basic_Ride_Sharing_Service;
import Problems.Basic_Ride_Sharing_Service.*;
public class user {
    private String Name;
    private long PhoneNo;
    user(String Name,long PhoneNo){
        this.Name=Name;
        this.PhoneNo=PhoneNo;
    }
    public String getName(){
        return this.Name;
    }
    public long getNumber(){
        return this.PhoneNo;
    }
}

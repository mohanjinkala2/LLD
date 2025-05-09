package Problems.Basic_Ride_Sharing_Service;
import Problems.Basic_Ride_Sharing_Service.*;
import java.util.Stack;
public class Rider_Driver extends user {
    public int[] location=new int[2];
    private String ID;
    public String status_Of_Trip="None";
    public Stack<int[]> Rider_history=new Stack<>();
    public Stack<int[]> Driver_history=new Stack<>();
    private Rider_Driver(String Name,long PhoneNo){
        super(Name, PhoneNo);
        this.ID=Name+"@"+"Rider.com";
    }
    public static Rider_Driver register(String Name,long PhoneNo){
        if(!Register.check(PhoneNo)){
            Register.register(PhoneNo,new Rider_Driver(Name, PhoneNo));
            return Register.getUserDetails(PhoneNo);
        }
        else{
            System.out.println("User Already Exist Plz continue With Your Exist Account");
            return null;
        }
    }
    public void RideOn(int x,int y){
        location[0]=x;
        location[1]=y;
        Status_Of_Drivers.addNewDriver(this);
    }
    public void BookRide(int pickUp_X_Cooridnates,int pickUp_Y_Cooridnates,int destination_X_Cooridnates,int destination_Y_Cooridnates){
        status_Of_Trip="Requested";
        Online_Ride_plotForm.Book_Ride(pickUp_X_Cooridnates,pickUp_Y_Cooridnates,destination_X_Cooridnates,destination_Y_Cooridnates,this);
        
    }
    public void updateLocation(int x,int y){
        location[0]=x;
        location[1]=y;
    }
    public Rider_Driver Forgot_UserId(long PhoneNo){
        return Register.getUserDetails(PhoneNo);
    }
    public String getId(){
        return this.ID;
    }
    public void RideOff(){
        Status_Of_Drivers.removeDriver(this);
    }
    
}

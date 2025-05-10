package Problems.Basic_Ride_Sharing_Service;

public class Last_Ride_Checking {
    
    public static void Check_History_Rider(Rider_Driver Rider){

        int[] RideHistory=Rider.Rider_history.peek();

        System.out.print("Your Last Ride Is From "+RideHistory[0]+","+RideHistory[1]+" To "+RideHistory[2]+","+RideHistory[3]);

    }
    public static void Checking_History_Driver(Rider_Driver Driver){

        int[] DriverHistory=Driver.Driver_history.peek();

        System.out.print("Your Last Ride Is From "+DriverHistory[0]+","+DriverHistory[1]+" To "+DriverHistory[2]+","+DriverHistory[3]);

    }

}

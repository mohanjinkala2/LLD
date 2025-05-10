package Problems.Basic_Ride_Sharing_Service;

import Problems.Basic_Ride_Sharing_Service.*;

public class Online_Ride_plotForm {

    public static void Book_Ride(int pickUp_X_Cooridnates,int pickUp_Y_Cooridnates,int destination_X_Cooridnates,int destination_Y_Cooridnates,Rider_Driver Rider){

     if(!Status_Of_Drivers.Available_Driver_List.isEmpty()){

        double nearDistance=10000000;

        Rider_Driver Driver=null;

        for(Rider_Driver Checking_near_Driver:Status_Of_Drivers.Available_Driver_List){

            int x=Checking_near_Driver.location[0];

            int y=Checking_near_Driver.location[1];

            double check=Math.sqrt((Math.pow(Math.abs(x-pickUp_X_Cooridnates),2)+Math.pow(Math.abs(y-pickUp_Y_Cooridnates),2)));

            if(nearDistance>=check){

                Driver=Checking_near_Driver;

                nearDistance=check;

            }

        }
        System.out.println("Your Driving Partner Is "+Driver.getName());

        System.out.println("Your Driving Partner Is Arrived At Your PickUp Location");

        Rider.status_Of_Trip="Ongoing";

        System.out.println("You Reached Your Destination "+Integer.toString(destination_X_Cooridnates)+", "+Integer.toString(destination_Y_Cooridnates));

        int[] last_Ride={pickUp_X_Cooridnates,pickUp_Y_Cooridnates,destination_X_Cooridnates,destination_Y_Cooridnates};

        Rider.Rider_history.push(last_Ride);

        Driver.Driver_history.push(last_Ride);

    }

    else{

        System.out.println("Sorry No Driver Is Available");

    }
        
    }
    

    
}

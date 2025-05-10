package Problems.Basic_Ride_Sharing_Service;

import Problems.Basic_Ride_Sharing_Service.Rider_Driver;

import java.util.ArrayList;

public class Status_Of_Drivers {

   static public ArrayList<Rider_Driver> Available_Driver_List=new ArrayList<>();

    public static void addNewDriver(Rider_Driver NewDriver){

        if(!Available_Driver_List.contains(NewDriver)){

           Available_Driver_List.add(NewDriver);

        }
        else{

            System.out.println("You Already Turn Oned Your Ride Mode Plz Continue");

        }

    }

    public static void RemoveDriver(Rider_Driver NewDriver){

        if(Available_Driver_List.contains(NewDriver)){

            Available_Driver_List.remove(NewDriver);

        }
        else{

            System.out.println("Sorry You Not Trun Oned Ride Mode,So No Need to Turn Off");

        }
    }
    

}

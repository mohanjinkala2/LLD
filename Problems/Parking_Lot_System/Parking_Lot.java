package Problems.Parking_Lot_System;

import java.util.ArrayList;

public class Parking_Lot implements Parking_Slot_Interface{
    
    public String Parking_Lot_Name;

    public ArrayList<Parking_Floor> List_Of_Floors;

    private static Parking_Lot Instance=null;

    private Parking_Lot(String Name){

        this.Parking_Lot_Name=Name;

        this.List_Of_Floors=new ArrayList<>();

    }
    public static Parking_Lot Create_Lot(String Name){
        if(Instance==null){
            Instance=new Parking_Lot(Name);
        }
        return Instance;
    }

    public String Park_Vehical(Vehical_Interface Parking_Vehical){
        if(this.Check_Availability(Parking_Vehical)){
            for(Parking_Floor Check_Floor:List_Of_Floors){
                 String Ticket=Check_Floor.Park_Vehical(Parking_Vehical);
                 if(Ticket!=null){
                    return Parking_Lot_Name+"_"+Ticket;  
                 }
                 
                }
                return null;
            }
            else{

                System.out.println("Sorry No Slot Available");
                return null;
            }
        }
    

    public void UnPark_Vehical(String[] Check){
        if(Check[0].equals(this.Parking_Lot_Name)){
            for(Parking_Floor Floor:List_Of_Floors){
                Floor.UnPark_Vehical(Check);
            }
        }
            
    }

    public boolean Check_Availability(Vehical_Interface Parking_Vehical){
        for(Parking_Floor Check:List_Of_Floors){
            
            if(Check.Check_Availability(Parking_Vehical)){
             
               return true;

            }
        }
        return false;
    }
    public void Add_Floor(Parking_Floor Floor){

        List_Of_Floors.add(Floor);
        
    }

    public void Remove_Slot(Parking_Floor Floor){

        List_Of_Floors.remove(Floor);

    }
    
}

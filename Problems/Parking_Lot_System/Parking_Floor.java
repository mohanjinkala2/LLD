package Problems.Parking_Lot_System;

import java.util.ArrayList;

public class Parking_Floor implements Parking_Slot_Interface {
    
    public String Floor_Number;

    public ArrayList<Parking_Slot> List_Of_Slots;

    public Parking_Floor(String Floor_Number){

        this.Floor_Number=Floor_Number;

        this.List_Of_Slots=new ArrayList<>();

    }

    public String Park_Vehical(Vehical_Interface Parking_Vehical){
            for(Parking_Slot Check_Slot:List_Of_Slots){
                 String Ticket=Check_Slot.Park_Vehical(Parking_Vehical);
                 if(Ticket!=null){
                    return Floor_Number+"_"+Ticket;  
                 }
                 
                }
                return null;
            

    }

    public void UnPark_Vehical(String[] Check){
        if(Check[1].equals(this.Floor_Number)){
            for(Parking_Slot Slot:List_Of_Slots){
                Slot.UnPark_Vehical(Check);
            }
        
        }
    }

    

    public boolean Check_Availability(Vehical_Interface Parking_Vehical){
        for(Parking_Slot Check:List_Of_Slots){
            
            if(Check.Check_Availability(Parking_Vehical)){
             
               return true;

            }
        }
        return false;
    }
    public void Add_Slot(Parking_Slot Slot){

        List_Of_Slots.add(Slot);

    }

    public void Remove_Slot(Parking_Slot Slot){

        List_Of_Slots.remove(Slot);

    }
}

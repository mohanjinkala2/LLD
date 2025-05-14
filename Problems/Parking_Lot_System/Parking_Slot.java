package Problems.Parking_Lot_System;


public class Parking_Slot implements Parking_Slot_Interface{

    private String Type;

    private String Slot_Number;

    private String Available_Of_Slot;
    public Parking_Slot(String Type){
        this.Type=Type;
        this.Available_Of_Slot="Available";
    }
    public String Park_Vehical(Vehical_Interface Parking_Vehical){
        if(Available_Of_Slot.equals("Available") && Parking_Vehical.Get_Type().equals(this.Type)){
            
            Available_Of_Slot="Not Available";
            return Slot_Number;
        }
        return null;
    }
    public void UnPark_Vehical(String[] Check){
        if(Check[2].equals(this.Slot_Number)){
            if(Available_Of_Slot.equals("Available")){
                System.out.println("Sorry Your vehical Was Missing");
            }
            else{
                System.out.println("Your vehical Was Unparked,Thanks Foe Using Our Parking Lot");
                Available_Of_Slot="Available";
            }
    }
}
    public boolean Check_Availability(Vehical_Interface Parking_Vehical){
        if(Available_Of_Slot.equals("Available") && Parking_Vehical.Get_Type().equals(this.Type) ){
            return true;
        }
        return false;
    }
    public void Set_Slot_Type(String Number){
        this.Slot_Number=Number;
    }
    public String Get_Slot_Type(){
            return this.Type;
    }

    public String Get_Slot_Number(){
        return this.Slot_Number;
    }
    public String Get_Status(){
        return this.Available_Of_Slot;
    }
}


package Problems.Parking_Lot_System;
import java.util.HashMap;
public class Factory_For_Parking_Lot {
    public static Parking_Lot Create_Parking_Lot(String Lot_Name,int Number_Of_Floors,int Number_Of_Slots){
              Parking_Lot Lot=new Parking_Lot(Lot_Name);
              for(int i=1;i<=Number_Of_Floors;i++){
                
                Parking_Floor Floor=new Parking_Floor(Integer.toString(i));
                HashMap<String,Integer>Slot_Map=new HashMap<>();
                for(int j=1;j<=Number_Of_Slots;j++){
                    Parking_Slot Slot;
                   
                    if(j==1){
                        Slot=new Parking_Slot("Truck");
                        Slot.Set_Slot_Type(Integer.toString(j));
                        if(Slot_Map.containsKey("Truck")){
                            Slot_Map.put("Truck",Slot_Map.get("Truck")+1);
                        }
                        else{
                            Slot_Map.put("Truck", 1);
                        }
                        
                    }
                    else if(j==2){
                        Slot=new Parking_Slot("Bike");
                        Slot.Set_Slot_Type(Integer.toString(j));
                        if(Slot_Map.containsKey("Bike")){
                            Slot_Map.put("Bike",Slot_Map.get("Bike")+1);
                        }
                        else{
                            Slot_Map.put("Bike", 1);
                        }
                    }
                    else{
                        Slot=new Parking_Slot("Car");
                        Slot.Set_Slot_Type(Integer.toString(j));
                        if(Slot_Map.containsKey("Car")){
                            Slot_Map.put("Car",Slot_Map.get("Car")+1);
                        }
                        else{
                            Slot_Map.put("Car", 1);
                        }
                    }
                    Floor.Add_Slot(Slot);
                }
                Tracking_Occupied_And_Free_Slots.Free_Space(Integer.toString(i), Slot_Map);
                Lot.Add_Floor(Floor);
              }
              return Lot;

    }
    public static Vehical_Interface Create_Vehical(String Type,String Color,String Registration_Number){
        Vehical_Interface vehical=null;
        if(Type.equals("Bike")){
            vehical=new Bike(Type, Color, Registration_Number);
        }
        else if(Type.equals("Truck")){
            vehical=new Truck(Type, Color, Registration_Number);
        }
        else{
            vehical=new Car(Type, Color, Registration_Number);
        }
        return vehical;
    }
}

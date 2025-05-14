package Problems.Parking_Lot_System;
import java.util.HashMap;
public class Tracking_Occupied_And_Free_Slots {
    public static HashMap<String,HashMap<String,Integer>> Floor_Occupied=new HashMap<>();
    public static HashMap<String,HashMap<String,Integer>> Floor_Free=new HashMap<>();
    public static void Free_Space(String Floor,HashMap<String,Integer> Slots){
        
        Floor_Free.put(Floor, Slots);

    }
    public static void Remove_Free_Space(String Floor,String Slot){
        Floor_Free.get(Floor).put(Slot, Floor_Free.get(Floor).get(Slot)-1);

    }
}

package Problems.Parking_Lot_System;

public interface Parking_Slot_Interface{

    public String Park_Vehical(Vehical_Interface Parking_Vehical);

    public void UnPark_Vehical(String[] Check);

    public boolean Check_Availability(Vehical_Interface Parking_Vehical);

}

package Problems.Parking_Lot_System;

public class User_Interface {
    public void main(){
        Parking_Lot Lot=Factory_For_Parking_Lot.Create_Parking_Lot("MohanComplex", 10, 10);
        Vehical_Interface My_Vehical=Factory_For_Parking_Lot.Create_Vehical("Bike","Black","AP02");
        String Ticket=Lot.Park_Vehical(My_Vehical);
        Lot.UnPark_Vehical(Ticket.split("_"));
        Parking_Lot Lot1=Factory_For_Parking_Lot.Create_Parking_Lot("PavanComplex", 10, 10);
       
    }
}

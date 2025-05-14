package Problems.Parking_Lot_System;

public class Vehical_Interface {

    private String Type;

    private String Color;

    private String Registration_Number;

    public Vehical_Interface(String Type,String Color,String Registration_Number){
        this.Color=Color;
        this.Registration_Number=Registration_Number;
        this.Type=Type;
    }
    public String Get_Type(){

        return this.Type;
    }

    public String Get_Registration_Number(){

        return this.Registration_Number;

    }

    public String Get_Color(){

        return this.Color;

    }
    public void Set_Type(String Type){
        
        this.Type=Type;

    }

    public void Set_Registration_Number(String Registration_Number){

        this.Registration_Number=Registration_Number;

    }

    public void Set_Color(String Color){
        
        this.Color=Color;
        
    }

}

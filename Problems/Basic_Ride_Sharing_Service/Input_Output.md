# Input:

   **Creating User Account By Using Name And PhoneNumber**
   
        Rider_Driver User1=User_Account_Creation_Factory.Create_Account("Mohan", 798950);

        Rider_Driver User2=User_Account_Creation_Factory.Create_Account("Pavan", 996336);

        Rider_Driver User3=User_Account_Creation_Factory.Create_Account("sri", 824763);
        
   **User Trying To Create a Account with Already Existing PhoneNumber**
   
        Rider_Driver User4=User_Account_Creation_Factory.Create_Account("yerri", 824763);

   **User Can Turn On Ride Mode**
   
        User2.RideOn(2, 2);

        User3.RideOn(1,2);

   **User Can Book A Ride**
   
        User1.BookRide(1, 1, 3, 4);

   **User Can Check His Last Ride As A Rider Or Driver**
   
        User1.Rider_History();

        User1.Driver_History();

  **User Can Turn Off Ride Mode**
  
        User2.RideOff();

        User3.RideOff();

# Output:

   **Output If User Try To Create a Account with Already Existing PhoneNumber**

        User Already Exist Plz continue With Your Exist Account
        
        Click Forgot UserId To Get Account

   **So User Can Use Forgot Feature To Get Account**

      UserObject.ForgotId();

   **Selecting a Near Driver By Using Using Euclidean Distance**

      Your Driving Partner Is sri
      
      Your Driving Partner Is Arrived At Your PickUp Location
      
      You Reached Your Destination 3, 4     

   **User Can Check This Last Ride**

     Your Last Ride Is From 1,1 To 3,4
     

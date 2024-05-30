/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.helper;

/**
 *
 * @author sahithireddy
 */
public class ValidateInputs {
    
    public static boolean isNameValid(String name){        
        if(name.matches("^[a-zA-Z]+[a-zA-Z0-9\\s]+$")){
            return true;
        }return false;
    }
    
    
//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------

    
    public static boolean isUsernameValid(String username){        
        if(username.matches("^[a-zA-Z0-9_!-]+$")){
            return true;
        }return false;
    }
    
    
    
//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------
    
    
    public static boolean isEmailValid(String emailAddress){        
        if(emailAddress.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            return true;
        }return false;
    }



//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------

    public static boolean isPhoneNumberValid(String phoneNum){        
        if(!phoneNum.isEmpty() && phoneNum.matches("^[0-9]+$") && phoneNum.length()==10){
            return true;
        }return false;
    }
    

//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------

    public static boolean isPasswordValid(String password){
        if(!password.isEmpty() && password.matches("^[a-zA-Z0-9]+$") && password.length()>7){  //"^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$"
            return true;
        }return false;
    }
    
    
//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------

    public static boolean isAddressValid(String address){
        if(address.isEmpty() || address.equals("") || address==null || address.trim().isEmpty() || !address.matches("^[#.0-9a-zA-Z,-]+[#.0-9a-zA-Z\\s,-]*$")){
            return false;
        }return true;
    }
    
}

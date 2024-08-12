/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fabian
 */
public class UserSession {
    
    private static BankUser currentBankUser;
    
    public static void setCurrentBankUser(BankUser user){
        currentBankUser = user;
    }

    public static BankUser getCurrentBankUser(){
        return currentBankUser;
    }
}

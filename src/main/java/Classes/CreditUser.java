/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fabian
 */
public class CreditUser extends User{
    
    private long idCreditAccount;
    private long cashCreditAccount;

    public CreditUser(String names, String lastNames, long id, String password, long number, String address, long idCreditAccount, long cashCreditAccount) {
        super(names, lastNames, id, password, number, address);
        this.idCreditAccount = idCreditAccount;
        this.cashCreditAccount = cashCreditAccount;
    }
    
    public CreditUser(){
        
    }

    public long getIdCreditAccount() {
        return idCreditAccount;
    }

    public void setIdCreditAccount(long idCreditAccount) {
        this.idCreditAccount = idCreditAccount;
    }

    public long getCashCreditAccount() {
        return cashCreditAccount;
    }

    public void setCashCreditAccount(long cashCreditAccount) {
        this.cashCreditAccount = cashCreditAccount;
    }

    @Override
    public String toString() {
        return "CreditUser{" + "idCreditAccount=" + idCreditAccount + ", cashCreditAccount=" + cashCreditAccount + '}';
    }

}

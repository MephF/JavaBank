/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fabian
 */
public class DebitUser extends User{
    
    private long idDebitAccount;
    private long cashDebitAccount;

    public DebitUser(String names, String lastNames, long id, String password, long number, String address, long idDebitAccount, long cashDebitAccount) {
        super(names, lastNames, id, password, number, address);
        this.idDebitAccount = idDebitAccount;
        this.cashDebitAccount = cashDebitAccount;
    }

    public long getIdDebitAccount() {
        return idDebitAccount;
    }

    public void setIdDebitAccount(long idDebitAccount) {
        this.idDebitAccount = idDebitAccount;
    }

    public long getCashDebitAccount() {
        return cashDebitAccount;
    }

    public void setCashDebitAccount(long cashDebitAccount) {
        this.cashDebitAccount = cashDebitAccount;
    }

    @Override
    public String toString() {
        return "DebitUser{" + "idDebitAccount=" + idDebitAccount + ", cashDebitAccount=" + cashDebitAccount + '}';
    }
    
}

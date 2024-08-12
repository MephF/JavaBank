/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fabian
 */
public class BankUser extends User {
    
    private String accountType;
    private long accountId;
    private long accountCash;

    public BankUser(long id, String documentType, String names, String lastNames, String password, long number, String address, String accountType, long accountId, long accountCash) {
        super(id, documentType, names, lastNames, password, number, address);
        this.accountType = accountType;
        this.accountId = accountId;
        this.accountCash = accountCash;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getAccountCash() {
        return accountCash;
    }

    public void setAccountCash(long accountCash) {
        this.accountCash = accountCash;
    }

    @Override
    public String toString() {
        return "BankUser{" + "accountType=" + accountType + ", accountId=" + accountId + ", accountCash=" + accountCash + '}';
    }
    
    
    
}

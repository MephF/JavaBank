/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fabian
 */
public class User {

    private long id;
    private String documentType;
    private String names;
    private String lastNames;
    private String password;
    private long number;
    private String address;

    public User(long id, String documentType, String names, String lastNames, String password, long number, String address) {
        this.id = id;
        this.documentType = documentType;
        this.names = names;
        this.lastNames = lastNames;
        this.password = password;
        this.number = number;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", documentType=" + documentType + ", names=" + names + ", lastNames=" + lastNames + ", password=" + password + ", number=" + number + ", address=" + address + '}';
    }
    
    
}

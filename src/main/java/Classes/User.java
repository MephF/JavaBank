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

    private String names;
    private String lastNames;
    private long id;
    private String password;
    private long number;
    private String address;

    public User(String names, String lastNames, long id, String password, long number, String address) {
        this.names = names;
        this.lastNames = lastNames;
        this.id = id;
        this.password = password;
        this.number = number;
        this.address = address;
    }
    
    public User(){
        
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "User{" + "names=" + names + ", lastNames=" + lastNames + ", id=" + id + ", password=" + password + ", number=" + number + ", Address=" + address + '}';
    }  
}

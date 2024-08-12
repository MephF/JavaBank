/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankexample;
import Classes.BankUser;
import Views.Login;
import java.sql.Connection;
import Classes.DbConnection;
import java.sql.SQLException;

/**
 *
 * @author Fabian
 */
public class BankExample {

    public static void main(String[] args) {
        
        try {
            Connection connection = DbConnection.getConnection();
            System.out.println("Connected to the database!");
            // Aquí puedes realizar operaciones con la base de datos
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Login log = new Login();
        log.pack();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }
}

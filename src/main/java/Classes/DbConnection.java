/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fabian
 */
public class DbConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = DbCredentials.get("db.url");
        String username = DbCredentials.get("db.username");
        String password = DbCredentials.get("db.password");
        String driver = DbCredentials.get("db.driver");

        Class.forName(driver); // Cargar el driver de la base de datos

        return DriverManager.getConnection(url, username, password);
    }
   
}

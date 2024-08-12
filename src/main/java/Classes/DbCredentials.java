/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Fabian
 */
public class DbCredentials {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = DbCredentials.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find db.properties");
                throw new IOException("File db.properties not found");
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}

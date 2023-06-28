/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cafeshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ducle
 */
public class database {

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/3306", "root", "123456");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

    }
}

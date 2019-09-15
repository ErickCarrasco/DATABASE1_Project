/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author Erick C
 */
public class Conexion {
    Connection en;

    public Connection conexionbd() {
        try {
            //en = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema", "root", "");
            en = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/OracleDatabase", "Encargado", "12345");
            System.out.println("Conection established");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return en;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Unsupported");
    }
}

package conexionMySQL;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionMySQL {
    Connection co;
    Statement stm;

    public static Connection iniciarConnection(){
        System.out.println("Loading driver...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        System.out.println("Hola system-console desde conexionMyql.java class ");
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("conexionMySQL.conexionMySQL.Driver");
            Class.forName("java.sql.Driver");
            Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
//            Connection co = DriverManager.getConnection("jdbc:mariadb://localhost:3306/abinar_database?user=root&password=root");
            Statement stm = co.createStatement();
            System.out.println("Conectado correctamente a la Base de Datos");
            return co;
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: "+e);
        } catch (SQLException e) {
            System.out.println("Error de conexion: "+e);
        } catch (Exception e) {
            System.out.println("Error desconocido: "+e);
        }
        return null;
    }
    /*Connection conectar = null;
    public Connection conexion(){
        try {
            Class.forName("java.sql.Driver");
            conectar= DriverManager.getConnection("jdbc:mariadb://localhost:3306/abinar_database","root","root");
            JOptionPane.showMessageDialog(null, "Conexion MariaDB exitosa");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion MariaDB:" + e.getMessage());
        }
        return conectar;
    }*/

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;

/**
 *
 * @author herrboh
 */
public class ModeloLogin {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "dineroe";
    private static Integer portnumber = 3306;
    private static String password = "salve3587..";
    private Connection connect;
    private String url = "jdbc:mysql://localhost:3306/dineroe";
    
     public void conectar() {
        try {
            connect = DriverManager.getConnection(url, username, password);
            if (connect != null) {
                System.out.println("Conexión Exitosa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexión\n");
        }
    }

    public void cerrar() {
        try {
            connect.close();
            System.out.println("Cerro Correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en el SS1");
        }
    }
    
    
    public static Connection getConnection()
    {
        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);    
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }
    
    public boolean ValidarU(int usuario, String contrasena) {
        boolean resultado = false;
        String campoDB;
        ResultSet result;
        
        
        try {
            campoDB = "call verificarUsuario(?,?);";
            CallableStatement st = connect.prepareCall(campoDB);
            st.setInt(1, usuario);
            st.setString(2, contrasena);
            result = st.executeQuery();
            while (result.next()) {
                if (result.getString(1).equals(usuario) && result.getString(2).equals(contrasena)) {/**/
                    resultado = true;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error de Validación en la BD");
        }
        return resultado;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
/**
 *
 * @author herrboh
 */
public class modelomenuprincipal {
    
    private String url = "jdbc:mysql://localhost:3306/dineroe";
    private String username = "root";
    private String password = "salve3587..";
    private Connection connect;
    public JLabel label;
    
   
    
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
    
    public int llamarsaldo(int id_usuario, int id_usuario2) {
        int estado;
        try {
            String query = "call consultarSaldo(?,?);";
            CallableStatement st = connect.prepareCall(query);
            st.setInt(1, id_usuario);
            st.setInt(2, id_usuario2);
            
            st.execute();
            estado = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
            estado = 0;
        }
        return estado;
    }
    
    
    
    
    
    public boolean consultarSaldo(int u){
        boolean resultado = true;
        ResultSet result;
        try {
            CallableStatement st = connect.prepareCall("call consultarSaldo(?);");
            st.setInt(1, u);
            result = st.executeQuery();
            
            while (result.next()) {
                if (result.getInt(1)>0) {
                    resultado = false;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al confirmar Datos en La BD");
        }
        return resultado;
        
    }
    
    public Connection getConnect() {
        return connect;
    }

    
    
    
}

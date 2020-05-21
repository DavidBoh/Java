/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class BDRegistro {

    //ruta de la base de datos
    private String url = "jdbc:mysql://localhost:3306/dineroe";
    private String username = "root";
    private String password = "salve3587..";
    private Connection connect;

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

    public int guardaDatos(
            int tipoIdentificacion,
            String nombreUsuario,
            String apellidoUsuario,
            int identificacion,
            String correo,
            String contraseña) {
        int estado;
        try {
            String query = "call crearUsuario(?,?,?,?,?,?);";
            CallableStatement st = connect.prepareCall(query);
            st.setInt(1, tipoIdentificacion);
            st.setString(2, nombreUsuario);
            st.setString(3, apellidoUsuario);
            st.setInt(4, identificacion);
            st.setString(5, correo);
            st.setString(6, contraseña);
            st.execute();
            estado = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear usuario");
            estado = 0;
        }
        return estado;
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

    public boolean confirmarU(int u) {
        boolean resultado = true;
        ResultSet result;
        try {
            CallableStatement st = connect.prepareCall("call consultarUsuario(?);");
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
   /* 
    public boolean confirmarCorreo(String correo) {
        boolean resultado = true;
        ResultSet result;
        try {
            CallableStatement st = connect.prepareCall("call consultarCorreo(?);");
            st.setString(1, correo);
            result = st.executeQuery();
            while (result.next()) {
                if (result.getInt(1)>0) {
                    resultado = false;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al confirmar Correo en La BD");
        }
        return resultado;
    }
    */

    public Connection getConnect() {
        return connect;
    }

}
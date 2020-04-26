/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author GabeL
 */
public class BaseDatos {

    String url = "C:\\Users\\Misael Fernando\\Desktop\\Sqliteman-1.2.2\\clase.db";
    Connection connect;

    public void conectar() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
    }

    public void cerrar() {
        try {
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error en el cierre" + ex.getMessage());
        }
    }

    public int validarUsuario(String Us, String Ps) {
        int estado = 0;
        ResultSet result;
        String claveRes;
        try {
            PreparedStatement st = connect.prepareStatement("select * from usuario where usuario=?");
            st.setString(1, Us);
            result = st.executeQuery();
            while (result.next()) {
                /*System.out.print("ID: ");
                System.out.println(result.getInt("id"));
 
                System.out.print("usuario: ");
                System.out.println(result.getString("usuario"));
 
                System.out.print("Clave: ");
                System.out.println(result.getString("clave"));
 
                System.out.println("=======================");
                 */
                claveRes = result.getString("clave");
                if (claveRes.equals(Ps) && !result.getString("usuario").isEmpty()) {
                    estado = 1;
                } else {
                    estado = 0;
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return estado;
    }

    public int guardaDatos(String Nom, String Cod, String Ape) {
        int estado;
        try {
            PreparedStatement st = connect.prepareStatement("insert into alumno (nombre,codigo,apellido) values (?,?,?)");
            st.setString(1, Nom);
            st.setString(2, Cod);
            st.setString(3, Ape);
            st.execute();
            estado = 1;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            estado = 0;
        }
        return estado;
    }

    public String Buscador(String Dato, int opcion) {
        String resultado = "", campoDB = "";
        ResultSet result;


        try {

            if (opcion == 1) {
                campoDB = "select * from alumno where nombre";
            }
            if (opcion == 3) {
                campoDB = "select * from alumno where codigo";
            }
            if (opcion == 2) {
                campoDB = "select * from alumno where apellido";
            }
            PreparedStatement st = connect.prepareStatement(campoDB + "=?");
            st.setString(1, Dato);
            result = st.executeQuery();
            while (result.next()) {

                resultado = "\nID:" + result.getInt("id")
                        + "\nNombre: " + result.getString("nombre")
                        + "\nApellido: " + result.getString("apellido")
                        + "\nApellido: " + result.getString("codigo")
                        + "\n=======================";

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return resultado;

    }

}

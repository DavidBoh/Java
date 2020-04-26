/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultor;
import java.sql.*;
/**
 *
 * @author misaelinux
 */
public class Modelo {
   
    String url = "C://Usuarios//David//Escritorio//prueba.db";
    Connection connect;

    public void conectar() {
        try {
            connect = DriverManager.getConnection(
                    "jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println(
                    "No se ha podido conectar a la base de datos\n" 
                            + ex.getMessage());
        }
    }

    public void cerrar() {
        try {
            connect.close();
            System.out.println("Cerrada la conexion");
        } catch (SQLException ex) {
            System.out.println("Error en el cierre" + 
                    ex.getMessage());
        }
    }
    
    public String Buscador(int opcion) {
        String resultado = "", campoDB = "";
        ResultSet result;

        try {

            if (opcion == 0) {
                campoDB = "select * from usuarios";
            }
            if (opcion == 1) {
                campoDB = "select * from alumno";
            }
            if (opcion == 2) {
                campoDB = "select * from documentos";
            }
            PreparedStatement st = connect.prepareStatement(campoDB);
            result = st.executeQuery();
            
            
            while (result.next()) {
                if(opcion==0){
                resultado = resultado+
                        "\nID: " + result.getInt("id_usuario")
                        + "\tUsuario: " + result.getString("usuario")
                        + "\tClave: " + result.getString("clave")
                        + "\n=======================";
                }
                if(opcion==1){
                resultado = resultado+
                        "\nID: " + result.getInt("id_alumno")
                        + "\tTipo Documento: " + result.getInt("tip_doc")
                        + "\tPrimer Nombre:" + result.getString("nombre1")
                        + "\tSegundo Nombre:" + result.getString("nombre2")
                        + "\tPrimer Apellido: " + result.getString("apellido1")
                        + "\tSegundo Apellido: " + result.getString("apellido2")
                        + "\n=======================";
                }
                if(opcion==2){
                resultado = resultado+
                        "\nID: " + result.getInt("id_doc")
                        + "\tNombre Documento" + result.getString("nombre")
                        + "\tSigla de Documento: " + result.getString("siglas")
                        + "\n=======================";
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return resultado;

    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.sql.*;

public class Modelo {
    
    String url= "C:\\Users\\ESTUDIANTE\\Desktop\\parcial2.db";
    Connection connect;
    
       public void conectar(){
        try{
            connect=DriverManager.getConnection(
            "jdbc:sqlite:"+url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        }catch (SQLException ex){
                System.err.println("No se ha podido conectar a la base \n"+ex.getMessage());
                }
            
        }
        
    public void cerrar(){
        try{
            connect.close();
            System.out.println("Exito al cerrar conexion");
         }catch(SQLException ex){
             System.out.println("Error al cerrar conexion\n"+ex.getMessage());
         }
    }
    
    public void Salir(){
    System.exit(0);
    }
    
    
    public int guardaDatos(String cod, String nom, String mar, String des, String est, String can, String val){
         int estado;
         try {
             PreparedStatement st=
                     connect.prepareStatement
           ("insert into parcial (codigo, nombre, marca, descripcion, estado, cantidad, valor) values (?,?,?,?,?,?,?)");
             st.setString(1,cod);
             st.setString(2, nom);
             st.setString(3, mar);
             st.setString(4, des);
             st.setString(5, est);
             st.setString(6,can);
             st.setString(7,val);
             st.execute();
             estado = 1;
             
             
       }catch (SQLException ex){
                        System.err.println(ex.getMessage());
                        
                        estado=0;
        }
                
               
        return estado;
        
    }
    
    /*
     public int guardaDatos(int cod, String nom, String mar, String des, String est, int can, int val){
         int estado;
         try {
             PreparedStatement st=
                     connect.prepareStatement
           ("insert into parcial (codigo, nombre, marca, descripcion, estado, cantidad, valor) values (?,?,?,?,?,?,?)");
             st.setInt(1,cod);
             st.setString(2, nom);
             st.setString(3, mar);
             st.setString(4, des);
             st.setString(5, est);
             st.setInt(6,can);
             st.setInt(7,val);
             st.execute();
             estado = 1;
             
             
       }catch (SQLException ex){
                        System.err.println(ex.getMessage());
                        
                        estado=0;
        }
                
               
        return estado;
        
    }
    
    */

   
    
    
    
    
}

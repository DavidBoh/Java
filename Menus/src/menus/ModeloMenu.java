/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author misaelinux
 */
public class ModeloMenu {
   
    public Font Arial(){
     Font x=new Font("Arial",Font.PLAIN,12);
        return x;
    }
    public Font Times(){
     Font x=new Font("Times new roman",Font.PLAIN,12);
        return x;
    }
    public Font Calibri(){
     Font x=new Font("Calibri",Font.PLAIN,12);
        return x;
    }
    
    public Color Negro(){
    Color x=new Color(0,0,0);
    return x;
    }
    
    public Color Verde(){
    Color x=new Color(38,127,0);
    return x;
    }
    public Color Azul(){
    Color x=new Color(0,19,127);
    return x;
    }
    
    public void Salir(){
    System.exit(0);
    }
    
    public Font Tamaño10(Font y){
        Font x=y.deriveFont(10f);
        return x;
    }
    
    public Font Tamaño12(Font y){
        Font x=y.deriveFont(12f);
        return x;
    }
    
    public Font Tamaño14(Font y){
        Font x=y.deriveFont(14f);
        return x;
    }
    
    public Font Tamaño16(Font y){
        Font x=y.deriveFont(16f);
        return x;
    }
    
    public Font Tamaño20(Font y){
        Font x=y.deriveFont(20f);
        return x;
    }
    
    public void Acerca(int x){
    JOptionPane.showMessageDialog(null, "Software basado en MVC\n"
            + "Desarrollado para el Grupo 301N de Ing. de Sistemas\n"
            + "Udec Chía - "+x);
    }
    
    public void Guardar (String x){
        try{ //trycatch intento de ejecucion. Si hay error o ecepciones, lo captura y lo guarda en IOException i
            String nombre = JOptionPane.showInputDialog(null,"Digite el nombre del archivo: "); //import java.io.*;
            /*File datos= new File("C:\\Users\\Estudiante\\Desktop\\"+nombre+".txt");//sin ruta lo crea en la carpeta del proyecto
            
            */
            File datos= new File(nombre+".txt");
            FileWriter CreaArchivo = new FileWriter(datos);
            CreaArchivo.write(x);
            CreaArchivo.flush();
            CreaArchivo.close();
            JOptionPane.showMessageDialog(null,"Exito al guardar"+nombre+".txt");
            
        }catch (IOException i){
            JOptionPane.showMessageDialog(null, "Error al intentar guardar: "+i);
        }
        
        
    }
            
}



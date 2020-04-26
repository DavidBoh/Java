/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creartxt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class ModeloFormulario {
  
    
    public void Guardar(String s[][])
    {
    try{
    File datos;
    FileWriter escribir;
    String nombre;
    nombre=JOptionPane.showInputDialog(null, "Digite el nombre del Archivo: ");
    datos=new File(nombre+".txt");
    escribir=new FileWriter (datos);
    int x=s.length;
    int y=s[0].length;
    
    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            escribir.write(s[i][j]);
        }
        escribir.write("\n");
    }
    escribir.flush();
    escribir.close();    
    }
    
    catch(IOException io)
    {
    System.err.println("Error: "+io);
    }
    } 
    
}

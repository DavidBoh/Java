/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopilachar;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ManejoPilaChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   char n ;  
   String x;
   
    PilaChar obj = new PilaChar();
    
    boolean salir=false;
    while(!salir)
    {
       switch(menu())
       {
          case 1:
              
         x=JOptionPane.showInputDialog("Ingresar palabra");
         
         for (int i=0;i<x.length();i++)
         {
            n=x.charAt(i);
            obj.ingresarEnPila(n);
            
         }
         
         break;
         
         case 2:
             
             JOptionPane.showMessageDialog(null, " "+obj.mostrarPila()); 
         break;
         
         case 3:
           salir=true; 
             
         break;
       }   
         
    
    }
        
    }
    
  private static int menu() 
    {
        int op;
        
        do
        {
           op=Integer.parseInt(JOptionPane.showInputDialog(
            "1. Ingresar palabra\n"+
            "2. Invertir \n" +
            "3. Salir"));
        
           
        }
        while (op<1 || op>3);
        return op;
    }  

}
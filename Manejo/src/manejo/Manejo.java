/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Manejo {

   
    public static void main(String[] args) {
    /* 
     Nodo lista= new Nodo(5); Nodo aux;
     
     for(int i=5; i<=100; i+=5)
     {
         aux=new Nodo(i);
         aux.sig=lista;
         lista=aux;
     }   
     /*   
     Nodo lista= new Nodo(70);
     Nodo nuevo = new Nodo(50);
     lista.sig=nuevo;
     nuevo=new Nodo(35);
     lista.sig.sig=nuevo;
     nuevo=new Nodo(100);
     lista.sig.sig.sig=nuevo;
     
     
     aux=lista;
     while(aux != null)
     {
         System.out.print(" "+ aux.info);
         aux=aux.sig;
     }
     */   
    int n, x = 0;   
    Lista obj = new Lista();
    
     boolean salir=false;
    while(!salir)
    {
       switch(menu())
       {
          case 1:
         x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar los datos: "));
         obj.ingresarEnOrden(x);
         
         
         JOptionPane.showMessageDialog(null, "Los datos son: "+obj.mostrarLista());
         break;
         
         case 2:
             JOptionPane.showMessageDialog(null, "La suma es "+obj.sumaElementos()); 
         break;
         
         case 3:
       int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));
             if(obj.buscarElemento(num))
             JOptionPane.showMessageDialog(null,"El numero "+num+" si está en la lista");
             else
             JOptionPane.showMessageDialog(null,"El numero "+num+" no está en la lista");
             
         break;
         
         case 4:
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
            "1. Ingresar y Mostrar datos \n"+
            "2. Sumar datos \n" +
            "3. Buscar Elemento \n"+
            "4. Salir"));
        
           
        }
        while (op<1 || op>4);
        return op;
    }  
    
    
}

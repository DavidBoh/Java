/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        boolean salir= false;
        int num;
        while(!salir){
            switch(menu())
            {
                case 1: 
                    num=Integer.parseInt(JOptionPane.showInputDialog ("Digite un número entero: "));
                    arbol.ingresarDato(num);
                    arbol.inicializarSalida();
                    arbol.inorden(arbol.raizRaiz());
                    JOptionPane.showMessageDialog(null," "+arbol.salida);
                 break;
                 
                case 2:
                  arbol.inicializarSalida();
                  arbol.preorden(arbol.raizRaiz());
                  JOptionPane.showMessageDialog(null," "+arbol.salida);
                break;
                
                 case 3:
                     arbol.inicializarSalida();
                  arbol.inorden(arbol.raizRaiz());
                  JOptionPane.showMessageDialog(null," "+arbol.salida);
                 
                break;
                
                 case 4:
                   arbol.inicializarSalida();
                  arbol.posorden(arbol.raizRaiz());
                  JOptionPane.showMessageDialog(null," "+arbol.salida);
                break;
            
                 case 5:
                  
                  arbol.inicializarSuma();
                  arbol.sumarNodo(arbol.raizRaiz());
                  JOptionPane.showMessageDialog(null," "+arbol.sumarNodo);
                  
                break;
                
                case 6:
                 
                  arbol.inicializarContar();
                  arbol.contar(arbol.raizRaiz());
                  JOptionPane.showMessageDialog(null," "+arbol.contarNodo);
                break;
                
                case 7:
                  arbol.inicializarSuma();
                  arbol.hojasArbol(arbol.raizRaiz());
                  JOptionPane.showMessageDialog(null," "+arbol.sumarNodo);
                break;
            
            
                case 8:
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
            "Opciones \n"+
            "1. Ingresar datos\n"+
            "2. Recorrido Preorden\n"+
            "3. Recorrido Inorden \n"+
            "4. Recorrido Posorden \n"+
            "5. Suma datos \n"+
            "6. Cantidad valores \n"+
            "7. Mostrar hojas \n"+
            "8. Salir \n"));
        
           
        }
        while (op<1 || op>8);
        return op;
    }
}


package manejopila;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ManejoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, x = 0;   
    Pila obj = new Pila();
    
    boolean salir=false;
    while(!salir)
    {
       switch(menu())
       {
          case 1:
         x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar los datos: "));
         obj.ingresarEnPila(x);
         
         break;
         
         case 2:
             obj.sacarDePila();
             JOptionPane.showMessageDialog(null, "Tope eliminado      : "+obj.mostrarPila()); 
         break;
         
         case 3:
           JOptionPane.showMessageDialog(null, "Los datos son: "+obj.mostrarPila());
             
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
            "1. Ingresar datos \n"+
            "2. Eliminar datos \n" +
            "3. Mostrar datos \n"+
            "4. Salir"));
        
           
        }
        while (op<1 || op>4);
        return op;
    }  

}
    
    


        
    
    



package funcionesrecursivas;

import javax.swing.JOptionPane;



public class FuncionesRecursivas 
{

    
    public static void main(String[] args) 
    {
        int n=50, x;
        
        ArreglosRecursivos obj=new ArreglosRecursivos(n);
        obj.crearArreglo();
        
        boolean salir=false;
        while(!salir)
        {
           switch(menu())
            {              
                case 1:
                obj.salida="";
                JOptionPane.showMessageDialog(null, " "+obj.mostrarArreglo());
                JOptionPane.showMessageDialog(null, "La suma es: "+obj.sumaArreglo(obj.max-1));
                break;
                case 2: 
                obj.salida="";
                JOptionPane.showMessageDialog(null, " "+obj.mostrarArreglo());
               
                x=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a buscar"));
                JOptionPane.showMessageDialog(null, "El numero a buscar es " +x+ " ubicado en la posición "+obj.buscarElemento(obj.max-1, x));
                
                break;
                case 3:
                obj.salida="";
                JOptionPane.showMessageDialog(null, " "+obj.mostrarArreglo()); 
                JOptionPane.showMessageDialog(null, "# de pares es: "+obj.contarPares(obj.max-1));
                
                break;
                
                case 5:
                
                    obj.salida="";
                    JOptionPane.showMessageDialog(null," "+obj.mostrarArreglo());
                    JOptionPane.showMessageDialog(null,"La suma es: "+obj.sumaMultiplosDe_7(obj.max*7));
                break;
                
                case 6:
                  obj.salida="";
                JOptionPane.showMessageDialog(null, " "+obj.mostrarArreglo()); 
                JOptionPane.showMessageDialog(null, "La suma de divisibles por 3 es: "+obj.sumaNoDivisiblesPor_3(obj.max-3));
                break;
                
                case 7:
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
            "1. Mostrar Arreglo y suma\n"+
            "2. Buscar Elemento\n"+
            "3. Sumar pares \n"+
            "4. Contar pares \n"+
            "5. Sumar Multiplos de 7 \n"+
            "6. Sumar No divisibles por 3 \n"+
            "7. Salir "));
        
           
        }
        while (op<1 || op>3);
        return op;
    }
 
}

    
    

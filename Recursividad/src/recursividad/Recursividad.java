/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import javax.swing.JOptionPane;


public class Recursividad {

  
    public static void main(String[] args) {
        
    int n, p, a, b, v[];
    double cI,  in;
    
    Recursivos obj=new Recursivos();
    
    boolean salir=false;
    while(!salir)
    {
       switch(menu())
       {
          case 1: 
           n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
                   JOptionPane.showMessageDialog(null,"el factorial de" +n+"es"+obj.factorial(n));
               
          break;
                        
          case 2:
              n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
               if(obj.positivo(n))
               {
                   JOptionPane.showMessageDialog(null,"EL NUMERO ES POSITIVO");
               
                       }
               else 
               {   
                       JOptionPane.showMessageDialog(null,"EL NUMERO ES NEGATIVO");
               }
                
                      
          break;
          
          case 3:
              cI=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital inicial: "));
              in=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes: "));
              p=Integer.parseInt(JOptionPane.showInputDialog("ingrese el periodo: "));
              JOptionPane.showMessageDialog(null,"El valor futuro del capital inicial "+cI+" con un interes de "+in+" en "+p+" años igual a "+obj.valorFuturo(cI, in, p));
                      
          break;
          
          case 4:
                   n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
                 JOptionPane.showMessageDialog(null,"Secuencia fibonacci " +obj.fibonaci(n));      
          break;
          
          case 5:
                   n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
                 JOptionPane.showMessageDialog(null,"Numeros sumados" +obj.sumar_dig(n));       
          break;
          
          case 6:
                  n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
                 if(obj.par(n))
                 {
                   JOptionPane.showMessageDialog(null,"El número es par") ;
                 }
                 else 
                 {
                     JOptionPane.showMessageDialog(null,"El número es impar") ;
                 }
          break;
          
          case 7:
                 a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                  b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
                  JOptionPane.showMessageDialog(null,"el MCD es: " +obj.sacar_mcd(a,b));    
          break;
          
          case 8:
              
          salir=true;
          
                  break;
 
       }
     
       }
    
    }
    
   
    
    static int menu()
    {
        int op=0;
        
        do 
        {
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Opciones\n"+
            "1. Factorial de un numero\n"+
            "2. Numero positivo o negativo \n"+
            "3. Valor Futuro\n"+
            "4. Fibonacci\n"+
            "5. Sumar Números Ingresados \n"+
            "6. Numero par o impar \n"+
            "7. MCD entre dos números \n"+
            "8. Fin del Programa\n "));
            
            
            
            
        }
        while (op<1 || op>7);
        
        return op;
    }
    
    
    
}

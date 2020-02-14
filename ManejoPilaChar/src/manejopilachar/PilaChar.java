/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopilachar;

/**
 *
 * @author Estudiante
 */
public class PilaChar {
 Nodo tope;
    PilaChar(){tope=null;}
        
    boolean pilaVacia()
    {
        return tope==null;    
    }
    
    void ingresarEnPila(char x)
    {
        Nodo nuevo=new Nodo(x);
        if(pilaVacia())
         tope=nuevo;
        else{
            nuevo.sig=tope;
            tope=nuevo;
        }
     
    }
    
    /*
    for (i=0;i<s.length;i++)
    {
        c=s.charAt(i);
        obj.ingresarEnPila(c);
        s=JOptionPaine.showInputDialog(null,"Ingresar",)
    }
*/
    
    char sacarDePila()
    {
        char x=0;
        if(!pilaVacia())
        {    
        x=tope.info;
        tope=tope.sig;
        }
        return x;
    }
     
    String mostrarPila()
    {
        String salida="";
        Nodo aux=tope;
        while(aux!=null)
        {    
        salida+=aux.info+" ";
        aux=aux.sig;
        }
        return salida;
    }
    
    
}

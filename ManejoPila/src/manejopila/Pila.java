
package manejopila;

/**
 *
 * @author Estudiante
 */
public class Pila {
    
    Nodo tope;
    Pila(){tope=null;}
        
    boolean pilaVacia()
    {
        return tope==null;    
    }
    
    void ingresarEnPila(int x)
    {
        Nodo nuevo=new Nodo(x);
        if(pilaVacia())
         tope=nuevo;
        else{
            nuevo.sig=tope;
            tope=nuevo;
        }
     
    }
    
    int sacarDePila()
    {
        int x=0;
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

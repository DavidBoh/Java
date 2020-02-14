/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author HOME
 */
public class Arbol {
    
    Nodo raiz;
    String salida;
    int contarNodo;
    int sumarNodo;
    
    Arbol(){
        salida="";
        
        raiz=null;
    }
    
int ingresarDato(int x)
{
    Nodo nuevo=new Nodo(x);
    if (raiz==null)
    {
        raiz=nuevo;
        return 1;
    }
    else {
        Nodo p=raiz,q=null;
        while(p!=null){
            if(x==p.info)
            return 0;
            else{q=p;
            if(x<p.info)
                p=p.izq;
            else p=p.der;
            
            }
        }
        
        if(x<q.info)
            q.izq=nuevo;
        else q.der=nuevo;
        
    }
    
    
    return 1;
}


void preorden(Nodo p)
{
    if(p!=null){
        salida+=p.info+" "; 
        preorden(p.izq);
        preorden(p.der);
    }
}
 
/*
int contar(int x)
{
    
    contarNodo++ =x ;
    
    return x;
    
}
*/

void contar(Nodo p)
{
    if(p!=null){
    contarNodo++;
    contar(p.izq);
    contar(p.der);
    } 
}

void sumarNodo(Nodo p)
{
    if(p!=null){
    sumarNodo+=p.info;
    sumarNodo(p.izq);
    sumarNodo(p.der);
    }
}

void hojasArbol(Nodo p)
{
    if(p!=null){
    if(p.der==null & p.izq==null)
    sumarNodo++;
    hojasArbol(p.izq);
    hojasArbol(p.der);
    }
}

void inorden(Nodo p)
{
    if(p!=null){
        inorden(p.izq);
        salida+=p.info+" ";
        inorden(p.der);
              
    }
}

void posorden(Nodo p)
{
     if(p!=null){
    posorden(p.izq);
    posorden(p.der);
    salida+=p.info+" ";
     }
}

Nodo raizRaiz(){
    return raiz;
}
    
void inicializarSalida()
{
    salida="";
}

void inicializarSuma()
{
    sumarNodo=0;
}

void inicializarContar()
{
    contarNodo=0;
}
    
}

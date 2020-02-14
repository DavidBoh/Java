package manejo;



public class Lista {
    
    Nodo lista; String salida;
    public Lista() {lista=null;}
   
    /*
    void ingresarElemento(int x)
    {
     Nodo nuevo=new Nodo(x);
     if (lista==null)
         lista=nuevo;
     
    
    else {
    Nodo aux=lista;
    
    while(aux.sig!=null)
    aux=aux.sig;
    
    aux.sig=nuevo;
        }
    
    }
    */
    
    
 String mostrarLista()
 {
    Nodo aux=lista; salida="";
    while(aux != null)
    {
        salida+=aux.info+" ";
        aux=aux.sig;
    }
    return salida;
 }
    
 int sumaElementos()
 {
     int suma=0;
     Nodo aux=lista;
     while(aux!=null)
     {
         suma+=aux.info;
         aux=aux.sig;
     }    
    return suma; 
 }
    
 boolean buscarElemento(int x)
 {
     boolean encontro=false;
     Nodo aux=lista;
     while((aux!=null)&&(!encontro))
     {
         if (x==aux.info)
             encontro=true;
         else aux=aux.sig;
     }
      return encontro;         
 }
 
 
 void ingresarEnOrden(int x)
 {
     Nodo nuevo= new Nodo(x);
     if(lista==null)
     lista=nuevo;
     else{
         Nodo p=lista,q=null; 
         while((p!=null)&&(x>p.info))
         {
             q=p;
             p=p.sig;
         }
         if (q==null){
             nuevo.sig=lista; //si q es nulo quiere decir que fue el primero de la lista
             lista=nuevo;
         }
         else{
             q.sig=nuevo;
             nuevo.sig=p;
         }
         
     }
     
     
     
     
 }
         
         
    
}

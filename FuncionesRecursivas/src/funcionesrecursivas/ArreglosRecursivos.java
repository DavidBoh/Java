/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesrecursivas;

/**
 *
 * @author Estudiante
 */
public class ArreglosRecursivos {
    int max; 
    String salida; 
    int a[];
    ArreglosRecursivos(int x)
    {
        max=x; 
        salida=" ";
        a=new int[max];
    }
    
    void crearArreglo()
    {
        for (int i=0; i<max; i++){
            a[i]=(int)(Math.random()*1000+1);
        }
          
    }
    String mostrarArreglo()
    {
        for (int i=0; i<max; i+=30)
        {
            for (int j=i;(j<i+30)&&(j<max);j++)
            {
                salida +=" "+a[j];
            }
             salida+=" \n";
        }
       
        
        return salida;
        
    }
    
    int sumaArreglo(int n)
            {
                if(n==0)
                    return a[0];
                else return a[n]+sumaArreglo(n-1);
            }
    
    //buscar un elemento en arreglo
    int buscarElemento(int n, int x)
    {
        if(n<0)
        
            return-1;
        
        else if(a[n]==x)
        
            return n;
        
        else
        
            return buscarElemento (n-1, x);
        
    }
    
    int sumaPares(int n)
            {
                if(n<0)
                    return 0;
                 
                    
                else if(a[n]%2==0)
                    return a[n]+sumaPares(n-1);
                
                else
                   return sumaPares(n-1);
                        
                        
            }
       
    
    int contarPares(int n)
    {
    if (n % 2 == 0)
        return 1 + contarPares(n);
        else
        return contarPares(n);
     
     }
    
    int sumaMultiplosDe_7(int n){
        if (n==0)
            return 0;
        else
            return a[n]+ sumaMultiplosDe_7(n-7);
    }
    
    int sumaNoDivisiblesPor_3(int n){
        if (n % 3 ==0) 
            return a[n]+sumaNoDivisiblesPor_3(n-3);
        else
            return sumaNoDivisiblesPor_3(n-3);
    }
    
    
    
}

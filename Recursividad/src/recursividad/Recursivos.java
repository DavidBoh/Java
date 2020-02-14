/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;



/**
 *
 * @author Estudiante
 */
public class Recursivos {
    
    
    long factorial (int n)
    {
        if (n==0)
            return 1;
        else return n*factorial(n-1);
    }
  
    
   int fibonaci(int n){
       if (n==1 || n==2) return 1;
       else return fibonaci(n-1)+fibonaci(n-2);
    
       
   }
   
    int sumar_dig (int n)
    {
	if (n == 0)      //caso base
	    return n;
	else
	    return sumar_dig (n / 10) + (n % 10);
    }
       

public boolean par(int n){
    if(n==0)return true;
    else return impar(n);
}
public boolean impar(int n){
    if (n==0)return false;
            else return par(n-1);
    
}

public boolean positivo (int n){
if(n>0) return true;
else return negativo(n);

}
public boolean negativo (int n){
 if(n<0) return false;
 else return positivo(n);
}
   
int sacar_mcd(int a, int b){
    if(b==0)
        return a;
    else 
        return sacar_mcd(b,a%b);
}

    double valorFuturo(double cI, double in, int p)
    {
        if (p==0){
            return cI;
        }
            else return (1+in/100)*valorFuturo(cI, in, p-1);
    }
    
    
    
    
    
    }
    
    
    
   
   
    
    
    
    
    
    
    
    


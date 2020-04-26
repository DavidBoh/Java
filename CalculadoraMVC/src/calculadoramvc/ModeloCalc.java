
package calculadoramvc;


public class ModeloCalc {
    
    public double Suma (double x, double y){
    double res=x+y;
    return res;
    }
    
    public double Resta(double x, double y){
    double res=x-y;
    return res;
    }
    
    public double Multiplicar(double x, double y){
    double res=x*y;
    return res;
    }
     
    public double Dividir(double x, double y){
    double res=0;
     if (y==0){
         res=res;
     }
     else{
         res=x/y;
     }
     
    return res;
    }
    
    public double Raiz (double x, double y){
        double res=Math.pow(x , (1/y));
        return res;
    }
    
    
    public double Potencia(double x, double y){
        double res=(Math.pow(x,y));
        return res;
       }
    
    public double Modulo (double x, double y){
        double res=x%y;
        return res; 
    }
    
}

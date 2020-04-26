
package calculadoramvc;



public class CalculadoraMVC {

    
    public static void main(String[] args) {
       
        VistaCalc v1= new VistaCalc();
        ModeloCalc m1= new ModeloCalc();
        ControlCalc c1= new ControlCalc(m1,v1);
        
    }
    
}


/* 
Ventajas:
Codigo espagueti
reduce codigo ofuscado
ordenamiento del codigo
***seguridad


Desventajas:
Desorden y mantenimiento
Mayores recursos

*/
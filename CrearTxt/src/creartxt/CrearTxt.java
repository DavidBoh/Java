
package creartxt;






public class CrearTxt {

   
    
    
    public static void main(String[] args) {
        
       /* VistaMenu V1=new VistaMenu();
        ModeloMenu M1=new ModeloMenu();
        ControlMenu C1=new ControlMenu(V1,M1);
        */
        
        VistaFormulario v1=new VistaFormulario();
        ModeloFormulario m1=new ModeloFormulario();
        ControladorFormulario C1=new ControladorFormulario(v1,m1);
    }
    
}

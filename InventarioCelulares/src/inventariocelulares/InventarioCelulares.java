/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariocelulares;

/**
 *
 * @author ESTUDIANTE
 */
public class InventarioCelulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        VistaCelu v1=new VistaCelu();
        ModeloCelu m1=new ModeloCelu();
        ControlCelu C1=new ControlCelu(v1,m1);
        
        
    }
    
}

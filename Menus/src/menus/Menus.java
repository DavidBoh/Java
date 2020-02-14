/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author misaelinux
 */
public class Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaMenu V1=new VistaMenu();
        ModeloMenu M1=new ModeloMenu();
        ControlMenu C1=new ControlMenu(V1,M1);
        
    }
    
/* modificar, añadir tamaños al menu
    10
    12
    14
    16
    20
    
    getfont
    
    */
    
    
}

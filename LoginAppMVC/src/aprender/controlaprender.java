/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprender;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import menuprincipal.controlmenuprincipal;
import menuprincipal.modelomenuprincipal;
import menuprincipal.vistamenuprincipal;

/**
 *
 * @author herrboh
 */
public class controlaprender implements ActionListener {
    
    vistaaprender v;
    
    public controlaprender(vistaaprender vis){
        v = vis;
        
        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);
        
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==v.cerrarventanax){
            System.exit(0);
        }
        
        if(e.getSource()==v.regresarx){
            v.dispose();
            
            vistamenuprincipal mainmenu = new vistamenuprincipal();
            modelomenuprincipal modelmenu = new modelomenuprincipal();
            controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu,modelmenu);         
            
            
        }

    }
    
}

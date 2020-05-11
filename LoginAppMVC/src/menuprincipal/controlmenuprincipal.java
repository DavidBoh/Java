/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author herrboh
 */
public class controlmenuprincipal implements ActionListener {
    
    vistamenuprincipal v;
    
    public controlmenuprincipal(vistamenuprincipal vis){
        v=vis;
        
        v.cerrarventanax.addActionListener(this);
        v.depositarx.addActionListener(this);
        v.retirarx.addActionListener(this);
        v.cerrarsesionx.addActionListener(this);
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
         
        System.out.println("clicked");
        if(e.getSource()==v.cerrarventanax){
            System.exit(0);
        }
        
    }
    
}

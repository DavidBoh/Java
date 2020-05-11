/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import loginapp.ControlLogin;
import loginapp.LoginAppMVC;
import loginapp.ModeloLogin;
import loginapp.VistaLogin;

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
        v.aprende.addActionListener(this);
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
         
        System.out.println("clicked");
        if(e.getSource()==v.cerrarventanax){
            System.exit(0);
        }
        
        if(e.getSource()==v.cerrarsesionx){
            v.dispose();
            VistaLogin v1= new VistaLogin();
            ModeloLogin m1= new ModeloLogin();
            ControlLogin c1= new ControlLogin(m1,v1);
        }
        
    }
    
}

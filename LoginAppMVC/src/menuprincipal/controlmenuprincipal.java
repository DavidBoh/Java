/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;

import aprender.controlaprender;
import aprender.vistaaprender;
import deposito.controldeposito;
import deposito.vistadeposito;
import historial.historialControl;
import historial.historialVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.UIManager.getString;
import loginapp.ControlLogin;

import loginapp.ModeloLogin;
import loginapp.VistaLogin;
import retiro.controlretiro;
import retiro.vistaretiro;

/**
 *
 * @author herrboh
 */
public class controlmenuprincipal implements ActionListener {
    
    vistamenuprincipal v;
    modelomenuprincipal m;
    
    public controlmenuprincipal(vistamenuprincipal vis, modelomenuprincipal mod){
        v=vis;
        
        m=mod;
        
        v.cerrarventanax.addActionListener(this);
        v.depositarx.addActionListener(this);
        v.retirarx.addActionListener(this);
        v.cerrarsesionx.addActionListener(this);
        v.aprende.addActionListener(this);
        
       
        v.historial.addActionListener(this);
        
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
        
        if(e.getSource() == v.retirarx){
            v.dispose();
            
            
            vistaretiro  retirovis = new vistaretiro();
            controlretiro retiroc = new controlretiro(retirovis);
        }
        
        if(e.getSource() == v.historial){
            v.dispose();
            
            
            historialVista historiavis = new historialVista();
            historialControl historialc = new historialControl(historiavis);
        }
        
        if(e.getSource() == v.depositarx){
            v.dispose();
            
            
            vistadeposito  depositovis = new vistadeposito();
            controldeposito depositoc = new controldeposito(depositovis);
        }
        
        if(e.getSource() == v.aprende){
            v.dispose();
            
            
            vistaaprender  aprendevis = new vistaaprender();
            controlaprender aprendec = new controlaprender(aprendevis);
        }
        
    }
    
}

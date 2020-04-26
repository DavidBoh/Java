/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultor;
import java.awt.event.*;
/**
 *
 * @author misaelinux
 */
public class Controlador implements ActionListener{

    Vista v;
    Modelo m;
    
    Controlador(Vista vis,Modelo mod){
    this.v=vis;
    this.m=mod;
    this.v.consultar.addActionListener(this);
    this.v.setVisible(true);
    this.v.setDefaultCloseOperation(3);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==this.v.consultar){
         m.conectar();
         if(this.v.lugar.getSelectedIndex()==0){
         v.campo.setText(m.Buscador(0));
         }
         if(this.v.lugar.getSelectedIndex()==1){
         v.campo.setText(m.Buscador(1));
         }
         if(this.v.lugar.getSelectedIndex()==2){
         v.campo.setText(m.Buscador(2));
         }
         m.cerrar();
     }
     
    }
  
}

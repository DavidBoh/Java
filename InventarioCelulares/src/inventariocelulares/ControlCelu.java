/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariocelulares;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ESTUDIANTE
 */
public class ControlCelu implements ActionListener {

    VistaCelu v;
    ModeloCelu m;
    
    ControlCelu(VistaCelu vc, ModeloCelu mc)
    {
     this.v=vc;
     this.m=mc;
     
     this.v.borra.addActionListener(this);
     this.v.guarda.addActionListener(this);
     
     this.v.setVisible(true);
     this.v.setDefaultCloseOperation(3);
        
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource()==v.borra)
        {
       
        v.ti.setText("");
        v.time.setText("");
        v.cmo.setSelectedIndex(0);
        v.ces.setSelectedIndex(0);
        v.cmarc.setSelectedIndex(0);
        v.ctv.setSelectedIndex(0);
        
        }
        
        if(ae.getSource()==v.guarda)
        {
            String valores[][]=new String[6][2];
            valores[0][0]=v.lm.getText();
            valores[0][1]=v.cmarc.getSelectedItem().toString();
            valores[1][0]=v.lime.getText();
            valores[1][1]=v.time.getText();
            valores[2][0]=v.lmo.getText();
            valores[2][1]=v.cmo.getSelectedItem().toString();
            valores[3][0]=v.le.getText();       
            valores[3][1]=v.ces.getSelectedItem().toString();
            valores[4][0]=v.lc.getText(); 
            valores[4][1]=v.ctv.getSelectedItem().toString();
            valores[5][0]=v.li.getText();
            valores[5][1]=v.ti.getText();
            
          
                   
                  
             
                  
            
            m.Guardar(valores);
            
                    
                    
            
        }
        
        
    }
    
}

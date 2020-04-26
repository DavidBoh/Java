/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creartxt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorFormulario implements ActionListener {

    VistaFormulario v;
    ModeloFormulario m;
    
    ControladorFormulario(VistaFormulario vf, ModeloFormulario mf)
    {
     this.v=vf;
     this.m=mf;
     
     this.v.borra.addActionListener(this);
     this.v.guarda.addActionListener(this);
     this.v.consulta.addActionListener(this);
     
     this.v.setVisible(true);
     this.v.setDefaultCloseOperation(3);
        
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource()==v.borra)
        {
        v.tn.setText("");
        v.ta.setText("");
        v.td.setText("");
        v.ttel.setText("");
        v.ce.setSelectedIndex(0);
        v.ces.setSelectedIndex(0);
        v.cg.setSelectedIndex(0);
        v.ctv.setSelectedIndex(0);
        
        }
        
        if(ae.getSource()==v.guarda)
        {
            String valores[][]=new String[8][2];
            valores[0][0]=v.ln.getText();
            valores[0][1]=v.tn.getText();
            valores[1][0]=v.la.getText();
            valores[1][1]=v.ta.getText();
            valores[2][0]=v.le.getText();        
            valores[2][1]=v.ce.getSelectedItem().toString();
            valores[3][0]=v.lg.getText();       
            valores[3][1]=v.cg.getSelectedItem().toString();
            valores[4][0]=v.les.getText();
            valores[4][1]=v.ces.getSelectedItem().toString();        
            valores[5][0]=v.ltv.getText();        
            valores[5][1]=v.ctv.getSelectedItem().toString();      
            valores[6][0]=v.ld.getText();
            valores[6][1]=v.td.getText();         
            valores[7][0]=v.ltel.getText();        
            valores[7][1]=v.ttel.getText();         
            
            m.Guardar(valores);
            
                    
                    
            
        }
        
        
    }
    
}

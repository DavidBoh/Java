/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.KeyStroke;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Control implements ActionListener{

    Vista v;
    Modelo m;
    
    Control(Vista vv, Modelo mm)
    {
     v=vv;
     m=mm;
     
     
    v.a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
      v.a2.addActionListener(this);
      
      
     this.v.guarda.addActionListener(this);
    
     
    
     
     this.v.setVisible(true);
     
     this.v.setDefaultCloseOperation(3);
        
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if (ae.getSource() == v.a2) {
            m.Salir();
        }
             
       
        
        if(ae.getSource()==v.guarda)
        {
           
           int s;
           /*String cc ="";
           
           cc= String.valueOf(s);
           cc= Integer.toString(s);
                   
           */       
           
         
                   
            Modelo Con = new Modelo();
            Con.conectar();

            s = Con.guardaDatos(v.tco.getText(), v.tno.getText(), v.tma.getText(), v.tde.getText(), v.tes.getText(), v.tca.getText(), v.tva.getText());
         
          
            
            if (s == 1) {
                JOptionPane.showMessageDialog(null, "Guardado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Problema al guardar");
            }
            Con.cerrar();
                    
            
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.pow;
/**
 *
 * @author Pc1
 */
public class Formula extends JFrame implements ActionListener{

    JLabel texta, textb,textc, titulo;
   JTextField tf1, tf2, tf3;
   JButton bt;
   JTextArea textt;
   
   Formula (){
       this.setLayout(null);
       
       setTitle("Formula");
       
        texta=new JLabel("Introduzca la velocidad inicial Vi ");
        textb=new JLabel("Introduzca la aceleración a ");
        textc=new JLabel("Introduzca el tiempo t ");
        textt=new JTextArea("");
        bt=new JButton("Resolver");
        titulo=new JLabel("MOVIMIENTO RECTILÍNEO UNIFORME");
         tf1=new JTextField(5);
         tf2=new JTextField(5);
         tf3=new JTextField(5);
         
         
         
         bt.addActionListener(this);
         
         texta.setBounds(50, 30, 200, 25);
         add(texta);
         
         tf1.setBounds(50, 60, 200, 25);
         add(tf1);
         
         textb.setBounds(50, 90, 200, 25);
         add(textb);
         
         tf2.setBounds(50, 120, 200, 25);
         add(tf2);
         
         textc.setBounds(50, 150, 200, 25);
         add(textc);
         
         tf3.setBounds(50, 180, 200, 25);
         add(tf3);
         
         bt.setBounds(50, 221, 200, 50);
         add(bt);
         
         titulo.setBounds(300, 40, 300, 25);
         add(titulo);
         
         textt.setBounds(300, 70, 300, 230);
         add(textt);
         textt.setEditable(false);        
          
              
      
       
       
       
       
        this.setVisible(true);
       this.setSize(700, 400);
       
       
   }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         System.out.println("ok");
        double vf=0;
        double vi=Double.parseDouble(tf1.getText());
        double a=Double.parseDouble(tf2.getText());
        double t=Double.parseDouble(tf3.getText());
        
        if(e.getSource()==bt){
            vf = vi+a*t;
            textt.setText("La velocidad final es: "+vf);
            
            
        }
    }
    
}

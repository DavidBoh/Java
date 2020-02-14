/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Estudiante
 */
public class Matematica extends JFrame implements ActionListener {
    
    JButton Cuad, Coax; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Matematica();
                
    }
    
    Matematica(){
        setLayout(new FlowLayout());
        setSize(200,200);
        Cuad= new JButton("Cuadratica");
        Coax= new JButton("Coaxial");
        
        Cuad.addActionListener(this);
        Coax.addActionListener(this);
        this.add(Cuad);
        this.add(Coax);
        setVisible(true);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     @Override
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==Cuad){
        Cuadratica c=new Cuadratica();    
        }
        else if(e.getSource()==Coax){
        Coaxial c0=new Coaxial();
        }
    
    
    
}
    
}
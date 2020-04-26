/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casagraphic;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */
public class CasaGraphic extends JFrame{

    CasaGraphic(){
     setSize(800,800);
     setLayout(new FlowLayout());
     setTitle("Canvas en Java");
     Lienzo l=new Lienzo();
     this.add(l);
     this.setVisible(true);
     this.setDefaultCloseOperation(3);
    }
    
    
    public static void main(String[] args) {
       
        new CasaGraphic();
        
        
    }
    
}
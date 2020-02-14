/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocasa;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */
public class PlanoCasa extends JFrame{

    PlanoCasa(){
     setSize(800,800);
     setLayout(new FlowLayout());
     setTitle("Canvas en Java");
     LienzoCasa l=new LienzoCasa();
     this.add(l);
     this.setVisible(true);
     this.setDefaultCloseOperation(3);
    }
    
    
    public static void main(String[] args) {
       
        new PlanoCasa();
        
        
    }
    
}

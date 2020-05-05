/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author herrboh
 */
public class success {
    private static JLabel labelx;
    private static JFrame framex;
    private static JPanel panelx;

    success(){

        JPanel panelx = new JPanel();
        JFrame framex = new JFrame();

        framex.setSize(350,350);
        framex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framex.add(panelx);
        framex.setLocationRelativeTo(null);

        panelx.setLayout(null);

        labelx = new JLabel("Inicio exitoso!");
        labelx.setBounds(80,150,200,25);
        panelx.add(labelx);
        
        framex.setVisible(true);



    }

  

   

}

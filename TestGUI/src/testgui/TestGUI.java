/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author herrboh
 */
public class TestGUI {

    private static JLabel labelx;
    private static JFrame framex;
    private static JPanel panelx;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JPanel panelx = new JPanel();
        JFrame framex = new JFrame();
        
        framex.setSize(350,350);
        framex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framex.add(panelx);

        panelx.setLayout(null);

        labelx = new JLabel("Inicio exitoso!");
        labelx.setBounds(100,100,100,100);
        panelx.add(labelx);

        framex.setVisible(true);
    }
    
}

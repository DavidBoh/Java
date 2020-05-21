/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author herrboh
 */
public class Testpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Object[] column = {"One", "Two"};
    Object[][] data = {{1, 2}, {3, 4}, {5, 6}};

    JTable toDoTable = new JTable(data, column);
    JScrollPane jpane = new JScrollPane(toDoTable);
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    panel.add(jpane);
    frame.add(new JScrollPane(panel));
    frame.setBounds(1000,1000,1000,1000);
    jpane.setBounds(10, 70, 180, 100);
    frame.setVisible(true);
    
  }
         
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultor;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author misaelinux
 */
public class Vista extends JFrame{
    JComboBox lugar;
    JButton consultar;
    JTextArea campo;
    JScrollPane panel;
    
    Vista(){
    setLayout(null);
    setTitle("Consultar BD");
    setSize(800,600);
    lugar=new JComboBox();
        lugar.addItem("Usuarios");
        lugar.addItem("Alumnos");
        lugar.addItem("Documentos");
    consultar=new JButton("Consultar");
    campo=new JTextArea(20,40);
    panel=new JScrollPane(campo);
    lugar.setBounds(20,20,100,30);
    consultar.setBounds(150,20,100,30);
    panel.setBounds(20,100,500,300);
    this.add(panel);
    this.add(consultar);
    this.add(lugar);
    }   
}
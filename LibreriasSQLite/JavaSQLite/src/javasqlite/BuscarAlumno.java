/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author GabeL
 */
public class BuscarAlumno extends JFrame implements ActionListener{
    
    JTextField Campo;
    JComboBox Tipo;
    JButton Buscar;
    JTextArea Resu;
    
    BuscarAlumno(){
    this.setTitle("Buscar");
        this.setSize(400, 400);
        this.setLayout(null);
        Campo=new JTextField(50);
        Tipo=new JComboBox();
        Tipo.addItem("-Seleccione-");
        Tipo.addItem("Nombre");
        Tipo.addItem("Apellido");
        Tipo.addItem("Codigo");
        Buscar=new JButton("Buscar");
        Resu=new JTextArea(200,10);
        Buscar.addActionListener(this);
        Campo.setBounds(20,20,150,40);
        Tipo.setBounds(180,20,100,40);
        Buscar.setBounds(150,150,100,50);
        Resu.setBounds(20,210,300,160);
        
        this.add(Campo);
        this.add(Tipo);
        this.add(Buscar);
        this.add(Resu);
        this.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BaseDatos Con = new BaseDatos();
        Con.conectar();
        Resu.setText(Con.Buscador(Campo.getText(), Tipo.getSelectedIndex()));
        Con.cerrar();
    }
    
}

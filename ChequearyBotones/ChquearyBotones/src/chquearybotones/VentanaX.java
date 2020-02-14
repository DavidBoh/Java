/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chquearybotones;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//Action
import javax.swing.event.*;//Change
/**
 *
 * @author Misael Fernando
 */
public class VentanaX extends JFrame implements ActionListener,ChangeListener{
    Container bloqueContenedor= null;
        JTextField Tx1,Tx3;
        JComboBox Gen,EstC;
        JButton S;
        JCheckBox Ch1,Ch2;
        JLabel L1, L2,L3,L4;
        
        VentanaX(){
            bloqueContenedor = getContentPane();
            setTitle("CheckBox y Boton");
            setLayout(null);
            setSize(640,480);
            L1=new JLabel("Nombre");
            L1.setBounds(30,50,50,30);
            Tx1=new JTextField(20);
            Tx1.setBounds(90,50,100,30);
            L2=new JLabel("Genero");
            L2.setBounds(30,90,50,30);
            Gen=new JComboBox();
            Gen.addItem("Masculino");
            Gen.addItem("Femenino");
            Gen.setBounds(90,90,100,30);
            L4=new JLabel("Est. Civil");
            L4.setBounds(30,130,50,30);
            EstC=new JComboBox();
            EstC.addItem("-Seleccione-");
            EstC.addItem("Soltero(a)");
            EstC.addItem("Casado(a)");
            EstC.addItem("Separado(a)");
            EstC.addItem("Viudo(a)");
            EstC.addItem("Union Libre");
            EstC.setBounds(90,130,100,30);
            L3=new JLabel("E-mail");
            L3.setBounds(30,170,50,30);
            Tx3=new JTextField(50);
            Tx3.setBounds(90,170,150,30);
            Tx3.setEnabled(false);
            S=new JButton("Enviar");
            S.setBounds(300,280,70,30);
            S.setEnabled(false);
            Ch1=new JCheckBox("Tiene E-mail?");
            Ch1.setBounds(200,230,120,30);
            Ch2=new JCheckBox("Enviar");
            Ch2.setBounds(360,230,90,30);
            this.add(L1);
            this.add(Tx1);
            this.add(L2);
            this.add(Gen);
            this.add(L3);
            this.add(Tx3);
            this.add(S);
            this.add(Ch1);
            this.add(Ch2);
            this.add(L4);
            this.add(EstC);
            S.addActionListener(this);
            Ch1.addChangeListener(this);
            Ch2.addChangeListener(this);
            
        }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==S){
        String Enviando="Nombre: "+Tx1.getText()+"\n"
                +"Genero: "+Gen.getSelectedItem()+"\n"
                +"Estado Civil: "+(String)EstC.getSelectedItem()+"\n"
                +"E-mail: "+Tx3.getText()+"\n";
    JOptionPane.showMessageDialog(null, Enviando);
    }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(Ch1.isSelected()==true){
        Tx3.setEnabled(true);
        }
        else {
        Tx3.setEnabled(false);
        }
        
        if(Ch2.isSelected()==true){
        S.setEnabled(true);
        }
        else {
        S.setEnabled(false);
        }
        
    }
    
}

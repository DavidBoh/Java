/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.KeyStroke;

/**
 *
 * @author misaelinux
 */
public class ControlMenu implements ActionListener {

    VistaMenu v;
    ModeloMenu m;

    ControlMenu(VistaMenu vistaviene, ModeloMenu modeloviene) {
        v = vistaviene;
        m = modeloviene;
        v.a3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK)); //vk numpad= numerico se añade atajo
        v.a1.addActionListener(this);
        v.a2.addActionListener(this);
        v.a3.addActionListener(this);
        v.a4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        v.a4.addActionListener(this);
        v.b1.addActionListener(this);
        v.b2.addActionListener(this);
        v.b3.addActionListener(this);
        v.c1.addActionListener(this);
        v.c2.addActionListener(this);
        v.c3.addActionListener(this);
        v.d1.addActionListener(this);
        v.m10.addActionListener(this);
        v.m12.addActionListener(this);
        v.m14.addActionListener(this);
        v.m16.addActionListener(this);
        v.m20.addActionListener(this);
        v.setVisible(true);
        v.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.b1) {
            v.T1.setFont(m.Arial());
        }
        if (e.getSource() == v.b2) {
            v.T1.setFont(m.Times());
        }
        if (e.getSource() == v.b3) {
            v.T1.setFont(m.Calibri());
        }
        if(e.getSource() ==v.a4){
            m.Guardar(v.T1.getText());
        }
        if (e.getSource() == v.c1) {
            v.T1.setForeground(m.Negro());
        }
        if (e.getSource() == v.c2) {
            v.T1.setForeground(m.Verde());
        }
        if (e.getSource() == v.c3) {
            v.T1.setForeground(m.Azul());
        }
        if (e.getSource() == v.d1) {
            m.Acerca(2017);
        }
        if (e.getSource() == v.a3) {
            m.Salir();
        }
        if (e.getSource() == v.m10) {
           v.T1.setFont(m.Tamaño10(v.T1.getFont()));
        }
        
        if (e.getSource() == v.m12) {
           v.T1.setFont(m.Tamaño12(v.T1.getFont()));
        }
        
        if (e.getSource() == v.m14) {
           v.T1.setFont(m.Tamaño14(v.T1.getFont()));
        }
        
        if (e.getSource() == v.m16) {
           v.T1.setFont(m.Tamaño16(v.T1.getFont()));
        }
        
        if (e.getSource() == v.m20) {
           v.T1.setFont(m.Tamaño20(v.T1.getFont()));
        }

    }

}

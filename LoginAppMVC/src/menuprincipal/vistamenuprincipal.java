/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;

import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author herrboh
 */
public class vistamenuprincipal extends JFrame {
    
    public JButton cerrarventanax;
    public JButton depositarx;
    public JButton retirarx;
    public JButton cerrarsesionx;
    public JButton aprende;
      
    private JLabel fondo;
    
    public vistamenuprincipal(){
        
        setSize(310,546);
        setUndecorated(true);//quita frame default del SO
        iniciar();
        localizar();
        agregar();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(3);
        
    }
    
    private void iniciar(){
        
        fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MAINMENU.jpg")));
        
        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));
        
        depositarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/depositasmall.png")));
        depositarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/depositabig.png")));
        depositarx.setContentAreaFilled(false);
        depositarx.setBorder(null);
        depositarx.setCursor(new Cursor(HAND_CURSOR));
        
        retirarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/retirasmall.png")));
        retirarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/retirabig.png")));
        retirarx.setContentAreaFilled(false);
        retirarx.setBorder(null);
        retirarx.setCursor(new Cursor(HAND_CURSOR));
        
        cerrarsesionx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/CIERRASESIONSMALL.png")));
        cerrarsesionx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/CIERRASESION.png")));
        cerrarsesionx.setContentAreaFilled(false);
        cerrarsesionx.setBorder(null);
        cerrarsesionx.setCursor(new Cursor(HAND_CURSOR));
        
        aprende = new JButton(new ImageIcon(getClass().getResource("/Imagenes/APRENDEAMANEJARSMALL.png")));
        aprende.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/APRENDEAMANEJAR.png")));
        aprende.setContentAreaFilled(false);
        aprende.setBorder(null);
        aprende.setCursor(new Cursor(HAND_CURSOR));
        
    }
    
    private void localizar(){
        setLayout(null);
        
        fondo.setBounds(0,0,310,546);
        
        cerrarventanax.setBounds(270, 10, 25, 25);
        
        depositarx.setBounds(35,300,100,100);
        retirarx.setBounds(185,300,100,100);
        
        cerrarsesionx.setBounds(45,410,100,100);
        aprende.setBounds(175,410,100,100);
        
        
    }
    
    private void agregar(){
        
        add(cerrarventanax);
        add(depositarx);
        add(retirarx);
        add(cerrarsesionx);
        add(aprende);
        
        add(fondo);
        
        
    }
    
    
}

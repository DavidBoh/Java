/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;
import text.TextPrompt;

/**
 *
 * @author herrboh
 */
public class VistaLogin extends JFrame{
    
  
    public JTextField userText, tIdentificacion;

    
    public JPasswordField pContra;
    
    private TextPrompt identificacion, contraseña;
    
    public JButton buttonx1;
    public JButton buttonx2;
    public JButton buttonx3;
    public JButton buttonx4;
    public JButton buttonx5;
    public JButton buttonx6;
    public JButton buttonx7;
    public JButton buttonx8;
    public JButton buttonx9;
    public JButton buttonx0;
    public JButton buttonxok;
    public JButton buttonxcancel;
    public JButton buttonxA;
    public JButton buttonxB;
    public JButton buttonxC;
    public JButton buttonxD;
    public JButton buttonxE;
    public JButton buttonxF;
    public JButton buttonxG;
    public JButton buttonxH;
    public JButton buttonxI;
    public JButton buttonxJ;
    public JButton buttonxK;
    public JButton buttonxL;
    public JButton buttonxM;
    public JButton buttonxÑ;
    public JButton buttonxN;
    public JButton buttonxO;
    public JButton buttonxP;
    public JButton buttonxR;
    public JButton buttonxS;
    public JButton buttonxT;
    public JButton buttonxU;
    public JButton buttonxV;
    public JButton buttonxW;
    public JButton buttonxX;
    public JButton buttonxY;
    public JButton buttonxZ;
    public JButton buttonxQ;
    public JButton buttonxABC;
    public JButton buttonx123;
   
    
    public JButton botonCerrar;
    private Color colorFuente, tFondo;
    private JLabel fondo;

    public VistaLogin(){
        
        setSize(310,546);
        setUndecorated(true);
        iniciar();
        localizar();
        agregar();       
        setLocationRelativeTo(null);
        //setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(3);
            
    }
        
    private void iniciar(){
        
        colorFuente = new Color(255, 255, 255);
        tFondo = new Color(0, 123, 164);
    
        fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LOGIN.jpg")));
        fondo.setBackground(new Color(72, 181, 232));
        
        userText = new JTextField(20);
  
        tIdentificacion = new JTextField();
        tIdentificacion.setBackground(tFondo);
        tIdentificacion.setOpaque(false);
        tIdentificacion.setBorder(null);
        tIdentificacion.setForeground(colorFuente);
        identificacion = new TextPrompt("Identificación", tIdentificacion); 
        
        
        pContra = new JPasswordField();
        pContra.setBackground(tFondo);
        pContra.setOpaque(false);
        pContra.setBorder(null);
        contraseña = new TextPrompt("Contraseña", pContra);
        //pContra.setFocusable(false);
        //pContra.setEnabled(true);
        //pContra.setClickable(true);
        
        
        
        botonCerrar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        botonCerrar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setBorder(null);
        botonCerrar.setCursor(new Cursor(HAND_CURSOR));
        
  
        buttonx1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/1small.png")));
        buttonx1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/1big.png")));
        buttonx1.setContentAreaFilled(false);
        buttonx1.setBorder(null);
        buttonx1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx2 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/2small.png")));
        buttonx2.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/2big.png")));
        buttonx2.setContentAreaFilled(false);
        buttonx2.setBorder(null);
        buttonx2.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx3 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/3small.png")));
        buttonx3.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/3big.png")));
        buttonx3.setContentAreaFilled(false);
        buttonx3.setBorder(null);
        buttonx3.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx4 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/4small.png")));
        buttonx4.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/4big.png")));
        buttonx4.setContentAreaFilled(false);
        buttonx4.setBorder(null);
        buttonx4.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx5 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/5small.png")));
        buttonx5.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/5big.png")));
        buttonx5.setContentAreaFilled(false);
        buttonx5.setBorder(null);
        buttonx5.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx6 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/6small.png")));
        buttonx6.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/6big.png")));
        buttonx6.setContentAreaFilled(false);
        buttonx6.setBorder(null);
        buttonx6.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx7 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/7small.png")));
        buttonx7.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/7big.png")));
        buttonx7.setContentAreaFilled(false);
        buttonx7.setBorder(null);
        buttonx7.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx8 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/8small.png")));
        buttonx8.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/8big.png")));
        buttonx8.setContentAreaFilled(false);
        buttonx8.setBorder(null);
        buttonx8.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx9 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/9small.png")));
        buttonx9.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/9big.png")));
        buttonx9.setContentAreaFilled(false);
        buttonx9.setBorder(null);
        buttonx9.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx0 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/0small.png")));
        buttonx0.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/0big.png")));
        buttonx0.setContentAreaFilled(false);
        buttonx0.setBorder(null);
        buttonx0.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxABC = new JButton(new ImageIcon(getClass().getResource("/Imagenes/abcsmall.png")));
        buttonxABC.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/abcbig.png")));
        buttonxABC.setContentAreaFilled(false);
        buttonxABC.setBorder(null);
        buttonxABC.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx123 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/123small.png")));
        buttonx123.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/123big.png")));
        buttonx123.setContentAreaFilled(false);
        buttonx123.setBorder(null);
        buttonx123.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxok = new JButton(new ImageIcon(getClass().getResource("/Imagenes/checksmall.png")));
        buttonxok.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/checkbig.png")));
        buttonxok.setContentAreaFilled(false);
        buttonxok.setBorder(null);
        buttonxok.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxcancel = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cancelsmall.png")));
        buttonxcancel.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cancelbig.png")));
        buttonxcancel.setContentAreaFilled(false);
        buttonxcancel.setBorder(null);
        buttonxcancel.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxA = new JButton("a");         
        buttonxB = new JButton("b");
        buttonxC = new JButton("c");
        buttonxD = new JButton("d");
        buttonxE = new JButton("e");
        buttonxF = new JButton("f");
        buttonxG = new JButton("g");
        buttonxH = new JButton("h"); 
        buttonxI = new JButton("i");
        buttonxJ = new JButton("j");
        buttonxK = new JButton("k");
        buttonxL = new JButton("l");
        buttonxM = new JButton("m");
        buttonxN = new JButton("n");
        buttonxO = new JButton("o");
        buttonxP = new JButton("p");
        buttonxQ = new JButton("q");
        buttonxR = new JButton("r");
        buttonxS = new JButton("s");
        buttonxT = new JButton("t");
        buttonxU = new JButton("u");
        buttonxV = new JButton("v");
        buttonxW = new JButton("w");
        buttonxX = new JButton("x");
        buttonxY = new JButton("y");
        buttonxZ = new JButton("z");
            
    }
    
    private void localizar(){
        
        setLayout(null);
        fondo.setBounds(0, 0, 310, 546);

        pContra.setBounds(118, 275, 180, 30);
        
        tIdentificacion.setBounds(115, 226, 125, 30);

        botonCerrar.setBounds(270, 10, 25, 25);
        
        buttonx1.setBounds(90,320,40,40);
        buttonx2.setBounds(130,320,40,40);
        buttonx3.setBounds(170,320,40,40);
        
        buttonx4.setBounds(90,360,40,40);
        buttonx5.setBounds(130,360,40,40);
        buttonx6.setBounds(170,360,40,40);
        
        buttonx7.setBounds(90,400,40,40);
        buttonx8.setBounds(130,400,40,40);
        buttonx9.setBounds(170,400,40,40);
        buttonx0.setBounds(130,440,40,40);
        
        buttonxABC.setBounds(200,381,80,80);
        buttonx123.setBounds(200,381,80,80);
        
        buttonxok.setBounds(170,440,40,40);
        
        buttonxcancel.setBounds(90,440,40,40);
        
        botonCerrar.setBounds(270, 10, 25, 25);
        
        buttonxA.setBounds(30,30,44,30);
        buttonxB.setBounds(75,30,44,30);
        buttonxC.setBounds(120,30,44,30);
        buttonxD.setBounds(165,30,44,30);
        buttonxE.setBounds(210,30,44,30);
        buttonxF.setBounds(255,30,44,30);
        buttonxG.setBounds(305,30,44,30);
        buttonxH.setBounds(30,65,44,30);
        buttonxI.setBounds(75,65,44,30);
        buttonxJ.setBounds(120,65,44,30);
        buttonxK.setBounds(165,65,44,30);
        buttonxL.setBounds(210,65,44,30);
        buttonxM.setBounds(255,65,46,30);
        buttonxN.setBounds(305,65,44,30);
        buttonxO.setBounds(30,100,44,30);
        buttonxP.setBounds(75,100,44,30);
        buttonxQ.setBounds(120,100,44,30);
        buttonxR.setBounds(165,100,44,30);
        buttonxS.setBounds(210,100,44,30);
        buttonxT.setBounds(255,100,46,30);
        buttonxU.setBounds(305,100,44,30);
        buttonxV.setBounds(75,135,44,30);
        buttonxW.setBounds(120,135,46,30);
        buttonxX.setBounds(170,135,44,30);
        buttonxY.setBounds(216,135,44,30);
        buttonxZ.setBounds(262,135,46,30);
        
    }
    
    private void agregar(){
        
       
       
        add(tIdentificacion);
        
        add(pContra);
 
        add(botonCerrar);
        add(buttonx1);
        add(buttonx2);
        add(buttonx3);
        add(buttonx4);
        add(buttonx5);
        add(buttonx6);
        add(buttonx7);
        add(buttonx8);
        add(buttonx9);
        add(buttonxok);
        add(buttonxcancel);
        add(buttonx0);
        add(buttonxABC);
        
        add(buttonx123);
        buttonx123.setVisible(false);
        

        add(fondo);
        
         /*
                
        this.add(buttonxA);
        this.add(buttonxB);
        this.add(buttonxC);
        this.add(buttonxD);
        this.add(buttonxE);
        this.add(buttonxF);
        this.add(buttonxG);
        this.add(buttonxH);
        this.add(buttonxI);
        this.add(buttonxJ);
        this.add(buttonxK);
        this.add(buttonxL);
        this.add(buttonxM);
        this.add(buttonxN);
        this.add(buttonxO);
        this.add(buttonxP);
        this.add(buttonxQ);
        this.add(buttonxR);
        this.add(buttonxS);
        this.add(buttonxT);
        this.add(buttonxU);
        this.add(buttonxV);
        this.add(buttonxW);
        this.add(buttonxX);
        this.add(buttonxY);
        this.add(buttonxZ);
        */
    }
  
}

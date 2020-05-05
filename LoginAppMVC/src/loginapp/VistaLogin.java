/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author herrboh
 */
public class VistaLogin extends JFrame{
    
    static JLabel label;
    public JTextField userText;
    public JLabel passwordLabel;
    public JPasswordField passwordText;
    public JButton button;
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

    VistaLogin(){
        
        setSize(750,250);
        setTitle("Inicio de Sesión");
        setLayout(null);
        setBackground(Color.decode("#0085CA"));
        setLocationRelativeTo(null);
        
        label = new JLabel("Usuario");
        userText = new JTextField(20);
        passwordLabel = new JLabel("Contraseña");
        passwordText = new JPasswordField("");
        button = new JButton("Enviar");
        
        buttonx1 = new JButton("1");
        buttonx2 = new JButton("2");
        buttonx3 = new JButton("3");
        buttonx4 = new JButton("4");
        buttonx5 = new JButton("5");
        buttonx6 = new JButton("6");
        buttonx7 = new JButton("7");
        buttonx8 = new JButton("8");
        buttonx9 = new JButton("9");
        buttonxok = new JButton("✓");
        buttonx0 = new JButton("0");
        buttonxcancel = new JButton("x");
        
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
       
        label.setBounds(600,25,80,25);
        userText.setBounds(550,50,165,25);
        passwordLabel.setBounds(590,71,120,25);
        passwordText.setBounds(550,95,165,25);
        button.setBounds(590,130,80,25);
        
        buttonx1.setBounds(375,30,42,30);
        buttonx2.setBounds(420,30,42,30);
        buttonx3.setBounds(465,30,42,30);
        buttonx4.setBounds(375,65,42,30);
        buttonx5.setBounds(420,65,42,30);
        buttonx6.setBounds(465,65,42,30);
        buttonx7.setBounds(375,100,42,30);
        buttonx8.setBounds(420,100,42,30);
        buttonx9.setBounds(465,100,42,30);
        buttonxok.setBounds(465,135,44,30);
        buttonx0.setBounds(420,135,42,30);
        buttonxcancel.setBounds(375,135,42,30);
        
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

        this.add(label);
        this.add(userText);
        this.add(passwordLabel);
        this.add(passwordText);
        this.add(button);
        
        this.add(buttonx1);
        this.add(buttonx2);
        this.add(buttonx3);
        this.add(buttonx4);
        this.add(buttonx5);
        this.add(buttonx6);
        this.add(buttonx7);
        this.add(buttonx8);
        this.add(buttonx9);
        this.add(buttonxok);
        this.add(buttonx0);
        this.add(buttonxcancel);
               
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
        
        passwordText.setEnabled(false);
        
        buttonxok.setBackground(Color.GREEN);
        buttonxok.setOpaque(true);
        
        buttonxcancel.setBackground(Color.RED);
        buttonxcancel.setOpaque(true);
        
    }
}

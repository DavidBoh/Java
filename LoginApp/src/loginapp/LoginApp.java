/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author herrboh
 */

public class LoginApp implements ActionListener {

    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    
    private static JButton buttonx1;
    private static JButton buttonx2;
    private static JButton buttonx3;
    private static JButton buttonx4;
    private static JButton buttonx5;
    private static JButton buttonx6;
    private static JButton buttonx7;
    private static JButton buttonx8;
    private static JButton buttonx9;
    private static JButton buttonx0;
    
    private static JButton buttonxok;
    private static JButton buttonxcancel;

    private static JButton buttonxA;
    private static JButton buttonxB;
    private static JButton buttonxC;
    private static JButton buttonxD;
    private static JButton buttonxE;
    private static JButton buttonxF;
    private static JButton buttonxG;
    private static JButton buttonxH;
    private static JButton buttonxI;
    private static JButton buttonxJ;
    private static JButton buttonxK;
    private static JButton buttonxL;
    private static JButton buttonxM;
    private static JButton buttonxN;
    private static JButton buttonxO;
    private static JButton buttonxP;
    private static JButton buttonxR;
    private static JButton buttonxS;
    private static JButton buttonxT;
    private static JButton buttonxU;
    private static JButton buttonxV;
    private static JButton buttonxW;
    private static JButton buttonxX;
    private static JButton buttonxY;
    private static JButton buttonxZ;
    private static JButton buttonxQ;
    
    

    public static void main(final String[] args) {

        final JPanel panel = new JPanel();
        final JFrame frame = new JFrame();
        frame.setSize(750,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        
        panel.setLayout(null);
        
        label = new JLabel("Usuario");
        label.setBounds(610,10,80,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(560,40,165,25);
        panel.add(userText);
        //userText.setEditable(false);
        
        passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(600,60,120,25);
        panel.add(passwordLabel);    

        passwordText = new JPasswordField("");
        passwordText.setBounds(560,85,165,25);
        panel.add(passwordText);
        passwordText.setEnabled(false);

        button = new JButton("Enviar");
        button.setBounds(600,120,80,25);
        button.addActionListener(new LoginApp());
        panel.add(button);
        
        // botones
        
        buttonx1 = new JButton("1");
        buttonx1.setBounds(335,10,42,30);
        panel.add(buttonx1);
        buttonx1.addActionListener(new LoginApp());
        
        
        buttonx2 = new JButton("2");
        buttonx2.setBounds(380,10,42,30);
        panel.add(buttonx2);
        buttonx2.addActionListener(new LoginApp());
        
        buttonx3 = new JButton("3");
        buttonx3.setBounds(425,10,42,30);
        panel.add(buttonx3);
        buttonx3.addActionListener(new LoginApp());
        
        //
        
        buttonx4 = new JButton("4");
        buttonx4.setBounds(335,45,42,30);
        panel.add(buttonx4);

        buttonx5 = new JButton("5");
        buttonx5.setBounds(380,45,42,30);
        panel.add(buttonx5);
        
        buttonx6 = new JButton("6");
        buttonx6.setBounds(425,45,42,30);
        panel.add(buttonx6);
        
        //
        
        buttonx7 = new JButton("7");
        buttonx7.setBounds(335,80,42,30);
        panel.add(buttonx7);

        buttonx8 = new JButton("8");
        buttonx8.setBounds(380,80,42,30);
        panel.add(buttonx8);
        
        buttonx9 = new JButton("9");
        buttonx9.setBounds(425,80,42,30);
        panel.add(buttonx9);
        
        //
        
        buttonxok = new JButton("✓");
        buttonxok.setBounds(425,115,44,30);
        buttonxok.setBackground(Color.GREEN);
        buttonxok.setOpaque(true);
        panel.add(buttonxok);
        
        buttonx0 = new JButton("0");
        buttonx0.setBounds(380,115,42,30);
        panel.add(buttonx0);
        
        buttonxcancel = new JButton("x");
        buttonxcancel.setBounds(335,115,42,30);
        buttonxcancel.setBackground(Color.RED);
        buttonxcancel.setOpaque(true);
        panel.add(buttonxcancel);
        
        //
        
        buttonxA = new JButton("a");
        buttonxA.setBounds(10,10,44,30);
        panel.add(buttonxA);
        buttonxA.addActionListener(new LoginApp());
        
        
        buttonxB = new JButton("b");
        buttonxB.setBounds(55,10,44,30);
        panel.add(buttonxB);
        buttonxB.addActionListener(new LoginApp());
        
        buttonxC = new JButton("c");
        buttonxC.setBounds(100,10,44,30);
        panel.add(buttonxC);
        
        buttonxD = new JButton("d");
        buttonxD.setBounds(145,10,44,30);
        panel.add(buttonxD);

        buttonxE = new JButton("e");
        buttonxE.setBounds(190,10,44,30);
        panel.add(buttonxE);
        
        buttonxF = new JButton("f");
        buttonxF.setBounds(235,10,44,30);
        panel.add(buttonxF);
        
        buttonxG = new JButton("g");
        buttonxG.setBounds(280,10,44,30);
        panel.add(buttonxG);
        
        //
        
        buttonxH = new JButton("h");
        buttonxH.setBounds(10,45,44,30);
        panel.add(buttonxH);
        
        
        buttonxI = new JButton("i");
        buttonxI.setBounds(55,45,44,30);
        panel.add(buttonxI);
        
        buttonxJ = new JButton("j");
        buttonxJ.setBounds(100,45,44,30);
        panel.add(buttonxJ);
        
        buttonxK = new JButton("k");
        buttonxK.setBounds(145,45,44,30);
        panel.add(buttonxK);

        buttonxL = new JButton("l");
        buttonxL.setBounds(190,45,44,30);
        panel.add(buttonxL);
        
        buttonxM = new JButton("m");
        buttonxM.setBounds(235,45,46,30);
        panel.add(buttonxM);
        
        buttonxN = new JButton("n");
        buttonxN.setBounds(285,45,44,30);
        panel.add(buttonxN);
        
        //
        
        buttonxO = new JButton("o");
        buttonxO.setBounds(10,80,44,30);
        panel.add(buttonxO);
        
        
        buttonxP = new JButton("p");
        buttonxP.setBounds(55,80,44,30);
        panel.add(buttonxP);
        
        buttonxQ = new JButton("q");
        buttonxQ.setBounds(100,80,44,30);
        panel.add(buttonxQ);
        
        buttonxR = new JButton("r");
        buttonxR.setBounds(145,80,44,30);
        panel.add(buttonxR);

        buttonxS = new JButton("s");
        buttonxS.setBounds(190,80,44,30);
        panel.add(buttonxS);
        
        buttonxT = new JButton("t");
        buttonxT.setBounds(235,80,46,30);
        panel.add(buttonxT);
        
        buttonxU = new JButton("u");
        buttonxU.setBounds(285,80,44,30);
        panel.add(buttonxU);
        
        //
        
        buttonxV = new JButton("v");
        buttonxV.setBounds(50,115,44,30);
        panel.add(buttonxV);
        
        buttonxW = new JButton("w");
        buttonxW.setBounds(97,115,46,30);
        panel.add(buttonxW);
        
        buttonxX = new JButton("x");
        buttonxX.setBounds(145,115,44,30);
        panel.add(buttonxX);

        buttonxY = new JButton("y");
        buttonxY.setBounds(190,115,44,30);
        panel.add(buttonxY);
        
        buttonxZ = new JButton("z");
        buttonxZ.setBounds(235,115,46,30);
        panel.add(buttonxZ);

        

        frame.setVisible(true);
        
    }

   
    @Override
    public void actionPerformed(final ActionEvent e) {
        
        if(e.getSource()==buttonxA){
            userText.setText(userText.getText() + "a");
            System.out.println("Button Clicked");
        }
        if(e.getSource()==buttonxB){
            
            passwordText.setText(passwordText.getText() + "b");
        }
        
        if(e.getSource()==buttonx1){
            passwordText.setText(passwordText.getText() + "1");
        }
        
        if(e.getSource()==buttonx2){
            passwordText.setText(passwordText.getText() + "2");
        }
        
        if(e.getSource()==buttonx3){
            passwordText.setText(passwordText.getText() + "3");
        }
        
        System.out.println("Button Clicked");

        if(e.getSource()==button){
        PreparedStatement st;
        ResultSet rs;

        final String username = userText.getText();
        final String password = String.valueOf(passwordText.getPassword());

        final String query = "SELECT * FROM `usuarios` WHERE `username` = ? AND `password` = ?";

        try {
            
            st = login_connection.getConnection().prepareStatement(query);

            st.setString(1, username);
            st.setString(2, password);

            rs = st.executeQuery();
            /* *************************
            String user = userText.getText();
            char[] passwordx = passwordText.getPassword();
            String passwordString = new String(passwordx); //convirtiendo la variable vector char a String

            if(user.equals("test") && passwordString.equals("123")) {
            success.setText("Success");
            }
            */ 
            if(rs.next())
            {
                //success ex = new success();
                System.out.println("conexion exitosa");
                new success();
                //ex.setVisible(true);
                //ex.pack();
                //ex.setLocationRelativeTo(null);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos","Error login",2);
            }

        } catch (final SQLException ex){
            Logger.getLogger(LoginApp.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
               
    }

    
    
}

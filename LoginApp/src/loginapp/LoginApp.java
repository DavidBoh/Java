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
    private static JButton buttonxÑ;
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
        label.setBounds(600,25,80,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(550,50,165,25);
        panel.add(userText);
        //userText.setEditable(false);
        
        passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(590,71,120,25);
        panel.add(passwordLabel);    

        passwordText = new JPasswordField("");
        passwordText.setBounds(550,95,165,25);
        panel.add(passwordText);
        passwordText.setEnabled(false);

        button = new JButton("Enviar");
        button.setBounds(590,130,80,25);
        button.addActionListener(new LoginApp());
        panel.add(button);
        
        // botones
        
        buttonx1 = new JButton("1");
        buttonx1.setBounds(375,30,42,30);
        panel.add(buttonx1);
        buttonx1.addActionListener(new LoginApp());
        
        
        buttonx2 = new JButton("2");
        buttonx2.setBounds(420,30,42,30);
        panel.add(buttonx2);
        buttonx2.addActionListener(new LoginApp());
        
        buttonx3 = new JButton("3");
        buttonx3.setBounds(465,30,42,30);
        panel.add(buttonx3);
        buttonx3.addActionListener(new LoginApp());
        
        //
        
        buttonx4 = new JButton("4");
        buttonx4.setBounds(375,65,42,30);
        panel.add(buttonx4);
        buttonx4.addActionListener(new LoginApp());
        
        buttonx5 = new JButton("5");
        buttonx5.setBounds(420,65,42,30);
        panel.add(buttonx5);
        buttonx5.addActionListener(new LoginApp());
        
        buttonx6 = new JButton("6");
        buttonx6.setBounds(465,65,42,30);
        panel.add(buttonx6);
        buttonx6.addActionListener(new LoginApp());
        
        //
        
        buttonx7 = new JButton("7");
        buttonx7.setBounds(375,100,42,30);
        panel.add(buttonx7);
        buttonx7.addActionListener(new LoginApp());

        buttonx8 = new JButton("8");
        buttonx8.setBounds(420,100,42,30);
        panel.add(buttonx8);
        buttonx8.addActionListener(new LoginApp());
        
        buttonx9 = new JButton("9");
        buttonx9.setBounds(465,100,42,30);
        panel.add(buttonx9);
        buttonx9.addActionListener(new LoginApp());
        
        //
        
        buttonxok = new JButton("✓");
        buttonxok.setBounds(465,135,44,30);
        buttonxok.setBackground(Color.GREEN);
        buttonxok.setOpaque(true);
        panel.add(buttonxok);
        buttonxok.addActionListener(new LoginApp());
        
        buttonx0 = new JButton("0");
        buttonx0.setBounds(420,135,42,30);
        panel.add(buttonx0);
        buttonx0.addActionListener(new LoginApp());
        
        buttonxcancel = new JButton("x");
        buttonxcancel.setBounds(375,135,42,30);
        buttonxcancel.setBackground(Color.RED);
        buttonxcancel.setOpaque(true);
        panel.add(buttonxcancel);
        buttonxcancel.addActionListener(new LoginApp());
        
        // inicio matriz numerica
        
        buttonxA = new JButton("a");
        buttonxA.setBounds(30,30,44,30);
        panel.add(buttonxA);
        buttonxA.addActionListener(new LoginApp());
        buttonxA.addActionListener(new LoginApp());
        
        
        buttonxB = new JButton("b");
        buttonxB.setBounds(75,30,44,30);
        panel.add(buttonxB);
        buttonxB.addActionListener(new LoginApp());
        
        
        buttonxC = new JButton("c");
        buttonxC.setBounds(120,30,44,30);
        panel.add(buttonxC);
        buttonxC.addActionListener(new LoginApp());
        
        buttonxD = new JButton("d");
        buttonxD.setBounds(165,30,44,30);
        panel.add(buttonxD);
        buttonxD.addActionListener(new LoginApp());

        buttonxE = new JButton("e");
        buttonxE.setBounds(210,30,44,30);
        panel.add(buttonxE);
        buttonxE.addActionListener(new LoginApp());
        
        buttonxF = new JButton("f");
        buttonxF.setBounds(255,30,44,30);
        panel.add(buttonxF);
        buttonxF.addActionListener(new LoginApp());
        
        buttonxG = new JButton("g");
        buttonxG.setBounds(305,30,44,30);
        panel.add(buttonxG);
        buttonxG.addActionListener(new LoginApp());
        
        //
        
        buttonxH = new JButton("h");
        buttonxH.setBounds(30,65,44,30);
        panel.add(buttonxH);
        buttonxH.addActionListener(new LoginApp());
        
        
        buttonxI = new JButton("i");
        buttonxI.setBounds(75,65,44,30);
        panel.add(buttonxI);
        buttonxI.addActionListener(new LoginApp());
        
        buttonxJ = new JButton("j");
        buttonxJ.setBounds(120,65,44,30);
        panel.add(buttonxJ);
        buttonxJ.addActionListener(new LoginApp());
        
        buttonxK = new JButton("k");
        buttonxK.setBounds(165,65,44,30);
        panel.add(buttonxK);
        buttonxK.addActionListener(new LoginApp());

        buttonxL = new JButton("l");
        buttonxL.setBounds(210,65,44,30);
        panel.add(buttonxL);
        buttonxL.addActionListener(new LoginApp());
        
        buttonxM = new JButton("m");
        buttonxM.setBounds(255,65,46,30);
        panel.add(buttonxM);
        buttonxM.addActionListener(new LoginApp());
        
        buttonxN = new JButton("n");
        buttonxN.setBounds(305,65,44,30);
        panel.add(buttonxN);
        buttonxN.addActionListener(new LoginApp());
        
        //
        
        buttonxO = new JButton("o");
        buttonxO.setBounds(30,100,44,30);
        panel.add(buttonxO);
        buttonxO.addActionListener(new LoginApp());
        
        
        buttonxP = new JButton("p");
        buttonxP.setBounds(75,100,44,30);
        panel.add(buttonxP);
        buttonxP.addActionListener(new LoginApp());
        
        buttonxQ = new JButton("q");
        buttonxQ.setBounds(120,100,44,30);
        panel.add(buttonxQ);
        buttonxQ.addActionListener(new LoginApp());
        
        buttonxR = new JButton("r");
        buttonxR.setBounds(165,100,44,30);
        panel.add(buttonxR);
        buttonxR.addActionListener(new LoginApp());

        buttonxS = new JButton("s");
        buttonxS.setBounds(210,100,44,30);
        panel.add(buttonxS);
        buttonxS.addActionListener(new LoginApp());
        
        buttonxT = new JButton("t");
        buttonxT.setBounds(255,100,46,30);
        panel.add(buttonxT);
        buttonxT.addActionListener(new LoginApp());
        
        buttonxU = new JButton("u");
        buttonxU.setBounds(305,100,44,30);
        panel.add(buttonxU);
        buttonxU.addActionListener(new LoginApp());
        
        //
        
        buttonxV = new JButton("v");
        buttonxV.setBounds(75,135,44,30);
        panel.add(buttonxV);
        buttonxV.addActionListener(new LoginApp());
        
        buttonxW = new JButton("w");
        buttonxW.setBounds(120,135,46,30);
        panel.add(buttonxW);
        buttonxW.addActionListener(new LoginApp());
        
        buttonxX = new JButton("x");
        buttonxX.setBounds(165,135,44,30);
        panel.add(buttonxX);
        buttonxX.addActionListener(new LoginApp());

        buttonxY = new JButton("y");
        buttonxY.setBounds(210,135,44,30);
        panel.add(buttonxY);
        buttonxY.addActionListener(new LoginApp());
        
        buttonxZ = new JButton("z");
        buttonxZ.setBounds(255,135,46,30);
        buttonxZ.addActionListener(new LoginApp());
        panel.add(buttonxZ);

        // fin matriz numerica

        frame.setVisible(true);
        
    }

   
    @Override
    public void actionPerformed(final ActionEvent e) {
        
        if(e.getSource()==buttonxA){
            passwordText.setText(userText.getText() + "a");
        }
        if(e.getSource()==buttonxB){
            
            passwordText.setText(passwordText.getText() + "b");
        }
        if(e.getSource()==buttonxC){
            
            passwordText.setText(passwordText.getText() + "c");
        }
        if(e.getSource()==buttonxD){
            
            passwordText.setText(passwordText.getText() + "d");
        }
        if(e.getSource()==buttonxE){
            
            passwordText.setText(passwordText.getText() + "e");
        }
        if(e.getSource()==buttonxF){
            
            passwordText.setText(passwordText.getText() + "f");
        }
        if(e.getSource()==buttonxG){
            
            passwordText.setText(passwordText.getText() + "g");
        }
        if(e.getSource()==buttonxH){
            
            passwordText.setText(passwordText.getText() + "h");
        }
        if(e.getSource()==buttonxI){
            
            passwordText.setText(passwordText.getText() + "i");
        }
        if(e.getSource()==buttonxJ){
            
            passwordText.setText(passwordText.getText() + "j");
        }
        if(e.getSource()==buttonxK){
            
            passwordText.setText(passwordText.getText() + "k");
        }
        if(e.getSource()==buttonxL){
            
            passwordText.setText(passwordText.getText() + "l");
        }
        if(e.getSource()==buttonxM){
            
            passwordText.setText(passwordText.getText() + "m");
        }
        if(e.getSource()==buttonxN){
            
            passwordText.setText(passwordText.getText() + "n");
        }
        if(e.getSource()==buttonxÑ){
            
            passwordText.setText(passwordText.getText() + "ñ");
        }
        if(e.getSource()==buttonxO){
            
            passwordText.setText(passwordText.getText() + "o");
        }
        if(e.getSource()==buttonxP){
            
            passwordText.setText(passwordText.getText() + "p");
        }
        if(e.getSource()==buttonxQ){
            
            passwordText.setText(passwordText.getText() + "q");
        }
        if(e.getSource()==buttonxR){
            
            passwordText.setText(passwordText.getText() + "r");
        }
        if(e.getSource()==buttonxS){
            
            passwordText.setText(passwordText.getText() + "s");
        }
        if(e.getSource()==buttonxT){
            
            passwordText.setText(passwordText.getText() + "t");
        }
        if(e.getSource()==buttonxU){
            
            passwordText.setText(passwordText.getText() + "u");
        }
        if(e.getSource()==buttonxV){
            
            passwordText.setText(passwordText.getText() + "v");
        }
        if(e.getSource()==buttonxW){
            
            passwordText.setText(passwordText.getText() + "w");
        }
        if(e.getSource()==buttonxX){
            
            passwordText.setText(passwordText.getText() + "x");
        }
        if(e.getSource()==buttonxY){
            
            passwordText.setText(passwordText.getText() + "y");
        }
        if(e.getSource()==buttonxZ){
            
            passwordText.setText(passwordText.getText() + "y");
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
        
        if(e.getSource()==buttonx4){
            passwordText.setText(passwordText.getText() + "4");
        }
        
        if(e.getSource()==buttonx5){
            passwordText.setText(passwordText.getText() + "5");
        }
        
        if(e.getSource()==buttonx6){
            passwordText.setText(passwordText.getText() + "6");
        }
        
        if(e.getSource()==buttonx7){
            passwordText.setText(passwordText.getText() + "7");
        }
        
        if(e.getSource()==buttonx8){
            passwordText.setText(passwordText.getText() + "8");
        }
        
        if(e.getSource()==buttonx9){
            passwordText.setText(passwordText.getText() + "9");
        }
        
        if(e.getSource()==buttonxok){
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
            
            if(rs.next())
            {
                //success ex = new success();
                System.out.println("conexion exitosa");
                new success();
                //LoginApp frame = new LoginApp();
                //frame.setVisible(false);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos","Error login",2);
            }

        } catch (final SQLException ex){
            Logger.getLogger(LoginApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        if(e.getSource()==buttonx0){
            passwordText.setText(passwordText.getText() + "0");
        }
        
        if(e.getSource()==buttonxcancel){
            passwordText.setText(null);
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
            
            if(rs.next())
            {
                //success ex = new success();
                System.out.println("conexion exitosa");
                new success();
                //LoginApp frame = new LoginApp();
                //frame.setVisible(false);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos","Error login",2);
            }

        } catch (final SQLException ex){
            Logger.getLogger(LoginApp.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
               
    }

    
    
}

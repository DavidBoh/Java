/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfanum;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author herrboh
 */
public class AlfaNum implements ActionListener {
    
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
    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {

        final JFrame framex1 = new JFrame();
        final JPanel panelx1 = new JPanel();
        framex1.setSize(750,350);
        framex1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelx1.setLayout(null); //permite modificar posicionamiento de botones
        framex1.setLocationRelativeTo(null);
        //x y width height
        
        buttonx1 = new JButton("1");
        buttonx1.setBounds(335,10,42,30);
        panelx1.add(buttonx1);
        buttonx1.addActionListener(new AlfaNum());
        
        buttonx2 = new JButton("2");
        buttonx2.setBounds(380,10,42,30);
        panelx1.add(buttonx2);
        
        buttonx3 = new JButton("3");
        buttonx3.setBounds(425,10,42,30);
        panelx1.add(buttonx3);
        
        buttonx4 = new JButton("4");
        buttonx4.setBounds(335,45,42,30);
        buttonx4.addActionListener(new AlfaNum());
        panelx1.add(buttonx4);

        buttonx5 = new JButton("5");
        buttonx5.setBounds(380,45,42,30);
        panelx1.add(buttonx5);
        
        buttonx6 = new JButton("6");
        buttonx6.setBounds(425,45,42,30);
        panelx1.add(buttonx6);
        
        buttonx7 = new JButton("7");
        buttonx7.setBounds(335,80,42,30);
        buttonx7.addActionListener(new AlfaNum());
        panelx1.add(buttonx7);

        buttonx8 = new JButton("8");
        buttonx8.setBounds(380,80,42,30);
        panelx1.add(buttonx8);
        
        buttonx9 = new JButton("9");
        buttonx9.setBounds(425,80,42,30);
        panelx1.add(buttonx9);
        
        buttonxok = new JButton("✓");
        buttonxok.setBounds(425,115,44,30);
        buttonxok.setBackground(Color.GREEN);
        buttonxok.setOpaque(true);
        panelx1.add(buttonxok);
        
        buttonx0 = new JButton("0");
        buttonx0.setBounds(380,115,42,30);
        panelx1.add(buttonx0);
        
        buttonxcancel = new JButton("x");
        buttonxcancel.setBounds(335,115,42,30);
        buttonxcancel.setBackground(Color.RED);
        buttonxcancel.setOpaque(true);
        panelx1.add(buttonxcancel);
        
        //
        
        buttonxA = new JButton("a");
        buttonxA.setBounds(10,10,44,30);
        panelx1.add(buttonxA);
        buttonxA.addActionListener(new AlfaNum());
        
        buttonxB = new JButton("b");
        buttonxB.setBounds(55,10,44,30);
        panelx1.add(buttonxB);
        
        buttonxC = new JButton("c");
        buttonxC.setBounds(100,10,44,30);
        panelx1.add(buttonxC);
        
        buttonxD = new JButton("d");
        buttonxD.setBounds(145,10,44,30);
        buttonxD.addActionListener(new AlfaNum());
        panelx1.add(buttonxD);

        buttonxE = new JButton("e");
        buttonxE.setBounds(190,10,44,30);
        panelx1.add(buttonxE);
        
        buttonxF = new JButton("f");
        buttonxF.setBounds(235,10,44,30);
        panelx1.add(buttonxF);
        
        buttonxG = new JButton("g");
        buttonxG.setBounds(280,10,44,30);
        buttonxG.addActionListener(new AlfaNum());
        panelx1.add(buttonxG);
        
        //
        
        buttonxH = new JButton("h");
        buttonxH.setBounds(10,45,44,30);
        panelx1.add(buttonxH);
        buttonxH.addActionListener(new AlfaNum());
        
        buttonxI = new JButton("i");
        buttonxI.setBounds(55,45,44,30);
        panelx1.add(buttonxI);
        
        buttonxJ = new JButton("j");
        buttonxJ.setBounds(100,45,44,30);
        panelx1.add(buttonxJ);
        
        buttonxK = new JButton("k");
        buttonxK.setBounds(145,45,44,30);
        buttonxK.addActionListener(new AlfaNum());
        panelx1.add(buttonxK);

        buttonxL = new JButton("l");
        buttonxL.setBounds(190,45,44,30);
        panelx1.add(buttonxL);
        
        buttonxM = new JButton("m");
        buttonxM.setBounds(235,45,46,30);
        panelx1.add(buttonxM);
        
        buttonxN = new JButton("n");
        buttonxN.setBounds(285,45,44,30);
        buttonxN.addActionListener(new AlfaNum());
        panelx1.add(buttonxN);
        
        //
        
        buttonxO = new JButton("o");
        buttonxO.setBounds(10,80,44,30);
        panelx1.add(buttonxO);
        buttonxO.addActionListener(new AlfaNum());
        
        buttonxP = new JButton("p");
        buttonxP.setBounds(55,80,44,30);
        panelx1.add(buttonxP);
        
        buttonxQ = new JButton("q");
        buttonxQ.setBounds(100,80,44,30);
        panelx1.add(buttonxQ);
        
        buttonxR = new JButton("r");
        buttonxR.setBounds(145,80,44,30);
        buttonxR.addActionListener(new AlfaNum());
        panelx1.add(buttonxR);

        buttonxS = new JButton("s");
        buttonxS.setBounds(190,80,44,30);
        panelx1.add(buttonxS);
        
        buttonxT = new JButton("t");
        buttonxT.setBounds(235,80,46,30);
        panelx1.add(buttonxT);
        
        buttonxU = new JButton("u");
        buttonxU.setBounds(285,80,44,30);
        buttonxU.addActionListener(new AlfaNum());
        panelx1.add(buttonxU);
        
        //
        
        buttonxV = new JButton("v");
        buttonxV.setBounds(50,115,44,30);
        panelx1.add(buttonxV);
        
        buttonxW = new JButton("w");
        buttonxW.setBounds(97,115,46,30);
        panelx1.add(buttonxW);
        
        buttonxX = new JButton("x");
        buttonxX.setBounds(145,115,44,30);
        buttonxX.addActionListener(new AlfaNum());
        panelx1.add(buttonxX);

        buttonxY = new JButton("y");
        buttonxY.setBounds(190,115,44,30);
        panelx1.add(buttonxY);
        
        buttonxZ = new JButton("z");
        buttonxZ.setBounds(235,115,46,30);
        panelx1.add(buttonxZ);
        
        //

        framex1.setVisible(true);
        framex1.add(panelx1);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

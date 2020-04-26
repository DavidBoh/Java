
package otrosgui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ventana extends JFrame implements ActionListener, ChangeListener{

    // button, combobox-> actionlistener ---- checkbox-> change listener
ButtonGroup grupo, grupo2;


JRadioButton R1, R2, R3, R4, Rnegro, Rverdebotella, Rrojo, Razul;
JCheckBox ch1, ch2;
JTextArea Atexto;
Color color1;


Ventana() {
    
setTitle("Otros ElementosGui");
setSize(450,600);
setLayout(null);
getContentPane().setBackground(new Color(56, 12, 32));



grupo=new ButtonGroup();
grupo2=new ButtonGroup();
R1= new JRadioButton("Arial");
R2= new JRadioButton("Times new roman");
R3= new JRadioButton("Tahoma");
R4= new JRadioButton("Consolas");

color1= new Color (0, 0, 0);

Razul= new JRadioButton("Azul");
Rrojo= new JRadioButton("Rojo");
Rverdebotella=new JRadioButton("Verde O.");
Rnegro= new JRadioButton("Negro");
        
        
grupo.add(R1);
grupo.add(R2);
grupo.add(R3);

grupo.add(R4);
grupo2.add(Razul);
grupo2.add(Rrojo);
grupo2.add(Rverdebotella);
grupo2.add(Rnegro);

ch1=new JCheckBox();
ch2=new JCheckBox();

Atexto=new JTextArea(10, 100);
Atexto.setForeground(color1);
            

R1.setBounds(10, 10, 80, 30);
R2.setBounds(100, 10, 80, 30);
R3.setBounds(210, 10, 80, 30);
R4.setBounds(300, 10, 80, 30);

Razul.setBounds(10, 40, 80, 30);
Rrojo.setBounds(100, 40, 80, 30);
Rverdebotella.setBounds(210, 40, 80, 30);
Rnegro.setBounds(300, 40, 80, 30);

ch1.setBounds(100, 90, 30, 30);
ch2.setBounds(150, 90, 30, 30);

Atexto.setBounds(10, 200, 280, 280);
Atexto.setEditable(true);

this.add(R1);
this.add(R2);
this.add(R3);
this.add(R4);
this.add(ch1);
this.add(Razul);
this.add(Rrojo);
this.add(Rverdebotella);
this.add(Rnegro);

ch1.addChangeListener(this);
this.add(ch2);
ch2.addChangeListener(this);
this.add(Atexto);

R1.addActionListener(this);
R2.addActionListener(this);
R3.addActionListener(this);
R4.addActionListener(this);
Razul.addActionListener(this);
Rverdebotella.addActionListener(this);
Rnegro.addActionListener(this);
Rrojo.addActionListener(this);

setVisible(true);    
setDefaultCloseOperation(EXIT_ON_CLOSE);
 
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==R1)
        {
        Atexto.setFont(new Font("Arial", Font.PLAIN,12));
        //Fuentes, construcción normal= Font Fuente=new Font("NombreExactoFuente", Font.BOLD+Font.ITALIC, 12 )
        
        }
        if(e.getSource()==R2)
        {
         Atexto.setFont(new Font("Times new roman", Font.BOLD,12));
        }
        if(e.getSource()==R3)
        {
         Atexto.setFont(new Font("Tahoma", Font.ITALIC, 12));
        }
        if(e.getSource()==R4)
        {
         Atexto.setFont(new Font("Consolas", Font.PLAIN, 12));
        }
        if(e.getSource()==Razul)
        {
         Atexto.setForeground(new Color(0, 0, 225));
        }
        if(e.getSource()==Rrojo)
        {
         Atexto.setForeground(new Color(153, 0, 0));
        }
        if(e.getSource()==Rverdebotella)
        {
         Atexto.setForeground(new Color(0, 153, 51));
        }
        if(e.getSource()==Rnegro)
        {
         Atexto.setForeground(new Color(0, 0, 00));
        }
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        if(ch1.isSelected()==true)
        {
         Atexto.setEditable(true);
        }
        else
        {
        Atexto.setEditable(false);
        }
        
        if(ch2.isSelected()==false)
        {
        R1.setEnabled(false); //también funcionarìa con set visible 
        }
        else
        {
        R1.setEnabled(true);
        }
        
        
    }

    
    
}


package calculadoramvc;

import java.awt.*;
import javax.swing.*;



public class VistaCalc extends JFrame {
    
    public JLabel la, lb, tr;
    public JTextField ta, tb;
    public JButton sum, res, mul, div, rai, pot, mod;
    
    
    
    VistaCalc(){
        setSize(400,300);
        setTitle("CalculadoraMCV");
        setLayout(null);
        la= new JLabel(" a ");
        lb= new JLabel(" b ");
        ta= new JTextField(5);
        tb= new JTextField(5);
        sum= new JButton(" + ");
        res= new JButton(" - ");
        mul= new JButton(" * ");
        div= new JButton(" \u00F7 ");
        rai= new JButton("a"+"\u221A"+"b");
        pot= new JButton(" a^b");
        mod= new JButton(" a%b ");
        tr=new JLabel("");
        
        la.setBounds(30,10,40,30);
        lb.setBounds(140,10,100,30);
        ta.setBounds(50,10,40,30);
        tb.setBounds(160,10,40,30);
        sum.setBounds(50,100,60,60);
        res.setBounds(100,100,60,60);
        mul.setBounds(50,150,60,60);
        div.setBounds(100,150,60,60);
        rai.setBounds(180, 100, 60, 60);
        pot.setBounds(180, 150, 60,60);
        mod.setBounds(240, 100, 70,60 );
        tr.setBounds(100,200,100,100);
        
        this.add(la); this.add(lb);
        this.add(ta); this.add(tb);
        this.add(sum); this.add(res);
        this.add(mul); this.add(div);
        this.add(rai); this.add(pot);
        this.add(mod);
        
        this.add(tr);
        
        
                
    }
    
    
    
    
}

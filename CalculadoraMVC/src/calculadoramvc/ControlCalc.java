
package calculadoramvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class ControlCalc implements ActionListener {
    
    VistaCalc v;
    ModeloCalc m;
    
    ControlCalc(ModeloCalc mol, VistaCalc vis){
        v=vis;
        m=mol;
        
        v.sum.addActionListener(this);
        v.res.addActionListener(this);
        v.mul.addActionListener(this);
        v.div.addActionListener(this);
        v.rai.addActionListener(this);
        v.pot.addActionListener(this);
        v.mod.addActionListener(this);
        v.setVisible(true);
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double a=Double.parseDouble(v.ta.getText());
        double b=Double.parseDouble(v.tb.getText());
        
        if(e.getSource()==v.sum){
            v.tr.setText(""+m.Suma(a,b));
        }
        
        if(e.getSource()==v.res){
            v.tr.setText(""+m.Resta(a,b));
        }
        
        if(e.getSource()==v.mul){
            v.tr.setText(""+m.Multiplicar(a,b));
        }
        
        if(e.getSource()==v.div){
            v.tr.setText(""+m.Dividir(a,b));
        }
        
        if(e.getSource()==v.rai){
            v.tr.setText(""+m.Raiz(a,b));
        
        }
        
        if(e.getSource()==v.pot){
            v.tr.setText(""+m.Potencia(a,b));
        
        }
        
        if(e.getSource()==v.mod){
            v.tr.setText(""+m.Modulo(a,b));
        
        }
        
        
        
    }
    
}

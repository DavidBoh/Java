
package excelpirata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Ventana extends JFrame implements ActionListener{
    JScrollPane scroll;
    JButton b;
    JTable tabla;
    
    Ventana()
    {
        setSize(400, 300);
        setTitle("Excel chimbis");
        setLayout(null);
        
        String titulo[]={"A", "B","C", "D"};
        
        //matriz quemada:
        
        String celdas[][]={{"0-0", "0-1", "0-2", "0-3"},
                           {"1-0", "1-1", "1-2", "1-3"},
                           {"3-0", "3-1", "3-2", "3-3"}};
    
    tabla=new JTable(celdas, titulo);
    scroll=new JScrollPane(tabla);
    
    scroll.setBounds(20, 20, 200, 200);
    this.add(scroll);
    b=new JButton("Leer");
    
    b.setBounds(250,20,70,40);
    this.add(b);
    b.addActionListener(this);
    setVisible(true);
        
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int fil=tabla.getRowCount();
        int col=tabla.getColumnCount();
        
        for (int i=0; i<fil; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(tabla.getValueAt(i,j)+"\t");
            }
            System.out.println("");
        }
        
        
        
    }
    
    
    
}

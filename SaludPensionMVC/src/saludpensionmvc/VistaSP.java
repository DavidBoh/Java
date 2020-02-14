


package saludpensionmvc;

import java.awt.*;
import javax.swing.*;


public class VistaSP extends JFrame {
    
    public JLabel rr2, rr3, lnombre, ltipo_doc, lnun_doc, lfecha_na, ldia, lmes, lanio, lvalor, r1, r2, r3, rr; 
    public JTextField nombre, salario, num_doc;
    public JButton calcular;
    public JComboBox tipo_doc, dia, mes, anio;
    
    
    VistaSP(){
       setSize(500,400);
       setTitle("Salud, y pensión - David Bohórquez");
       setLayout(null);
       
       lnombre= new JLabel(" Nombre: ");
       ltipo_doc= new JLabel(" Tipo Documento: ");
       lnun_doc= new JLabel(" Número Documento: ");
       lfecha_na= new JLabel(" Fecha Nacimiento: ");
       ldia= new JLabel(" Día ");
       lmes= new JLabel(" Mes ");
       lanio= new JLabel(" Año ");
       lvalor= new JLabel(" Valor Salario ");
       r1= new JLabel(" De salud debe pagar: ");
       r2= new JLabel(" De pensión debe pagar: ");
       r3= new JLabel(" Semanas cotizadas: ");
       rr= new JLabel("  ");
       rr2= new JLabel("  ");
       rr3= new JLabel("  ");
       
       nombre= new JTextField(10);
       salario= new JTextField(10);
       num_doc= new JTextField(10);
       
       calcular= new JButton("Calcular ");
       
       tipo_doc= new JComboBox();
       tipo_doc.addItem(" - ");
       tipo_doc.addItem(" Cédula Ciudadanía ");
       tipo_doc.addItem(" Cédula Extranjería ");
       tipo_doc.addItem(" Pasaporte ");
       tipo_doc.addItem(" Registro Civil ");
       
       dia= new JComboBox();
       dia.addItem(" - ");
       dia.addItem(" 1 ");
       dia.addItem(" 2 ");
       dia.addItem(" 3 ");
       dia.addItem(" 4 ");
       dia.addItem(" 5 ");
       dia.addItem(" 6 ");
       dia.addItem(" 7 ");
       dia.addItem(" 8 ");
       dia.addItem(" 9 ");
       dia.addItem(" 10 ");
       dia.addItem(" 11 ");
       dia.addItem(" 10 ");
       dia.addItem(" 13 ");
       dia.addItem(" 14 ");
       dia.addItem(" 15 ");
       dia.addItem(" 16 ");
       dia.addItem(" 17 ");
       dia.addItem(" 18 ");
       dia.addItem(" 19 ");
       dia.addItem(" 20 ");
       dia.addItem(" 21 ");
       dia.addItem(" 22 ");
       dia.addItem(" 23 ");
       dia.addItem(" 24 ");
       dia.addItem(" 25 ");
       dia.addItem(" 26 ");
       dia.addItem(" 27 ");
       dia.addItem(" 28 ");
       dia.addItem(" 29 ");
       dia.addItem(" 30 ");
       dia.addItem(" 31 ");
       
       mes= new JComboBox();
       mes.addItem(" - ");
       mes.addItem(" ENERO ");
       mes.addItem(" FEBRERO ");
       mes.addItem(" MARZO ");
       mes.addItem(" ABRIL ");
       mes.addItem(" MAYO ");
       mes.addItem(" JUNIO ");
       mes.addItem(" JULIO ");
       mes.addItem(" AGOSTO ");
       mes.addItem(" SEPTIEMBRE ");
       mes.addItem(" OCTUBRE ");
       mes.addItem(" NOVIEMBRE ");
       mes.addItem(" DICIEMBRE ");
       
       anio= new JComboBox();
       anio.addItem(" - ");
       anio.addItem(" 1930 ");
       anio.addItem(" 1931 ");
       anio.addItem(" 1932 ");
       anio.addItem(" 1933 ");
       anio.addItem(" 1934 ");
       anio.addItem(" 1935 ");
       anio.addItem(" 1936 ");
       anio.addItem(" 1937 ");
       anio.addItem(" 1938 ");
       anio.addItem(" 1939 ");
       anio.addItem(" 1940 ");
       anio.addItem(" 1941 ");
       anio.addItem(" 1942 ");
       anio.addItem(" 1943 ");
       anio.addItem(" 1944 ");
       anio.addItem(" 1945 ");
       anio.addItem(" 1946 ");
       anio.addItem(" 1947 ");
       anio.addItem(" 1948 ");
       anio.addItem(" 1949 ");
       anio.addItem(" 1950 ");
       anio.addItem(" 1951 ");
       anio.addItem(" 1952 ");
       anio.addItem(" 1953 ");
       anio.addItem(" 1954 ");
       anio.addItem(" 1955 ");
       anio.addItem(" 1956 ");
       anio.addItem(" 1957 ");
       anio.addItem(" 1958 ");
       anio.addItem(" 1959 ");
       anio.addItem(" 1960 ");
       anio.addItem(" 1961 ");
       anio.addItem(" 1962 ");
       anio.addItem(" 1963 ");
       anio.addItem(" 1964 ");
       anio.addItem(" 1965 ");
       anio.addItem(" 1966 ");
       anio.addItem(" 1967 ");
       anio.addItem(" 1968 ");
       anio.addItem(" 1969 ");
       anio.addItem(" 1970 ");
       anio.addItem(" 1971 ");
       anio.addItem(" 1972 ");
       anio.addItem(" 1973 ");
       anio.addItem(" 1974 ");
       anio.addItem(" 1975 ");
       anio.addItem(" 1976 ");
       anio.addItem(" 1977 ");
       anio.addItem(" 1978 ");
       anio.addItem(" 1979 ");
       anio.addItem(" 1980 ");
       anio.addItem(" 1981 ");
       anio.addItem(" 1982 ");
       anio.addItem(" 1983 ");
       anio.addItem(" 1984 ");
       anio.addItem(" 1985 ");
       anio.addItem(" 1986 ");
       anio.addItem(" 1987 ");
       anio.addItem(" 1988 ");
       anio.addItem(" 1989 ");
       anio.addItem(" 1990 ");
       anio.addItem(" 1991 ");
       anio.addItem(" 1992 ");
       anio.addItem(" 1993 ");
       anio.addItem(" 1994 ");
       anio.addItem(" 1995 ");
       anio.addItem(" 1996 ");
       anio.addItem(" 1997 ");
       anio.addItem(" 1998 ");
       anio.addItem(" 1999 ");
       anio.addItem(" 2000 ");
       
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

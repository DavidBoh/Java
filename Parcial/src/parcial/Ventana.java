
package parcial;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ActionListener{
    
    JLabel dire_res2,doc_id2,lugar_na2,apto, muni, barr, direcc, colegio, colegio2, colegio3, pegar_foto, pegar_foto2, pegar_foto3, pegar_foto4, reserva, grado_a, info_alumno, pri_no, seg_no, pri_ap, seg_ap, lugar_na, ciu, depa, dia, mes, anio, edad, doc_id, tipo, num_id, expedida, dire_res, tele_cas, tele_cel, email, ti, cc, rc, pas;
    JTextField tnume, t_direcc, num_doc, no_cupo, tpri_no, tseg_no, tpri_ap, tseg_ap, tdoc_id, ttele_cas, ttele_cel, temail;
    JButton enviar, borrar; 
    JComboBox cgrado_a, cciu, cdepa, cdia, cmes, canio, cedad, ctipo, cexpedida, cmunicipio, cbarrio, ctipo_doc;
    Color color1, color2; 
    JRadioButton rti, rcc, rrc, rpas;
    ButtonGroup grupo1;
    
    Ventana(){
    this.setLayout(null);
    this.setSize(900, 700);
    
    
    colegio= new JLabel("COLEGIO MANZANARES");
    colegio2=new JLabel("FORMULARIO INSCRIPCION 2016 - ALUMNOS NUEVOS");
    colegio3=new JLabel("CALIDAD HUMANA NUESTRA FILOSOFIA, EDUCACION INTEGRAL NUESTRA RAZON DE SER");
    pegar_foto=new JLabel("PEGAR");
    pegar_foto2=new JLabel("FOTO");
    pegar_foto3=new JLabel("RECIENTE ");
    pegar_foto4=new JLabel("(fondo blanco)");
    
    reserva=new JLabel("RESERVA DE CUPO");
    grado_a=new JLabel("GRADO AL QUE ASPIRA");
    info_alumno=new JLabel("INFORMACIÓN DEL ALUMNO: (favor diligenciar con letra clara y legible, tinta negra)");
    pri_no=new JLabel("Primer Nombre");
    seg_no=new JLabel("Segundo Nombre");
    pri_ap=new JLabel("Primer Apellido");
    seg_ap=new JLabel("Segundo Apellido");
    lugar_na=new JLabel("LUGAR/FECHA");
    lugar_na2=new JLabel("NACIMIENTO");
    ciu=new JLabel("CIUDAD");
    depa=new JLabel("DEPARTAMENTO");
    dia=new JLabel("DIA");
    mes=new JLabel("MES");
    anio=new JLabel("AÑO");
    edad=new JLabel("EDAD");
    doc_id=new JLabel("Documento");
    doc_id2=new JLabel("de Identidad");
    tipo=new JLabel("Tipo");
    num_id=new JLabel("Número");
    expedida=new JLabel("Expedida en");
    dire_res=new JLabel("DIRECCION DE");
    dire_res2=new JLabel("RESIDENCIA");
    muni=new JLabel("Municipio");
    barr=new JLabel("Barrio");
    direcc=new JLabel("Dirección");
    tele_cas=new JLabel("Teléfono Casa");
    tele_cel=new JLabel("Teléfono Celular alumno");
    email=new JLabel("e-mail alumno");
    apto=new JLabel("Apto/casa No:");
    ti=new JLabel("T.I");
    cc=new JLabel("C. C");
    rc=new JLabel("R. C");
    pas=new JLabel("PASAP");
    
   
    no_cupo=new JTextField(10);
    
    num_doc=new JTextField(10); 
    tpri_no=new JTextField(10);
    tseg_no=new JTextField(10);
    tpri_ap=new JTextField(10);
    tseg_ap=new JTextField(10);
    tdoc_id=new JTextField(10);
    ttele_cas=new JTextField(10);
    ttele_cel=new JTextField(10);
    temail=new JTextField(10);
    t_direcc=new JTextField(10);
    tnume=new JTextField(10);
    
    enviar=new JButton("ENVIAR");
    borrar=new JButton("BORRAR");
    
    cgrado_a=new JComboBox();
    cgrado_a.addItem(" - ");
    cgrado_a.addItem(" 1 Primaria ");
    cgrado_a.addItem(" 2 Primaria ");
    cgrado_a.addItem(" 3 Primaria ");
    cgrado_a.addItem(" 4 Primaria ");
    cgrado_a.addItem(" 5 Primaria ");
    cgrado_a.addItem(" 6 Bachillerato ");
    cgrado_a.addItem(" 7 Bachillerato ");
    cgrado_a.addItem(" 8 Bachillerato ");
    cgrado_a.addItem(" 9 Bachillerato ");
    cgrado_a.addItem(" 10 Bachillerato ");
    cgrado_a.addItem(" 11 Bachillerato ");
    
    
    cciu=new JComboBox();
    cciu.addItem(" - ");
    cciu.addItem(" BOGOTA ");
    cciu.addItem(" CHIA ");
    cciu.addItem(" CAJICA ");
    cciu.addItem(" ZIPAQUIRA ");
    cciu.addItem(" COTA ");
    cciu.addItem(" FUNZA ");
    
    cdepa=new JComboBox();
    cdepa.addItem(" - ");
    cdepa.addItem(" DISTRITO CAPITAL ");
    cdepa.addItem(" CUNDINAMARCA ");
    cdepa.addItem(" BOYACA ");
    cdepa.addItem(" TOLIMA ");
    cdepa.addItem(" ANTIOQUIA ");
        
    cdia=new JComboBox();
    cdia.addItem(" - ");
    cdia.addItem(" 1 ");
    cdia.addItem(" 2 ");
    cdia.addItem(" 3 ");
    cdia.addItem(" 4 ");
    cdia.addItem(" 5 ");
    cdia.addItem(" 6 ");
    cdia.addItem(" 7 ");
    cdia.addItem(" 8 ");
    cdia.addItem(" 9 ");
    cdia.addItem(" 10 ");
    cdia.addItem(" 11 ");
    cdia.addItem(" 12 ");
    cdia.addItem(" 13 ");
    cdia.addItem(" 14 ");
    cdia.addItem(" 15 ");
    cdia.addItem(" 16 ");
    cdia.addItem(" 17 ");
    cdia.addItem(" 18 ");
    cdia.addItem(" 19 ");
    cdia.addItem(" 20 ");
    cdia.addItem(" 21 ");
    cdia.addItem(" 22 ");
    cdia.addItem(" 23 ");
    cdia.addItem(" 24 ");
    cdia.addItem(" 25 ");
    cdia.addItem(" 26 ");
    cdia.addItem(" 27 ");
    cdia.addItem(" 28 ");
    cdia.addItem(" 29 ");
    cdia.addItem(" 30 ");
    cdia.addItem(" 31 ");
    
    cmes=new JComboBox();
    cmes.addItem(" - ");
    cmes.addItem(" ENERO ");
    cmes.addItem(" FEBRERO ");
    cmes.addItem(" MARZO ");
    cmes.addItem(" ABRIL ");
    cmes.addItem(" MAYO ");
    cmes.addItem(" JUNIO ");
    cmes.addItem(" JULIO ");
    cmes.addItem(" AGOSTO ");
    cmes.addItem(" SEPTIEMBRE ");
    cmes.addItem(" OCTUBRE ");
    cmes.addItem(" NOVIEMBRE ");
    cmes.addItem(" DICIEMBRE ");
    
    canio=new JComboBox();
    canio.addItem(" - ");
    canio.addItem(" 2000 ");
    canio.addItem(" 2001 ");
    canio.addItem(" 2002 ");
    canio.addItem(" 2003 ");
    canio.addItem(" 2004 ");
    canio.addItem(" 2005 ");
    canio.addItem(" 2006 ");
    canio.addItem(" 2007 ");
    canio.addItem(" 2008 ");
    canio.addItem(" 2009 ");
    canio.addItem(" 2010 ");
    canio.addItem(" 2011 ");
    canio.addItem(" 2012 ");
    canio.addItem(" 2013 ");   
    canio.addItem(" 2014 "); 
    canio.addItem(" 2015 "); 
    canio.addItem(" 2016 "); 
    
    
    cedad=new JComboBox();
    cedad.addItem(" - ");
    cedad.addItem(" 1 ");
    cedad.addItem(" 2 ");
    cedad.addItem(" 3 ");
    cedad.addItem(" 4 ");
    cedad.addItem(" 5 ");
    cedad.addItem(" 6 ");
    cedad.addItem(" 7 ");
    cedad.addItem(" 8 ");
    cedad.addItem(" 9 ");
    cedad.addItem(" 10 ");
    cedad.addItem(" 11 ");
    cedad.addItem(" 12 ");
    cedad.addItem(" 13 ");
    cedad.addItem(" 14 ");
    cedad.addItem(" 15 ");
    cedad.addItem(" 16 ");
    cedad.addItem(" 17 ");
    cedad.addItem(" 18 ");
    cedad.addItem(" 19 ");
    cedad.addItem(" 20 ");
    cedad.addItem(" 21 ");
    
    
    
    cexpedida=new JComboBox();
    cexpedida.addItem(" - ");
    cexpedida.addItem(" BOGOTA ");
    cexpedida.addItem(" CHIA ");
    cexpedida.addItem(" CAJICA ");
    cexpedida.addItem(" ZIPAQUIRA ");
    cexpedida.addItem(" COTA ");
    cexpedida.addItem(" FUNZA ");
    
    
    cmunicipio=new JComboBox();
    cmunicipio.addItem(" - ");
    cmunicipio.addItem(" CHIA ");
    cmunicipio.addItem(" CAJICA ");
    cmunicipio.addItem(" ZIPAQUIRA ");
    cmunicipio.addItem(" FUNZA ");
    cmunicipio.addItem(" COTA ");
    cmunicipio.addItem(" MOSQUERA ");
    
    cbarrio=new JComboBox();
    cbarrio.addItem(" - ");
    cbarrio.addItem(" SOACHA ");
    cbarrio.addItem(" SUBA ");
    cbarrio.addItem(" FONTIBON ");
    cbarrio.addItem(" CENTRO ");
    cbarrio.addItem(" OTRO ");
    
    ctipo_doc=new JComboBox();
    ctipo_doc.addItem(" - ");
    ctipo_doc.addItem(" Tarjeta Identidad ");
    ctipo_doc.addItem(" Cédula ");
    ctipo_doc.addItem(" Registro Civil ");
    ctipo_doc.addItem(" Pasaporte ");
    
    
    colegio.setBounds(300, 20, 700, 20);
    add(colegio);
    
    colegio2.setBounds(200, 40, 700, 20);
    add(colegio2);
    
    colegio3.setBounds(120, 60, 700, 20);
    add(colegio3);
    
    pegar_foto.setBounds(750, 60, 700, 20);
    add(pegar_foto);
    
    pegar_foto2.setBounds(750, 70, 700, 20);
    add(pegar_foto2);
    
    pegar_foto3.setBounds(750, 80, 700, 20);
    add(pegar_foto3);
    
    pegar_foto4.setBounds(740, 90, 700, 20);
    add(pegar_foto4);
    
    reserva.setBounds(100, 80, 700, 20);
    add(reserva);
    
    no_cupo.setBounds(210,80,80,20);
    add(no_cupo);
    
    grado_a.setBounds(300, 80, 700, 20);
    add(grado_a);
    
    cgrado_a.setBounds(460,80, 100,20);
    add(cgrado_a);
    
    info_alumno.setBounds(100, 100, 700, 20);
    add(info_alumno);
    
    pri_no.setBounds(100, 130, 100, 20);
    add(pri_no);
    
    tpri_no.setBounds(100, 150, 100, 20);
    add(tpri_no);
    
    seg_no.setBounds(300, 130, 100, 20);
    add(seg_no);
    
    tseg_no.setBounds(300, 150, 100, 20);
    add(tseg_no);
    
    pri_ap.setBounds(480, 130, 100, 20);
    add(pri_ap);
    
    tpri_ap.setBounds(480, 150, 100, 20);
    add(tpri_ap);

    seg_ap.setBounds(680, 130, 100, 20);
    add(seg_ap);
    
    tseg_ap.setBounds(680, 150, 100, 20);
    add(tseg_ap);

    lugar_na.setBounds(100, 170, 100, 20);
    add(lugar_na);
    lugar_na2.setBounds(100, 190, 100, 20);
    add(lugar_na2);

    ciu.setBounds(200, 170, 100, 20);
    add(ciu);

    cciu.setBounds(200, 190, 100, 20);
    add(cciu);
    
    depa.setBounds(310, 170, 100, 20);
    add(depa);
    
    cdepa.setBounds(310, 190, 100, 20);
    add(cdepa);
    
    dia.setBounds(460, 170, 100, 20);
    add(dia);
    
    cdia.setBounds(460, 190, 70, 20);
    add(cdia);
    
    mes.setBounds(530, 170, 100, 20);
    add(mes);
    
    cmes.setBounds(530, 190, 70, 20);
    add(cmes);

    anio.setBounds(600, 170, 100, 20);
    add(anio);
    
    canio.setBounds(600, 190, 70, 20);
    add(canio);
    
    edad.setBounds(710, 170, 100, 20);
    add(edad);
    
    cedad.setBounds(710, 190, 100, 20);
    add(cedad);

    doc_id.setBounds(100, 210, 100, 20);
    add(doc_id);
    
    doc_id2.setBounds(100, 230, 100, 20);
    add(doc_id2);
    
    tipo.setBounds(200, 210, 100, 20);
    add(tipo);
    
    
    ctipo_doc.setBounds(200, 230, 100, 20);
    add(ctipo_doc);
            
    
   
    
    num_id.setBounds(400, 210, 100, 20);
    add(num_id);
    
    num_doc.setBounds(400, 230, 100, 20);
    add(num_doc);
    
    expedida.setBounds(650, 210, 100, 20);
    add(expedida);
    
    cexpedida.setBounds(650, 230, 100, 20);
    add(cexpedida);

    dire_res.setBounds(100, 250, 100, 20);
    add(dire_res);
    
    dire_res2.setBounds(100, 270, 100, 20);
    add(dire_res2);

            
    muni.setBounds(200, 250, 100, 20);
    add(muni);
    
    barr.setBounds(350, 250, 100, 20);
    add(barr);
    
    direcc.setBounds(550, 250, 100, 20);
    add(direcc);
    
    cmunicipio.setBounds(200, 270, 100, 20);
    add(cmunicipio);
    
    cbarrio.setBounds(350, 270, 100, 20);
    add(cbarrio);
    
    t_direcc.setBounds(550, 270, 100, 20);
    add(t_direcc);
    
    tele_cas.setBounds(200, 290, 100, 20);
    add(tele_cas);
    
    tele_cel.setBounds(400, 290, 100, 20);
    add(tele_cel);
    
    email.setBounds(600, 290, 100, 20);
    add(email);
    
    ttele_cas.setBounds(200, 310, 100, 20);
    add(ttele_cas);
    
    ttele_cel.setBounds(400, 310, 100, 20);
    add(ttele_cel);
    
    temail.setBounds(600, 310, 100, 20);
    add(temail);

    enviar.setBounds(200, 350, 100, 20);
    add(enviar);     
    
    borrar.setBounds(400, 350, 100, 20);
    add(borrar); 
          
    enviar.addActionListener(this);
    borrar.addActionListener(this);
    
     



    
    
   
    
    
    this.setVisible(true);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==enviar){
        JOptionPane.showMessageDialog(null," Reserva de Cupo número: "+no_cupo.getText()
                +"\n Grado al que aspira: "+cgrado_a.getSelectedItem()
                +"\n Primer Nombre: "+tpri_no.getText()
                +"\n Segundo Nombre: "+tseg_no.getText()
                +"\n Primer Apellido: "+tpri_ap.getText()
                +"\n Segundo Apellido: "+tseg_ap.getText()
                +"\n Ciudad: "+cciu.getSelectedItem()
                +"\n Departamento: "+cdepa.getSelectedItem()
                +"\n Dia: "+cdia.getSelectedItem()
                +"\n Mes: "+cmes.getSelectedItem()
                +"\n Año: "+canio.getSelectedItem()
                +"\n Edad: "+cedad.getSelectedItem()
                +"\n Tipo documento: "+ctipo_doc.getSelectedItem()
                +"\n Expedida en: "+cexpedida.getSelectedItem()
                +"\n Municipio: "+cmunicipio.getSelectedItem()
                +"\n Barrio: "+cbarrio.getSelectedItem()
                +"\n Dirección: "+t_direcc.getText()
                +"\n Telefono casa: "+ttele_cas.getText()
                +"\n Telefono celular: "+ttele_cel.getText()
                +"\n email alumno: "+temail.getText()); 
        }
        if(e.getSource()==borrar){
            no_cupo.setText(null);
            cgrado_a.setSelectedItem(" - ");
            tpri_no.setText(null);
            tseg_no.setText(null);
            tpri_ap.setText(null);
            tseg_ap.setText(null);
            cciu.setSelectedItem(" - ");
            cdepa.setSelectedItem(" - ");
            cdia.setSelectedItem(" - ");
            cmes.setSelectedItem(" - ");
            canio.setSelectedItem(" - ");
            cedad.setSelectedItem(" - ");
            ctipo_doc.setSelectedItem(" - ");
            num_doc.setText(null);
            cexpedida.setSelectedItem(" - ");
            cmunicipio.setSelectedItem(" - ");
            cbarrio.setSelectedItem(" - ");
            t_direcc.setText(null);
            ttele_cas.setText(null);
            ttele_cel.setText(null);
            temail.setText(null); 
        }
   
    }
    
}

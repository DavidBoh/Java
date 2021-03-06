
package fomularioo;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
        
public class Datos extends JFrame implements ActionListener{

    JLabel dat_ubi, modifi, datos_per, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, documento_identidad, tipo_documento, lugar_expedicion,  fecha_expedicion, libreta_militar, distrito, estado_civil, tipo_sangre, sexo , religion, eps, nacimiento, fecha_nacimiento, pais_nacimiento, deprtamento_nacimiento, ciudad_nacimiento, datos_ubicacion, direccion_procedencia, pais, departamento, ciudad, direccion_residencia, pais_residencia, departamento_residencia, ciudad_residencia, sector_residencia, barrio_residencia, telefono, telefono_ciudad_e, celular, e_mail, e_mail_in, ruta_tr, asignacion_de, medio_po, datos_de_e, numero_pa, otra_na, numero_de_vi, fecha_ve_vi, estado_visa, l48;
    JTextField dire_re, fech_na, cua_fot, fprimer_nombre, fsegundo_nombre, fprimer_apellido, fsegundo_apellido, fdocumento_identidad, flugar_expedicion, ffecha_expedicion, flibreta_militar, fdistrito, feps, fdireccion_procedencia, fdireccion_residencia, ftelefono, ftelefono_cuidad_e, fcelular, fe_mail, fe_mail_i, fruta, fpasaporte, fnumero_visa, fvisa_vencimiento, f23;
    JButton bcambiar_foto, bvolver, bcontinuar, camb_fot;
    JComboBox ctipo_doc, cestado_civ, ctipo_sangre, csexo, creligion, cpais_na, cdepartamento_na, clugar_nacimiento, cpais_re, cdepa_re, cciudad_re, cpais_pro, cdepa_pro, cciudad_pro, csector, cbarrio, cmedio, cotra_na, cestado_visa ;
    Color blanco, azul1, azul2;
    JRadioButton sii, noo;
    ButtonGroup grupo;
    
    Datos(){
        this.setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 255));
        
        grupo=new ButtonGroup();
        
        dat_ubi=new JLabel("Datos Ubicación");
        modifi=new JLabel("Modificar Datos Personas Naturales");
        datos_per=new JLabel("Datos Personales");
        primer_nombre=new JLabel("Primer Nombre");
        segundo_nombre=new JLabel("Segundo Nombre");
        primer_apellido=new JLabel("Primer Apellido");
        segundo_apellido=new JLabel("Segundo Apellido");
        cua_fot=new JTextField("");
        l48=new JLabel("");
        documento_identidad=new JLabel("Documento Identidad");
        tipo_documento=new JLabel("Tipo de Documento de Identidad");
        lugar_expedicion=new JLabel("Lugar de Expedicion");
        fecha_expedicion=new JLabel("Fecha de expedicion");
        libreta_militar=new JLabel("Libreta Militar");
        distrito=new JLabel("Distrito");
        estado_civil=new JLabel("Estado Civil");
        tipo_sangre=new JLabel("Tipo de Sangre");
        sexo=new JLabel("Sexo");
        religion=new JLabel("Religión");
        eps=new JLabel("EPS");
        nacimiento=new JLabel("Nacimiento");
        fecha_nacimiento=new JLabel("Fecha de Nacimiento");
        pais_nacimiento=new JLabel("País");
        deprtamento_nacimiento=new JLabel("Departamento");
        ciudad_nacimiento=new JLabel("Ciudad");
        datos_ubicacion=new JLabel("Datos de Ubicación");
        direccion_procedencia=new JLabel("Dirección Procedencia");
        pais=new JLabel("País");
        departamento=new JLabel("Departamento");
        ciudad=new JLabel("Ciudad");
        direccion_residencia=new JLabel("Dirección Residencia");
        pais_residencia=new JLabel("País");
        departamento_residencia=new JLabel("Departamento");
        ciudad_residencia=new JLabel("Ciudad");
        sector_residencia=new JLabel("Sector");
        barrio_residencia=new JLabel("Barrio");
        telefono=new JLabel("Teléfono");
        telefono_ciudad_e=new JLabel("Teléfono Ciudad de Estudio");
        celular=new JLabel("Teléfono Celular");
        e_mail=new JLabel("E-mail");
        e_mail_in=new JLabel("E-mail Institucional");
        ruta_tr=new JLabel("Ruta Transporte");
        asignacion_de=new JLabel("Asignación de Tiquete Estudiantil");
        medio_po=new JLabel("Medio por el que se enteró de la institución");
        datos_de_e=new JLabel("Datos de Extranjería");
        numero_pa=new JLabel("Número del pasaporte");
        otra_na=new JLabel("Otra Nacionalidad");
        numero_de_vi=new JLabel("Número de la Visa");
        fecha_ve_vi=new JLabel("Fecha de Vencimiento de la Visa");
        estado_visa=new JLabel("Estado de la Visa");
        
        sii=new JRadioButton("Si");
        noo=new JRadioButton("No");
        
        dire_re=new JTextField(10);
        fprimer_nombre=new JTextField(10);
        fech_na= new JTextField(10);
        fsegundo_nombre=new JTextField(10); 
        fprimer_apellido=new JTextField(10); 
        fsegundo_apellido=new JTextField(10); 
        fdocumento_identidad=new JTextField(10); 
        flugar_expedicion=new JTextField(10); 
        ffecha_expedicion=new JTextField(10); 
        flibreta_militar=new JTextField(10); 
        fdistrito=new JTextField(10); 
        feps=new JTextField(10); 
        fdireccion_procedencia=new JTextField(10); 
        fdireccion_residencia=new JTextField(10); 
        ftelefono=new JTextField(10); 
        ftelefono_cuidad_e=new JTextField(10); 
        fcelular=new JTextField(10); 
        fe_mail=new JTextField(10); 
        fe_mail_i=new JTextField(10); 
        fruta=new JTextField(10); 
        fpasaporte=new JTextField(10); 
        fnumero_visa=new JTextField(10); 
        fvisa_vencimiento=new JTextField(10); 
      
        bcambiar_foto=new JButton("Cambiar Foto");
        bvolver=new JButton("Volver");
        bcontinuar=new JButton("Continuar");
        camb_fot= new JButton("Cambiar Foto");
        
        ctipo_doc=new JComboBox();
        ctipo_doc.addItem(" - ");
        ctipo_doc.addItem("Cédula Ciudadanía");
        ctipo_doc.addItem("Cédula Extranjería");
        ctipo_doc.addItem("Tarjeta Identidad");
        ctipo_doc.addItem("Registro Civil");
        
        cestado_civ=new JComboBox();
        cestado_civ.addItem(" - ");
        cestado_civ.addItem("Casado");
        cestado_civ.addItem("Soltero");
        cestado_civ.addItem("Comprometido");
        cestado_civ.addItem("Viudo");
        cestado_civ.addItem("Sin Definir");
        
        ctipo_sangre=new JComboBox();
        ctipo_sangre.addItem(" - ");
        ctipo_sangre.addItem("A+");
        ctipo_sangre.addItem("A-");
        ctipo_sangre.addItem("B+");
        ctipo_sangre.addItem("B-");
        ctipo_sangre.addItem("O+");
        ctipo_sangre.addItem("O-");
        ctipo_sangre.addItem("AB+");
        ctipo_sangre.addItem("AB-");
        
        csexo=new JComboBox();
        csexo.addItem(" - ");
        csexo.addItem("M");
        csexo.addItem("F");
        csexo.addItem("Otro");
        
        creligion=new JComboBox();
        creligion.addItem(" - ");
        creligion.addItem("Cristiano Católico");
        creligion.addItem("Cristiano Protesante");
        creligion.addItem("Musulmán");
        creligion.addItem("Budista");
        creligion.addItem("Hindu");
        creligion.addItem("Sikh");
        creligion.addItem("Sin Religión");
        
        cpais_na=new JComboBox();
        cpais_na.addItem(" - ");
        cpais_na.addItem("COLOMBIA");
        cpais_na.addItem("VENEZUELA");
        cpais_na.addItem("PANAMA");
        cpais_na.addItem("ECUADOR");
        cpais_na.addItem("PERU");
        cpais_na.addItem("BRASIL");
        
        cdepartamento_na=new JComboBox();
        cdepartamento_na.addItem(" - ");
        cdepartamento_na.addItem("CUNDINAMARCA");
        cdepartamento_na.addItem("BOGOTÁ D.C.");
        cdepartamento_na.addItem("BOYACÁ");
        cdepartamento_na.addItem("TOLIMA");
        cdepartamento_na.addItem("MEDELLÍN");
        cdepartamento_na.addItem("CALI");
        cdepartamento_na.addItem("SANTANDER");
        cdepartamento_na.addItem("NORTE DE SANTANDER");
        cdepartamento_na.addItem("HUILA");
        cdepartamento_na.addItem("PASTO");
        cdepartamento_na.addItem("META");
        cdepartamento_na.addItem("CAQUETÁ");
        
        clugar_nacimiento=new JComboBox();
        clugar_nacimiento.addItem(" - ");
        clugar_nacimiento.addItem("CHIA");
        clugar_nacimiento.addItem("BOGOTÁ D.C.");
        clugar_nacimiento.addItem("CAJICÁ");
        clugar_nacimiento.addItem("ZIPAQUIRÁ");
        clugar_nacimiento.addItem("MEDELLÍN");
        clugar_nacimiento.addItem("CALI");
        clugar_nacimiento.addItem("SUESCA");
        clugar_nacimiento.addItem("COTA");
        clugar_nacimiento.addItem("MELGAR");
        clugar_nacimiento.addItem("GIRARDOT");
        clugar_nacimiento.addItem("CAJICÁ");
        clugar_nacimiento.addItem("SOPÓ");
        
        cpais_re=new JComboBox();
        cpais_re.addItem(" - ");
        cpais_re.addItem("COLOMBIA");
        cpais_re.addItem("VENEZUELA");
        cpais_re.addItem("PANAMA");
        cpais_re.addItem("ECUADOR");
        cpais_re.addItem("PERU");
        cpais_re.addItem("BRASIL");
        
        cdepa_re=new JComboBox();
        cdepa_re.addItem(" - ");
        cdepa_re.addItem("CUNDINAMARCA");
        cdepa_re.addItem("BOGOTÁ D.C.");
        cdepa_re.addItem("BOYACÁ");
        cdepa_re.addItem("TOLIMA");
        cdepa_re.addItem("MEDELLÍN");
        cdepa_re.addItem("CALI");
        cdepa_re.addItem("SANTANDER");
        cdepa_re.addItem("NORTE DE SANTANDER");
        cdepa_re.addItem("HUILA");
        cdepa_re.addItem("PASTO");
        cdepa_re.addItem("META");
        cdepa_re.addItem("CAQUETÁ");
        
        cciudad_re=new JComboBox();
        cciudad_re.addItem(" - ");
        cciudad_re.addItem("CHIA");
        cciudad_re.addItem("BOGOTÁ D.C.");
        cciudad_re.addItem("CAJICÁ");
        cciudad_re.addItem("ZIPAQUIRÁ");
        cciudad_re.addItem("MEDELLÍN");
        cciudad_re.addItem("CALI");
        cciudad_re.addItem("SUESCA");
        cciudad_re.addItem("COTA");
        cciudad_re.addItem("MELGAR");
        cciudad_re.addItem("GIRARDOT");
        cciudad_re.addItem("CAJICÁ");
        cciudad_re.addItem("SOPÓ");
        
        cpais_pro=new JComboBox();
        cpais_pro.addItem(" - ");
        cpais_pro.addItem("COLOMBIA");
        cpais_pro.addItem("VENEZUELA");
        cpais_pro.addItem("PANAMA");
        cpais_pro.addItem("ECUADOR");
        cpais_pro.addItem("PERU");
        cpais_pro.addItem("BRASIL");
        
        cdepa_pro= new JComboBox();
        cdepa_pro.addItem(" - ");
        cdepa_pro.addItem("CUNDINAMARCA");
        cdepa_pro.addItem("BOGOTÁ D.C.");
        cdepa_pro.addItem("BOYACÁ");
        cdepa_pro.addItem("TOLIMA");
        cdepa_pro.addItem("MEDELLÍN");
        cdepa_pro.addItem("CALI");
        cdepa_pro.addItem("SANTANDER");
        cdepa_pro.addItem("NORTE DE SANTANDER");
        cdepa_pro.addItem("HUILA");
        cdepa_pro.addItem("PASTO");
        cdepa_pro.addItem("META");
        cdepa_pro.addItem("CAQUETÁ");  
        
        cciudad_pro=new JComboBox();
        cciudad_pro.addItem(" - ");
        cciudad_pro.addItem("CHIA");
        cciudad_pro.addItem("BOGOTÁ D.C.");
        cciudad_pro.addItem("CAJICÁ");
        cciudad_pro.addItem("ZIPAQUIRÁ");
        cciudad_pro.addItem("MEDELLÍN");
        cciudad_pro.addItem("CALI");
        cciudad_pro.addItem("SUESCA");
        cciudad_pro.addItem("COTA");
        cciudad_pro.addItem("MELGAR");
        cciudad_pro.addItem("GIRARDOT");
        cciudad_pro.addItem("CAJICÁ");
        cciudad_pro.addItem("SOPÓ");
                
        csector=new JComboBox();
        csector.addItem(" - ");
        csector.addItem("Bosa");
        csector.addItem("Soacha");
        csector.addItem("Suba");
        
        cbarrio=new JComboBox();
        cbarrio.addItem(" - ");
        cbarrio.addItem("Bosa");
        cbarrio.addItem("Soacha");
        cbarrio.addItem("Suba");
        
        cmedio=new JComboBox();
        cmedio.addItem(" - ");
        cmedio.addItem("Periódico Impreso");
        cmedio.addItem("Radio");
        cmedio.addItem("Televisión");
        cmedio.addItem("Internet");
        cmedio.addItem("Amigos");
        cmedio.addItem("Otro");
        
        cotra_na=new JComboBox();
        cotra_na.addItem(" - ");
        cotra_na.addItem("VENEZOLANA");
        cotra_na.addItem("ECUATORIANA");
        cotra_na.addItem("PANAMEÑA");
        cotra_na.addItem("BRASILEÑA");
        cotra_na.addItem("PERUANA");
        
        cestado_visa =new JComboBox();
        cestado_visa.addItem(" - ");
        cestado_visa.addItem("ACTIVA");
        cestado_visa.addItem("VENCIDA");
       
        azul1=new Color(0, 153, 204);
        modifi.setBounds(150, 10, 1650, 20);
        add(modifi);
        modifi.setBackground(azul1);
        modifi.setOpaque(true);
        modifi.setHorizontalAlignment(SwingConstants.CENTER);
        
        azul2=new Color(0, 153, 255);
        
        datos_per.setBounds(150, 30, 1650, 20);
        add(datos_per);
        datos_per.setBackground(azul2);
        datos_per.setOpaque(true);
        datos_per.setHorizontalAlignment(SwingConstants.CENTER);

        
        primer_nombre.setBounds(400, 70, 100, 20);
        add(primer_nombre);
        
        segundo_nombre.setBounds(1200, 70, 100, 20);
        add(segundo_nombre);
        
        fprimer_nombre.setBounds(400, 90, 100, 20);
        add(fprimer_nombre);
        
        fsegundo_nombre.setBounds(1200, 90, 100, 20);
        add(fsegundo_nombre);
        
        primer_apellido.setBounds(400, 110, 100, 20);
        add(primer_apellido);
        
        segundo_apellido.setBounds(1200, 110, 100, 20);
        add(segundo_apellido);
        
        fprimer_apellido.setBounds(400, 130, 100, 20);
        add(fprimer_apellido);
        
        fsegundo_apellido.setBounds(1200, 130, 100, 20);
        add(fsegundo_apellido);
        
        blanco= new Color (255, 255, 255);
        cua_fot.setBounds(1500, 70, 300, 70);
        add(cua_fot);
        cua_fot.setBackground(blanco);
        cua_fot.setEditable(false);
        
        bcambiar_foto.setBounds(1580, 150, 120, 20);
        add(bcambiar_foto);
        
        documento_identidad.setBounds(200, 190, 120, 20);
        add(documento_identidad);
        
        tipo_documento.setBounds(600, 190, 120, 20);
        add(tipo_documento);
        
        lugar_expedicion.setBounds(1100, 190, 120, 20);
        add(lugar_expedicion);
        
        fecha_expedicion.setBounds(1600, 190, 120, 20);
        add(fecha_expedicion);
        
        ctipo_doc.setBounds(600, 210, 130, 20);
        add(ctipo_doc);
     
        fdocumento_identidad.setBounds(200, 210, 130, 20);
        add(fdocumento_identidad);
        
        flugar_expedicion.setBounds(1100, 210, 130, 20);
        add(flugar_expedicion);
        
        ffecha_expedicion.setBounds(1600, 210, 130, 20);
        add(ffecha_expedicion);
        
        libreta_militar.setBounds(200, 240, 130, 20);
        add(libreta_militar);
        
        distrito.setBounds(400, 240, 130, 20);
        add(distrito);
                
        estado_civil.setBounds(600, 240, 130, 20);
        add(estado_civil);
                
        tipo_sangre.setBounds(800, 240, 130, 20);
        add(tipo_sangre);
        
        sexo.setBounds(1100,240, 130, 20);
        add(sexo);
        
        religion.setBounds(1300, 240, 130, 20);
        add(religion);
                
        eps.setBounds(1600, 240, 130, 20);
        add(eps);   
        
        flibreta_militar.setBounds(200, 270, 130, 20);
        add(flibreta_militar);
        
        fdistrito.setBounds(400, 270, 130, 20);
        add(fdistrito);
        
        cestado_civ.setBounds(600, 270, 130, 20);
        add(cestado_civ);
        
        ctipo_sangre.setBounds(800, 270, 130, 20);
        add(ctipo_sangre);
        
        csexo.setBounds(1100, 270, 130, 20);
        add(csexo);
        
        creligion.setBounds(1300, 270, 130, 20);
        add(creligion);
        
        feps.setBounds(1600, 270, 130, 20);
        add(feps);
        
        nacimiento.setBounds(150, 320, 1650, 20);
        add(nacimiento);
         nacimiento.setBackground(azul1);
        nacimiento.setOpaque(true);
        nacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        
        fecha_nacimiento.setBounds(200, 350, 130, 20);
        add(fecha_nacimiento);
        
        pais_nacimiento.setBounds(600, 350, 130, 20);
        add(pais_nacimiento);
        
        deprtamento_nacimiento.setBounds(900, 350, 130, 20);
        add(deprtamento_nacimiento);
        
        ciudad_nacimiento.setBounds(1200,350, 130, 20);
        add(ciudad_nacimiento);
        
        
        fech_na.setBounds(200, 380, 130, 20);
        add(fech_na);
        
        cpais_na.setBounds(600 ,380, 130, 20);
        add(cpais_na);
        
        cdepartamento_na.setBounds(900 ,380, 130, 20);
        add(cdepartamento_na);
        
        clugar_nacimiento.setBounds(1200 ,380, 130, 20);
        add(clugar_nacimiento);
        
        dat_ubi.setBounds(150, 430, 1650, 20);
        add(dat_ubi);
        dat_ubi.setBackground(azul1);
        dat_ubi.setOpaque(true);
        dat_ubi.setHorizontalAlignment(SwingConstants.CENTER);
        
        direccion_procedencia.setBounds(200, 460, 130, 20);
        add(direccion_procedencia);
        
        pais.setBounds(600, 460, 130, 20);
        add(pais);
        
        departamento.setBounds(900, 460, 130, 20);
        add(departamento);
        
        ciudad.setBounds(1200, 460, 130, 20);
        add(ciudad);
        
        fdireccion_residencia.setBounds(200, 480, 130, 20);
        add(fdireccion_residencia);
        
        cpais_pro.setBounds(600, 480, 130, 20);
        add(cpais_pro);
        
        cdepa_pro.setBounds(900, 480, 130, 20);
        add(cdepa_pro);
        
        cciudad_pro.setBounds(1200, 480, 130, 20);
        add(cciudad_pro);
        
        direccion_residencia.setBounds(200, 520, 130, 20);
        add(direccion_residencia);
        
        pais_residencia.setBounds(600, 520, 130, 20);
        add(pais_residencia);
        
        departamento_residencia.setBounds(900, 520, 130, 20);
        add(departamento_residencia);
        
        ciudad_residencia.setBounds(1200, 520, 130, 20);
        add(ciudad_residencia);
        
        dire_re.setBounds(200, 540, 130, 20);
        add(dire_re);
        
        cpais_re.setBounds(600, 540, 130, 20);
        add(cpais_re);
        
        cdepa_re.setBounds(900, 540, 130, 20);
        add(cdepa_re);
        
        cciudad_re.setBounds(1200, 540, 130, 20);
        add(cciudad_re);
        
        sector_residencia.setBounds(400, 570, 130, 20);
        add(sector_residencia);
        
        barrio_residencia.setBounds(1000, 570, 130, 20);
        add(barrio_residencia);
        
        csector.setBounds(400, 590,130, 20);
        add(csector);
        
        cbarrio.setBounds(1000, 590, 130, 20);
        add(cbarrio);
        
        telefono.setBounds(200, 620, 130, 20);
        add(telefono);
        
        telefono_ciudad_e.setBounds(500, 620, 200, 20);
        add(telefono_ciudad_e);
        
        celular.setBounds(900, 620, 130, 20);
        add(celular);
        
        e_mail.setBounds(1300, 620, 130, 20);
        add(e_mail);
        
        e_mail_in.setBounds(1500, 620, 130, 20);
        add(e_mail_in);
        
        ftelefono.setBounds(200 ,640, 130, 20);
        add(ftelefono);
        
        ftelefono_cuidad_e.setBounds(500 ,640, 130, 20);
        add(ftelefono_cuidad_e);
        
        fcelular.setBounds(900 ,640, 130, 20);
        add(fcelular);
        
        fe_mail.setBounds(1300 ,640, 130, 20);
        add(fe_mail);
        
        fe_mail_i.setBounds(1500 ,640, 130, 20);
        add(fe_mail_i);
        
        ruta_tr.setBounds(500, 670, 130, 20);
        add(ruta_tr);
        
        fruta.setBounds(500, 690, 130, 20);
        add(fruta);
        
        asignacion_de.setBounds(1000, 670, 130, 20);
        add(asignacion_de);
        
        sii.setBounds(1000, 690, 50, 20);
        add(sii);
        
        noo.setBounds(1100, 690, 50, 20);
        add(noo);
        
        grupo.add(sii);
        grupo.add(noo);
        
        medio_po.setBounds(800, 720, 500, 20);
        add(medio_po);
        
        cmedio.setBounds(800, 740, 100, 20);
        add(cmedio);
        
        datos_de_e.setBounds(150, 770, 1650, 20);
        add(datos_de_e);
        datos_de_e.setBackground(azul1);
        datos_de_e.setOpaque(true);
        datos_de_e.setHorizontalAlignment(SwingConstants.CENTER);
        
        numero_pa.setBounds(500,790,300, 20);
        add(numero_pa);
        
        otra_na.setBounds(1000,790, 300, 20);
        add(otra_na);
        
        cotra_na.setBounds(1000,810, 300, 20);
        add(cotra_na);
        
        fpasaporte.setBounds(500,810, 100, 20);
        add(fpasaporte);
        
        numero_de_vi.setBounds(400,840, 300, 20);
        add(numero_de_vi);
        
        fecha_ve_vi.setBounds(700,840, 300, 20);
        add(fecha_ve_vi);
        
        estado_visa.setBounds(1100,840, 300, 20);
        add(estado_visa);
        
        fnumero_visa.setBounds(400,860, 100, 20);
        add(fnumero_visa);
        
        fvisa_vencimiento.setBounds(700,860, 100, 20);
        add(fvisa_vencimiento);
        
        cestado_visa .setBounds(1100,860, 300, 20);
        add(cestado_visa );
        
        bvolver.setBounds(1500,900, 90, 20);
        add(bvolver);
        
        bcontinuar.setBounds(1600,900, 90, 20);
        add(bcontinuar);
        
        bcambiar_foto.addActionListener(this);
        bvolver.addActionListener(this);
        bcontinuar.addActionListener(this);
        
        this.setVisible(true);
        this.setSize(1900, 1000);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
   
    
}

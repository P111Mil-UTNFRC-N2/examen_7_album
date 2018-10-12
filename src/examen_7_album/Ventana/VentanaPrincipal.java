/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumno
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    public  JMenuBar barra;
    public JMenu archivo, album;
    public JMenuItem foto, salir, crear, editar;
   public VentanaPrincipal(){
       barra=new JMenuBar();
       archivo=new JMenu("Archivo");
       foto=new JMenuItem("Foto");
       salir=new JMenuItem("Salir");
       crear=new JMenuItem("Crear");
       editar=new JMenuItem("Editar");
       album=new JMenu("Album");
       
       archivo.add(foto);
       archivo.add(album);
       archivo.add(salir);
       album.add(crear);
       album.add(editar);
       
       barra.add(archivo);
       setJMenuBar(barra);
      
       
       
       
       salir.addActionListener(this);
      
       foto.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               VentanaFoto vf=new VentanaFoto(VentanaPrincipal.this);
           }
       });
       crear.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               VentanaAlbum va=new VentanaAlbum(VentanaPrincipal.this);
           }
       });
       
       DefaultTableModel modelo = new DefaultTableModel();
       
       
       modelo.addColumn("Nombre del Album");
       modelo.addColumn("Nombre del Album2");
       modelo.addColumn("Nombre del Album3");
       
       modelo.addRow(new Object []{"Los wachitos",20,"15/03/14"});       
       
       JTable tabla = new JTable();
       
       tabla.setModel(modelo);
       
       add(tabla);
       
       ConfigurarVentana();
   }
  public void ConfigurarVentana(){
      setSize( 500, 300);
      setLocationRelativeTo(this);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(salir == e.getSource()){
            
            System.exit(0);
            
        }
        
    }
    
}

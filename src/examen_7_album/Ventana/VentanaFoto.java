/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author alumno
 */
public class VentanaFoto extends JFrame {
    public JPanel principal;
    public JLabel nArchivo, tamaño, descripcion, persona;
    public JTextField nArchivoText, tamañoText, descripcionText, personaText;
    public JButton addPersona, ok, cancelar;
    public JTable personaJTable;
    DefaultTableModel tablam;
    public VentanaFoto(VentanaPrincipal ventanaPrincipal){
        
        ventanaPrincipal.hide();
       
        principal=new JPanel();
        principal.setLayout(null);
      
        nArchivo=new JLabel("Nombre");
        nArchivo.setBounds(20, 30, 50, 20);
        nArchivoText=new JTextField(30);
        nArchivoText.setBounds(130, 30, 150, 20);
        
        tamaño=new JLabel("Tamaño");
        tamaño.setBounds(20,60, 50,20);
        tamañoText=new JTextField(30);
        tamañoText.setBounds(130, 60, 150, 20);
        
        descripcion=new JLabel("Descripcion");
        descripcion.setBounds(20, 90, 150, 20);
        descripcionText=new JTextField(30);
        descripcionText.setBounds(130, 90, 150, 20);
        
        persona=new JLabel("Nombre Persona");
        persona.setBounds(20, 120, 50, 20);
        personaText=new JTextField(30);
        personaText.setBounds(130, 120, 150, 20);
        
        addPersona=new JButton("AñadirPersona");
        addPersona.setBounds(300, 120, 150, 20);
       
       //tabla 
        personaJTable=new JTable();
        personaJTable.setBounds(20, 150, 300, 200);
        tablam=new DefaultTableModel();

        tablam.addColumn("Nombre");
        tablam.addColumn("Nombre2");
        tablam.addColumn("Nombre3");
        tablam.addRow(new String[]{"Pepe"});
        tablam.addRow(new String[]{"Juan"});
        
        personaJTable.setModel(tablam);

        
        
        
        ok=new JButton("Ok");
        ok.setBounds(200, 430, 100, 20);
        
        cancelar=new JButton("Cancelar");
        cancelar.setBounds(310, 430, 100, 20);
        
        principal.add(nArchivo);
        principal.add(nArchivoText);
        principal.add(tamaño);
        principal.add(tamañoText);
        principal.add(descripcion);
        principal.add(descripcionText);
        principal.add(persona);
        principal.add(personaText);
        principal.add(addPersona);
        principal.add(ok);
        principal.add(cancelar);
        principal.add(personaJTable);
        add(principal);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent we) {
                super.windowClosed(we); //To change body of generated methods, choose Tools | Templates.
                
                ventanaPrincipal.setVisible(true);
                
            }
            
        });
        
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                
            }
        });
        
        
        
        
             
        
        
        
        
        
        
         ConfigurarVentana();
        
    }
    
    
    public void ConfigurarVentana(){
      setSize( 500, 500);
      setLocationRelativeTo(this);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
    }
    
}

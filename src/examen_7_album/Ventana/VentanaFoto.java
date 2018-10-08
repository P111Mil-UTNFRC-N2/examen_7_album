/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author alumno
 */
public class VentanaFoto extends JFrame {
    public JPanel principal;
    public JLabel nArchivo, tamaño, descripcion, persona;
    public JTextField nArchivoText, tamañoText, descripcionText, personaText;
    public JButton addPersona, ok, cancelar;
    public VentanaFoto(){
       
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
        
        
        principal.add(nArchivo);
        principal.add(nArchivoText);
        principal.add(tamaño);
        principal.add(tamañoText);
        principal.add(descripcion);
        principal.add(descripcionText);
        principal.add(persona);
        principal.add(personaText);
        add(principal);
        
      
        
             
        
        
        
        
        
        
         ConfigurarVentana();
        
    }
    
    /*public void ConfigurarPanel(String etiqueta, int posicion, int altura){
        JLabel etiquetaLabel=new JLabel(etiqueta);
        JTextField etiquetaCampo=new JTextField(10);
        principal=new JPanel();
        principal.setLayout(null);
        principal.add(etiquetaLabel);
        principal.add(etiquetaCampo);
        etiquetaLabel.setBounds(posicion, altura, 50, 20);
        etiquetaCampo.setBounds(posicion+50, altura, 50, 20);
        
    }*/
    public void ConfigurarVentana(){
      setSize( 500, 300);
      setLocationRelativeTo(this);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }
    
}

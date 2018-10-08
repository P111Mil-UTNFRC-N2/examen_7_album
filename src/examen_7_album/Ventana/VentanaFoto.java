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
        ConfigurarVentana();
        principal=new JPanel();
        principal.setLayout(null);
      
        nArchivo=new JLabel("Nombre");
        nArchivo.setBounds(20, 30, 50, 20);
        nArchivoText=new JTextField(30);
        
        
      
        
             
        
        
        
        
        
        
        
        
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

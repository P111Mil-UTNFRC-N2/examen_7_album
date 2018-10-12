/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class VentanaAlbum extends JFrame {
    public JPanel principal;
    public JLabel NombreA, CantMax, FechaCreacion;
    private JTextField textNombreA, textCantMax, textFechaCreacion;
    private JButton ok, addFoto, Cancelar; 
    
    public VentanaAlbum(VentanaPrincipal ventanaPrincipal){
        ventanaPrincipal.hide();
        
        principal=new JPanel();
        add(principal);
        principal.setLayout(null);
        
        NombreA=new JLabel("Nombre:");
        CantMax=new JLabel("Cantidad Maxima Fotos:");
        FechaCreacion=new JLabel("Fecha Creacion Album: ");
        textNombreA=new JTextField(30);
        textFechaCreacion=new JTextField(30);
        textCantMax=new JTextField(10);
        
        NombreA.setBounds(20, 30, 180, 15);
        CantMax.setBounds(20, 50, 180, 15);
        FechaCreacion.setBounds(20, 70, 180, 15);
        textNombreA.setBounds(250, 30, 130, 15);
        textCantMax.setBounds(250, 50, 130, 15);
        textFechaCreacion.setBounds(250, 70, 130, 15);
        
        principal.add(NombreA);
        principal.add(CantMax);
        principal.add(FechaCreacion);
        principal.add(textNombreA);
        principal.add(textCantMax);
        principal.add(textFechaCreacion);
        
        
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent we) {
                super.windowClosed(we); //To change body of generated methods, choose Tools | Templates.
                
                ventanaPrincipal.setVisible(true);
                
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

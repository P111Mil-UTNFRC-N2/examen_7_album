/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author alumno
 */
public class VentanaPrincipal extends JFrame{
    public  JMenuBar barra;
    public JMenu archivo, album;
    public JMenuItem foto, salir, crear, editar;
   public VentanaPrincipal(){
       ConfigurarVentana();
       
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
       
            
   }
  public void ConfigurarVentana(){
      setSize( 500, 300);
      setLocationRelativeTo(this);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
      
  }
    
}

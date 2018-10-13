/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import daos.AlbumDao;
import examen_7_album.Album;
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
public class VentanaPrincipal extends JFrame implements ActionListener {

    public JMenuBar barra;
    public JMenu archivo, album;
    public JMenuItem foto, salir, crear, editar;
    private javax.swing.JScrollPane jScrollPane1;
    
    AlbumDao albumDao;

    public VentanaPrincipal() {
        barra = new JMenuBar();
        archivo = new JMenu("Archivo");
        foto = new JMenuItem("Foto");
        salir = new JMenuItem("Salir");
        crear = new JMenuItem("Crear");
        editar = new JMenuItem("Editar");
        album = new JMenu("Album");

        jScrollPane1 = new javax.swing.JScrollPane();

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
                VentanaFoto vf = new VentanaFoto(VentanaPrincipal.this);
            }
        });
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                VentanaAlbum va = new VentanaAlbum(VentanaPrincipal.this);
            }
        });

        DefaultTableModel modelo = new DefaultTableModel(null,new Object[]{"Nombre del album","Cantidad Maxima de Fotos","Fecha de creacion"});

       /* for (Album album : albumDao.mostrarAlbum()) {
            modelo.addRow(new Object[]{album.getNombre(),album.getCantidadMaxima(),album.getFechaCreacion()});    
        }
        */

        JTable tabla = new JTable();

        tabla.setModel(modelo);
        jScrollPane1.setViewportView(tabla);
        
        add(jScrollPane1);

        ConfigurarVentana();
    }

    public void ConfigurarVentana() {
        setSize(500, 300);
        setLocationRelativeTo(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (salir == e.getSource()) {

            System.exit(0);

        }

    }

}

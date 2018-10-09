/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_album.Ventana;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        addPersona=new JButton("AñadirPersona");
        addPersona.setBounds(300, 120, 150, 20);
       
       //tabla 
        personaJTable=new JTable();
        personaJTable.setBounds(20, 150, 300, 200);
        tablam=new DefaultTableModel();
        tablam.addColumn("Nombre");
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
        
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
             
        
        
        
        
        
        
         ConfigurarVentana();
        
    }
    
    
    public void ConfigurarVentana(){
      setSize( 500, 500);
      setLocationRelativeTo(this);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }
    
}
/*
package examen;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.Vector;
public class TABLA extends javax.swing.JFrame {
double contotal=0;
DefaultTableModel tablam = new DefaultTableModel();
public TABLA() {
initComponents();
tablam.addColumn("Producto");
tablam.addColumn("Precio");
tablam.addColumn("Cantidad");
tablam.addColumn("Total");
jtablecontenido.setModel(tablam);
}
private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {
txtcantidad.setText("");
txtcantidad.requestFocus();
}
private void cmbseleccioneItemStateChanged(java.awt.event.ItemEvent evt) {
int selectedIndex = this.cmbseleccione.getSelectedIndex();
switch (selectedIndex) {
case 1:txtprecio.setText("15");
jlbimagen.setIcon(new ImageIcon("F:/NETBEANS/EXAMEN/imagenes/mouse.jpg"))
;break;
case 2:txtprecio.setText("200");
jlbimagen.setIcon(new ImageIcon("F:/NETBEANS/EXAMEN/imagenes/impresora.jpg"))
;break;
case 3:txtprecio.setText("20");
jlbimagen.setIcon(new ImageIcon("F:/NETBEANS/EXAMEN/imagenes/teclado.jpg"))
;break;
case 4:txtprecio.setText("50");
jlbimagen.setIcon(new ImageIcon("F:/NETBEANS/EXAMEN/imagenes/usb.jpg"))
;break;
case 5:txtprecio.setText("80");
jlbimagen.setIcon(new ImageIcon("F:/NETBEANS/EXAMEN/imagenes/camara.jpg"))
;break;
case 6:txtprecio.setText("450");
jlbimagen.setIcon(new ImageIcon("F:/NETBEANS/EXAMEN/imagenes/monitor.jpg"))
;break;
}
}
private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {
double precio = Integer.parseInt(txtprecio.getText());
int cantidad = Integer.parseInt(txtcantidad.getText());
double total; double desc;double prec;
if (check.isSelected())
{prec = precio * cantidad;
desc = prec * 0.15;
total = prec - desc;}
else
{total = precio * cantidad;}
contotal = contotal + total;
this.txttotales.setText(contotal +"");
Vector datos = new Vector();
datos.addElement(this.cmbseleccione.getSelectedItem());
datos.addElement(txtprecio.getText());
datos.addElement(txtcantidad.getText());
datos.addElement(total +"");
tablam.addRow(datos);
jtablecontenido.setModel(tablam);
txtcontador.setText(tablam.getRowCount()+"");
}
private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {
int indice = jtablecontenido.getSelectedRow();
tablam.removeRow(indice);
jtablecontenido.setModel(tablam);
}
private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {
if (javax.swing.JOptionPane.showConfirmDialog
(this,"Esta seguro","Aviso",javax.swing.JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
System.exit(0);
}
}
}
*/
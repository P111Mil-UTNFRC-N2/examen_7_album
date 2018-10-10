package examen_7_album;

import java.util.*;

/**
 *
 * @author AsusX541U
 */
public class Album {

    private String nombre;
    private int cantidadMaxima;
    private Date fechaCreacion;
    private ArrayList<Foto> fotos;

    public Album(int cantidadMaxima, String nombre) {

        this.cantidadMaxima = cantidadMaxima;
        this.nombre = nombre;
        this.fotos = new ArrayList<Foto>();
    }

    public void addFoto(Foto f) throws AlbumCompletoException {

        if (fotos.size() >= getCantidadMaxima()) {

            throw new AlbumCompletoException();
            
        } else {
                    
                    this.fotos.add(f);
                    setFotos(fotos);
                    
                    
        }

    }
    
    public static class AlbumCompletoException extends Exception{
    
        public AlbumCompletoException() {
        }

        private AlbumCompletoException(String album_completo_no_se_pueden_agregar_mas_) {
            throw new UnsupportedOperationException("¡ NO SE PUEDEN AGREGAR MAS FOTOS !"); //To change body of generated methods, choose Tools | Templates.
        }
    
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Foto getFoto(int posicion) {
        for (int i = 0; i < fotos.size(); i++) {
            if (i == posicion)
                return fotos.get(i);
        }        
        return null;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }

}

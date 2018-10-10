package daos;

import conexion.Conexion;
import examen_7_album.Foto;
import examen_7_album.Album;
import java.sql.*;
import java.util.*;


public class FotosDao {

    public FotosDao() {
    }

    public List<Foto> seleccionarFotos(int idAlbum) throws SQLException {

        ArrayList<Foto> lasFotos = new ArrayList<>();

        Conexion conex = Conexion.getInstance();
        ResultSet fotosBd = conex.consultarSQL("Select F.* from F.Foto where F.idalbum = " + idAlbum);
        while(fotosBd.next()){
            
            
            
            
            
        
        }
        return lasFotos;

    }

    public void agregarFoto() {

    }
}
//ResultSet rs = Conexion.
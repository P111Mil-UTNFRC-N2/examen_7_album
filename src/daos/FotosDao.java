package daos;

import examen_7_album.Foto;
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
        while (fotosBd.next()) {
            Foto f = new Foto();
            f.setTamaño(fotosBd.getInt("idFoto"));
            f.setDescripción(fotosBd.getString("descripcion"));
            f.setNombreArchivo(fotosBd.getString("nombrearchivo"));

            lasFotos.add(f);

        }
        return lasFotos;

    }

    public void agregarFoto(int idAlbum, Foto foto) {

        String sql = "insert into foto "
                + "(idalbum,     descripcion, nombrearchivo, tamaño) values "
                + "(" + idAlbum + ", '" + foto.getDescripción() + "', '" + foto.getNombreArchivo() + "', " + foto.getTamaño() + ")";
        conexion.Conexion.getInstance().ejecutarSQL(sql);
    }
}
//ResultSet rs = Conexion.

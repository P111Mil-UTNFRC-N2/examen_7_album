package daos;

import examen_7_album.Foto;
import conexion.Conexion;
import examen_7_album.Foto;
import examen_7_album.Album;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FotosDao {

    private static FotosDao instance;
    public FotosDao()
    {
        
    }
    public static FotosDao getInstance()
    {
        if(instance == null)
        {
            instance = new FotosDao();
        }
        return instance;
    }
    
    public List<Foto> seleccionarFotos(int idAlbum) throws SQLException {

        ArrayList<Foto> lasFotos = new ArrayList<>();

        Conexion conex = Conexion.getInstance();
        ResultSet fotosBd = conex.consultarSQL("Select F.* from F.Foto where F.idalbum = " + idAlbum);
        while (fotosBd.next()) {
            Foto f = new Foto();
            f.setCantPerFoto(fotosBd.getInt("idFoto"));
            f.setDescripción(fotosBd.getString("descripcion"));
            f.setNombreArchivo(fotosBd.getString("nombrearchivo"));

            lasFotos.add(f);

        }
        return lasFotos;

    }

    public List<Album> mostrarAlbum() {
                    
        List<Album> album = new ArrayList();

        try {
            
            ResultSet rs = Conexion.getInstance().consultarSQL("select * from computadora ");
            
            while(rs.next()){
                
                Album alb = new Album (rs.getInt(1),rs.getString("nombre"),rs.getInt(3),rs.getInt(4));
                
                album.add(alb);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoAlbum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return album;        
    }
}
//ResultSet rs = Conexion.

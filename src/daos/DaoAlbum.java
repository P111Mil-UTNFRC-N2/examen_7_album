
package daos;
import java.sql.*;
import conexion.Conexion;
import examen_7_album.Album;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DaoAlbum 
{
    private static  DaoAlbum instance;
    
    public static DaoAlbum getInstance()
    {
        if(instance == null)
        {
            instance = new DaoAlbum();
        }
        return instance;
    }
    private DaoAlbum()
    {
        Conexion con = Conexion.getInstance();
        
    }
    public void agregarAlbum(int idalbum,String nombre, int cantmax, int fechacreacion)
    {
        String sql;
        sql = "insert into album values("+idalbum+",'"+nombre+"',"+cantmax+", "+fechacreacion+");";
        Conexion.getInstance().ejecutarSQL(sql);
    }

    //public void agregarFoto(int idfoto, int idalbum, String descripcion, String nombrearchivo, int tamaño)
    //{
    //    String sql;
    //    sql = "insert into foto values("+ idfoto +", "+idalbum +", '"+descripcion+"', '"+nombrearchivo+"', "+tamaño+");";
    //    Conexion.getInstance().ejecutarSQL(sql);
    //} 
    public List<Album> mostrarAlbum() {
                    
        List<Album> album = new ArrayList();

        try {
            
            ResultSet rs = Conexion.getInstance().consultarSQL("select * from album ");
            
            while(rs.next()){
                
                Album alb = new Album (rs.getInt(1),rs.getString("nombre"));
                
                album.add(alb);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoAlbum.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return album;        
    }


   

}


package daos;
import java.sql.*;
import conexion.Conexion;



public class DaoAlbum 
{
    private  DaoAlbum instance;
    
    public DaoAlbum getInstance()
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
    
}

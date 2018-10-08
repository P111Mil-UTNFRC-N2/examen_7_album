
package conexion;
import java.sql.*;

public class AlbumBll
{
    private AlbumBll instance;
    
    public AlbumBll getInstance()
    {
        if(instance == null)
        {
            instance = new AlbumBll();
        }
        return instance;
    }
    private AlbumBll()
    {
  
    }
    
}


package daos;

import examen_7_album.Foto;


public class FotosDao {
    
    public FotosDao(){
    }

void seleccionarFotos(){
    
    



}   

    
    public void agregarFoto(int idAlbum, Foto foto){
        
        String sql= "insert into foto "
                + "(idalbum,     descripcion, nombrearchivo, tamaño) values "
                + "("+idAlbum+", '"+foto.getDescripción()+"', '"+foto.getNombreArchivo()+"', "+foto.getTamaño()+")";
        conexion.Conexion.getInstance().ejecutarSQL(sql);
    }
}

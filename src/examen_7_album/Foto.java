
package examen_7_album;

public class Foto
{
    private String[] personasEnFoto;
    private String nombreArchivo;
    private int CantPerFoto;
    private String descripción;

    public void setPersonasEnFoto(String[] personasEnFoto) {
        this.personasEnFoto = personasEnFoto;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setCantPerFoto(int CantPerFoto) {
        this.CantPerFoto = CantPerFoto;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Foto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getDescripción() {
        return descripción;
    }

    public Foto(String nombreArchivo, int CantPerFoto, String descripcion)
    {
        personasEnFoto = new String[CantPerFoto];
        this.nombreArchivo = nombreArchivo;
        this.descripción = descripción;
    }
    public void Foto(String nomArchivo)
    {
        this.nombreArchivo=nomArchivo;
    }
   
    public String getPersonaEnFoto(int pos)
    {
        return personasEnFoto[pos];
    }
    public void setPersonaEnFoto(int pos, String persona)
    {
        personasEnFoto[pos] =  persona;
    }
    public int getCantPerFoto()
    {
        return CantPerFoto;
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

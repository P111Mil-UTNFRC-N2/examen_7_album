
package examen_7_album;

public class Foto
{
    private String[] personasEnFoto;
    private String nombreArchivo;
    private int tamaño;
    private String descripción;

    public Foto(String nombreArchivo, int tamaño, String descripción)
    {
        personasEnFoto = new String[tamaño];
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
    public int getTamaño()
    {
        return tamaño;
    }
    
    
    
}

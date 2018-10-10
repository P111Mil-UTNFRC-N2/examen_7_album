
package examen_7_album;

public class Foto
{
    private String[] personasEnFoto;
    private String nombreArchivo;
    private int tamaño;
    private String descripción;

    public void setPersonasEnFoto(String[] personasEnFoto) {
        this.personasEnFoto = personasEnFoto;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
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

    public Foto(String nombreArchivo, int tamaño, String descripcion)
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

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

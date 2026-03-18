package grupo28_proyecto;

/**
 * Representa un recinto dentro del zoológico.
 * Cada recinto tiene un identificador, un nombre y una posición.
 * 
 * @author Wilton Rivera
 */
public class Recinto {

    private int idRecinto;
    private String nombreRecinto;
    private String posicionRecinto;

    public Recinto(int idRecinto, String nombreRecinto, String posicionRecinto) {
        this.idRecinto = idRecinto;
        this.nombreRecinto = nombreRecinto;
        this.posicionRecinto = posicionRecinto;
    }

    public int getIdRecinto() {
        return idRecinto;
    }

    public void setIdRecinto(int idRecinto) {
        this.idRecinto = idRecinto;
    }

    public String getNombreRecinto() {
        return nombreRecinto;
    }

    public void setNombreRecinto(String nombreRecinto) {
        this.nombreRecinto = nombreRecinto;
    }

    public String getPosicionRecinto() {
        return posicionRecinto;
    }

    public void setPosicionRecinto(String posicionRecinto) {
        this.posicionRecinto = posicionRecinto;
    }

    public String mostrarInfo() {
        return "ID Recinto: " + idRecinto
                + "\nNombre del recinto: " + nombreRecinto
                + "\nPosición: " + posicionRecinto;
    }
}

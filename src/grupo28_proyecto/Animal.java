package grupo28_proyecto;

import javax.swing.JOptionPane;

/**
 * Representa un animal registrado en el zoológico.
 * Guarda sus datos básicos y el recinto al que pertenece.
 * 
 * @author THOTH BRENES MURILLO
 */
public class Animal {
    
    private int idAnimal;
    private short edad;
    private String especie;
    private String nombreAnimal;
    private double peso;
    private int idRecinto;

    /**
     * Inicializa un animal con sus datos principales.
     * Si no tiene recinto asignado, se guarda con -1.
     */
    public Animal(int idAnimal, String nombreAnimal, String especie, short edad, double peso) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.idRecinto = -1;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdRecinto() {
        return idRecinto;
    }

    public void setIdRecinto(int idRecinto) {
        this.idRecinto = idRecinto;
    }

    /**
     * Devuelve el nombre del animal.
     * Se agrega para compatibilidad con otras clases del proyecto.
     */
    public String getNombre() {
        return nombreAnimal;
    }

    /**
     * Actualiza la ubicación del animal usando el id del recinto.
     * Si no tiene ubicación, se guarda como -1.
     */
    public void setUbicacionActual(String ubicacionActual) {
        if (ubicacionActual == null || ubicacionActual.equalsIgnoreCase("Sin ubicación")) {
            this.idRecinto = -1;
            return;
        }

        try {
            this.idRecinto = Integer.parseInt(ubicacionActual);
        } catch (NumberFormatException e) {
            this.idRecinto = -1;
        }
    }

    /**
     * Devuelve la información completa del animal en formato texto.
     */
    public String mostrarInfo() {
        return "ID: " + idAnimal
                + "\nNombre: " + nombreAnimal
                + "\nEspecie: " + especie
                + "\nEdad: " + edad
                + "\nPeso: " + peso
                + "\nRecinto: " + idRecinto
                + "\n-----------------------";
    }

    /**
     * Muestra la información del animal en una ventana.
     */
    public void mostrarInfoVentana() {
        JOptionPane.showMessageDialog(null, mostrarInfo());
    }
}

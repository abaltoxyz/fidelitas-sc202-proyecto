/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo28_proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author THOTH BRENES MURILLO
 */
    public class Animal {
    int idAnimal;
    short edad;
    String especie;
    String nombreAnimal;
    double peso;
    int idRecinto;
    
    
    public Animal(int idAnimal, String nombreAnimal, String especie, short edad, double peso) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.edad = edad;  
        this.peso = peso; 
        this.idRecinto = -1; // -1 Cuando no se le ha asignado ningún recinto
    }
    
    
    
    //Se mostrara la info del animal como también donde esta:
    public void mostrarInfo() {
        String infoAnimal = "ID: " + idAnimal + "\n" // armar String con la info
                + "Nombre: " + nombreAnimal + "\n"
                + "Especie: " + especie + "\n"
                + "Edad: " + edad + "\n"
                + "Peso: " + peso + "\n"
                + "Recinto: " + idRecinto + "\n"
                + "-----------------------";

    JOptionPane.showMessageDialog(null, infoAnimal);
    }
}

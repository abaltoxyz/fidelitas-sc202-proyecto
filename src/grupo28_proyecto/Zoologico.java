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
public class Zoologico {
    int idZoologico;
    String nombreZoologico;
    String localidadZoologico;
    int capacidad;
    static Animal[] listaAnimales = new Animal[45];  //Cantidad maxima del Zoologico será de 45 animales.
    static int cantidad = 0;
    static int contadorId = 1;

        // Agregar Animal
        public static void agregarAnimal(String nombre, String especie, short edad, double peso) {

        if (cantidad < listaAnimales.length) {

            Animal nuevo = new Animal(contadorId, nombre, especie, edad, peso);
            listaAnimales[cantidad] = nuevo;

            cantidad++;
            contadorId++;

            JOptionPane.showMessageDialog(null, "Animal agregado correctamente."); // mostrar mensaje de confirmación.

        } else {
            JOptionPane.showMessageDialog(null, "No hay espacio."); // mostrar mensaje de error.
        }
    }
        
        // Eliminar Animal
        public static void eliminarAnimal(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (listaAnimales[i].idAnimal == id) {

                for (int j = i; j < cantidad - 1; j++) {
                    listaAnimales[j] = listaAnimales[j + 1];
                }

                cantidad--;

                JOptionPane.showMessageDialog(null, "Animal eliminado."); // Mostrar confirmación.
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
        
        // Asignar un animal al recinto
        public static void asignarAnimal(int idAnimal, int idRecinto) {

        Animal a = buscarAnimal(idAnimal);

        if (a != null) {
            a.idRecinto = idRecinto;
            JOptionPane.showMessageDialog(null, "Asignado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
            System.out.println();
        }
    }

        // Mover animal
        public static void moverAnimal(int idAnimal, int nuevoRecinto) {

        Animal a = buscarAnimal(idAnimal);

        if (a != null) {

            JOptionPane.showMessageDialog(null, "Antes estaba en: " + a.idRecinto);

            a.idRecinto = nuevoRecinto;
            
            JOptionPane.showMessageDialog(null, "Movimiento exitoso.");

        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
    }
        // Buscar Animal
        public static Animal buscarAnimal(int id) {

        for (int i = 0; i < cantidad; i++) {

            if (listaAnimales[i].idAnimal == id) {
                return listaAnimales[i];
            }
        }

        return null;
    }
        // Reporte de los animales
        public static void reporteAnimales() {

        JOptionPane.showMessageDialog(null, "----- REPORTE -----");

        for (int i = 0; i < cantidad; i++) {
            listaAnimales[i].mostrarInfo();
        }
    }
}

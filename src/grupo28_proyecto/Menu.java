/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo28_proyecto;

/**
 *
 * Menú principal de interacción con el usuario.
 */
public class Menu {
    public static void desplegarMenu(){
        // Desplegar el menú de opciones. Ejemplo:
        /* MENU PRINCIPAL
        1. Agregar animal
        2. Eliminar animal
        3. Asignar animal
        4. Mover animal
        5. Buscar animal
        6. Crear reporte
        0. Salir
        */
    }
    
    public static void opcionAgregarAnimal() {
        // Método para mostrar opción de agregar animales
        Zoologico.agregarAnimal();
    }
    public static void opcionEliminarAnimal() {
        // Método para mostrar opción de eliminar animales
        Zoologico.eliminarAnimal();
    }
    public static void opcionAsignarAnimal() {
        // Método para mostrar opción de asignar animales a los recintos
        Zoologico.asignarAnimal();
    }
    public static void opcionMoverAnimal() {
        // Método para mostrar opción de mover animales
        Zoologico.moverAnimal();
    }
    public static void opcionBuscarAnimal() {
        // Método para mostrar opción de buscar animales
        Zoologico.buscarAnimal();
    }
    public static void opcionReporte() {
        // Método para mostrar opción de generar reporte
        Zoologico.reporteAnimales();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo28_proyecto;

import javax.swing.JOptionPane;

/**
 *
 * Menú principal de interacción con el usuario.
 */
public class Menu {
    
    /**
    * "Desplegar Menú": Método para mostrar el menú de interacción principal.
    */
    public static void desplegarMenu(){
        int selection; // la opción que digita el usuario.
        do {
            selection = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "¡Bienvenido al sistema de gestión de zoológicos! Seleccione una opción:"
            + "\n1. Agregar animal"
            + "\n2. Eliminar animal"
            + "\n3. Asignar animal"
            + "\n4. Mover animal"
            + "\n5. Buscar animal"
            + "\n6. Crear reporte"
            + "\n0. Cerrar sesión"));
        
            switch (selection){
                case 1:
                    // PENDIENTE DE HACER // Zoologico.agregarAnimal();
                    JOptionPane.showMessageDialog(null, "Pendiente lógica para agregar animal");
                    break;
                case 2:
                    // PENDIENTE DE HACER //Zoologico.eliminarAnimal();
                    JOptionPane.showMessageDialog(null, "Pendiente lógica para eliminar animal");
                    break;
                case 3:
                    // PENDIENTE DE HACER //Zoologico.asignarAnimal();
                    JOptionPane.showMessageDialog(null, "Pendiente lógica para asignar animal");
                    break;
                case 4:
                    // PENDIENTE DE HACER //Zoologico.moverAnimal();
                    JOptionPane.showMessageDialog(null, "Pendiente lógica para mover animal");
                    break;
                case 5:
                    // PENDIENTE DE HACER //Zoologico.buscarAnimal();
                    JOptionPane.showMessageDialog(null, "Pendiente lógica para buscar animal");
                    break;
                case 6:
                    Zoologico.reporteAnimales();
                    break;
                case 0: // salir del programa.
                    Usuario.cerrarSesion();
                    break;
                default: // mostrar error si input no es adecuado.
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, intente nuevamente.");
            }
        } while (selection !=0); // mostrar siempre el menú, excepto si usuario decide salir del programa.
    }
 }

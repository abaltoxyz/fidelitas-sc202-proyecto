package grupo28_proyecto;

import javax.swing.JOptionPane;

/**
 * Menú principal de interacción con el usuario.
 */
public class Menu {

    /**
     * Muestra el menú principal y ejecuta las operaciones sobre el zoológico.
     */
    public static void desplegarMenu(Zoologico zoologico) {
        int selection = -1;

        do {
            try {
                selection = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "¡Bienvenido al sistema de gestión de zoológicos! Seleccione una opción:"
                        + "\n1. Agregar animal"
                        + "\n2. Eliminar animal"
                        + "\n3. Asignar animal a recinto"
                        + "\n4. Mover animal"
                        + "\n5. Buscar animal"
                        + "\n6. Crear reporte"
                        + "\n0. Cerrar sesión"
                ));

                switch (selection) {
                    case 1:
                        agregarAnimalMenu(zoologico);
                        break;

                    case 2:
                        eliminarAnimalMenu(zoologico);
                        break;

                    case 3:
                        asignarAnimalMenu(zoologico);
                        break;

                    case 4:
                        moverAnimalMenu(zoologico);
                        break;

                    case 5:
                        buscarAnimalMenu(zoologico);
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, zoologico.reporteAnimales());
                        break;

                    case 0:
                        Usuario.cerrarSesion();
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, intente nuevamente.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico válido.");
            }

        } while (selection != 0);
    }

    /**
     * Solicita los datos del animal y lo registra en el zoológico.
     */
    private static void agregarAnimalMenu(Zoologico zoologico) {
        try {
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del animal:"));
            String nombreAnimal = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
            String especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
            short edad = Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del animal:"));

            Animal animal = new Animal(idAnimal, nombreAnimal, especie, edad, peso);
            JOptionPane.showMessageDialog(null, zoologico.agregarAnimal(animal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos numéricos inválidos.");
        }
    }

    /**
     * Solicita el ID del animal a eliminar.
     */
    private static void eliminarAnimalMenu(Zoologico zoologico) {
        try {
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del animal a eliminar:"));
            JOptionPane.showMessageDialog(null, zoologico.eliminarAnimal(idAnimal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID válido.");
        }
    }

    /**
     * Solicita el ID del animal y el ID del recinto para asignarlo.
     */
    private static void asignarAnimalMenu(Zoologico zoologico) {
        try {
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del animal:"));
            int idRecinto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del recinto:"));

            JOptionPane.showMessageDialog(null, zoologico.asignarAnimal(idAnimal, idRecinto));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos.");
        }
    }

    /**
     * Solicita el ID del animal y el nuevo recinto al que será movido.
     */
    private static void moverAnimalMenu(Zoologico zoologico) {
        try {
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del animal:"));
            int nuevoIdRecinto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID del recinto:"));

            JOptionPane.showMessageDialog(null, zoologico.moverAnimal(idAnimal, nuevoIdRecinto));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos.");
        }
    }

    /**
     * Solicita el ID del animal y muestra su información.
     */
    private static void buscarAnimalMenu(Zoologico zoologico) {
        try {
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del animal a buscar:"));
            JOptionPane.showMessageDialog(null, zoologico.buscarAnimal(idAnimal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID válido.");
        }
    }
}

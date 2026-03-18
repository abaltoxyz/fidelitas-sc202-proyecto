package grupo28_proyecto;

/**
 * Clase principal del programa.
 * Controla el flujo de inicio del sistema.
 */
public class Main {

    public static void main(String[] args) {

        // Crear una instancia del zoológico (puedes cambiar los valores si quieres)
        Zoologico zoologico = new Zoologico(
                1,
                "Zoológico Nacional",
                "Costa Rica",
                50 // capacidad máxima
        );

        // Simulación: agregar algunos recintos de prueba
        zoologico.agregarRecinto(new Recinto(1, "Recinto A", "Zona Norte"));
        zoologico.agregarRecinto(new Recinto(2, "Recinto B", "Zona Sur"));
        zoologico.agregarRecinto(new Recinto(3, "Recinto C", "Zona Este"));

        // Validar login
        if (Usuario.iniciarSesion()) {
            // Mostrar menú con el zoológico ya creado
            Menu.desplegarMenu(zoologico);
        }
    }
}

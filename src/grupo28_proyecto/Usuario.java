package grupo28_proyecto;

import javax.swing.JOptionPane;

/**
 * Representa los usuarios autorizados a utilizar el sistema.
 */
public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private boolean sesionActiva;

    /**
     * Constructor
     */
    public Usuario(int idUsuario, String nombreUsuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.sesionActiva = false;
    }

    /**
     * Método para validar credenciales e iniciar sesión.
     * Permite máximo 3 intentos.
     */
    public static boolean iniciarSesion() {

        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        int intentos = 3;
        boolean acceso = false;

        while (intentos > 0 && !acceso) {
            String usuarioIngresado = JOptionPane.showInputDialog(
                    "Usuario (prueba: admin):");

            String contrasenaIngresada = JOptionPane.showInputDialog(
                    "Contraseña (prueba: 1234):");

            if (usuarioIngresado == null || contrasenaIngresada == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return false;
            }

            if (usuarioIngresado.equals(usuarioCorrecto)
                    && contrasenaIngresada.equals(contrasenaCorrecta)) {

                acceso = true;
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuarioCorrecto);

            } else {
                intentos--;
                JOptionPane.showMessageDialog(null,
                        "Credenciales incorrectas. Intentos restantes: " + intentos);
            }
        }

        if (!acceso) {
            JOptionPane.showMessageDialog(null,
                    "Ha excedido el número de intentos.");
        }

        return acceso;
    }

    /**
     * Método para cerrar sesión.
     */
    public static void cerrarSesion() {

        int opcion;

        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Cerrando sesión...\n"
                    + "1. Volver a iniciar sesión\n"
                    + "0. Salir"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            return;
        }

        switch (opcion) {
            case 1:
                if (iniciarSesion()) {
                    // IMPORTANTE: aquí ya no llamamos al menú directamente
                    JOptionPane.showMessageDialog(null,
                            "Debe reiniciar el programa para continuar.");
                }
                break;

            case 0:
                JOptionPane.showMessageDialog(null,
                        "Gracias por usar el sistema.");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta.");
        }
    }

    /**
     * Método opcional para crear un zoológico (no se usa actualmente).
     */
    public static void crearZoologico() {
        System.out.println("Creando Zoológico...");
    }
}

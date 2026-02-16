/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo28_proyecto;

/**
 *
 * Un objeto Usuario que representa los diferentes usuarios autorizados a utilizar el sistema.
 */
public class Usuario {
    int idUsuario; // Identificador único del usuario.
    String nombreUsuario;
    String contrasena;
    boolean sesionActiva; // Se asigna True si las credenciales son correctas, y se procede con el resto del programa.
    
    public static void iniciarSesion() {
        // Método para comprobar credenciales e iniciar sesión
    }
    public static void cerrarSesion() {
        // Método para cerrar sesión
    }
    public static void crearZoologico() {
        // Método para crear/registrar un zoológico si este todavía no existe
    }
}

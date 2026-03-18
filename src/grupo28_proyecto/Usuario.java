/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo28_proyecto;
import javax.swing.JOptionPane;

/**
 *
 * Un objeto Usuario que representa los diferentes usuarios autorizados a utilizar el sistema.
 */
public class Usuario {
    int idUsuario; // Identificador único del usuario.
    String nombreUsuario;
    String contrasena;
    boolean sesionActiva; // Se asigna True si las credenciales son correctas, y se procede con el resto del programa.
    
    /**
    * Método para validar credenciales e iniciar sesión en el sistema. Se validan tres intentos como máximo, en caso contrario muestra error y sale del programa.
    * Usuario para prueba: "admin"
    * Contraseña: "1234"
    */
    public static boolean iniciarSesion() {
        // credenciales de prueba.
        String usuario = "admin"; 
        String contrasena = "1234";
        byte intentos = 3; // 3 intentos para ingresar.
        boolean acceso = false; // bandera para validar acceso.
        
        while (intentos > 0 && !acceso){ // si existen intentos disponibles y no hay acceso aún...
            // solicitar credenciales
            String usuarioIngresado = JOptionPane.showInputDialog(null, "Por favor escriba su usuario: (Para pruebas escriba 'admin')");
            String contrasenaIngresada = JOptionPane.showInputDialog(null, "Escriba su contraseña: (Para pruebas escriba '1234')");
            if (usuarioIngresado.equals(usuario) && contrasenaIngresada.equals(contrasena)){ // si input es correcto, dar acceso.
                acceso = true; // cambia bandera.
                JOptionPane.showMessageDialog(null, "Hola, " + usuario + ". Bienvenido/a al sistema."); // mostrar confirmación.
            }
            else {
                intentos--; // restar un intento
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecto(s): Queda(n) " + intentos + " intentos."); // mostrar error.
            }
        }
        if (intentos == 0) // se acabaron los intentos, mostrar error.
            JOptionPane.showMessageDialog(null, "Ha excedido el número de intentos permitidos. Saliendo del programa.");
        return acceso; // devolver boolean que define acceso al sistema.
    }
    
    /**
    * Método para cerrar sesión, ofrece la opción de volver a ingresar o bien salir del programa.
    */
    public static void cerrarSesion() {
        byte inputUsuario = Byte.parseByte(JOptionPane.showInputDialog(null, "Cerrando sesión... \n\nSeleccione una opción:"
                + "\n1. Volver a iniciar sesión"
                + "\n0. Salir del programa"));
        switch (inputUsuario){
                case 1: 
                    if(iniciarSesion()) // volver a iniciar sesión pero mostrar menú solo si procede.
                        Menu.desplegarMenu();
                    break;
                case 0: // salir del programa.
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default: // mostrar error en otros casos.
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, intente nuevamente.");
        }
    }
    public static void crearZoologico() {
        // Método para crear/registrar un zoológico si este todavía no existe
        System.out.println("Creando Zoo");
    }
}

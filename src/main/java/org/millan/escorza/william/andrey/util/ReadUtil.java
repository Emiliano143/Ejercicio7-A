package org.millan.escorza.william.andrey.util;

import java.util.Scanner;

// La clase ReadUtil es una utilidad para leer datos desde la entrada estandar
// Aplica el patrón de diseño **Singleton** para garantizar que solo exista una instancia de esta clase.
public class ReadUtil {
    private Scanner scanner; // Scanner para leer la entrada del usuario.
    private static ReadUtil readUtil; // Instancia única de la clase (Singleton).

    // Constructor privado para evitar la creación de instancias externas.
    private ReadUtil() {
        scanner = new Scanner(System.in); // Inicializa el Scanner.
    }

    // Método estático para obtener la única instancia de ReadUtil (Singleton).
    public static ReadUtil getInstance() {
        if (readUtil == null) {
            readUtil = new ReadUtil(); // Crea la instancia si no existe.
        }
        return readUtil; // Devuelve la instancia única.
    }

    // Método para leer una cadena de texto desde la entrada del usuario.
    public String leer() {
        return scanner.next();
    }

    // Método para leer un número entero desde la entrada del usuario.
    // Si el usuario ingresa un valor no válido, se le da hasta 10 intentos.
    public Integer leerInt() {
        int intentos = 0;
        while (intentos < 10) {
            try {
                return Integer.valueOf(leer()); // Intenta convertir la entrada a entero.
            } catch (NumberFormatException e) {
                System.out.println("No es un entero. Intenta de nuevo.");
                intentos++;
            }
        }
        System.out.println("Demasiados intentos fallidos. Saliendo...");
        return null; // Devuelve null si se superan los intentos.
    }

    // Método estático para convertir una cadena a un número entero.
    // Si la cadena no es un número válido, muestra un mensaje de error y devuelve null.
    public static Integer string2Integer(String cadena) {
        try {
            return Integer.valueOf(cadena); // Intenta convertir la cadena a entero.
        } catch (NumberFormatException e) {
            System.out.println("No es un entero.");
            return null; // Devuelve null si la conversión falla.
        }
    }
}
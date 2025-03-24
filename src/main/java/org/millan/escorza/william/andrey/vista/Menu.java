package org.millan.escorza.william.andrey.vista;

import org.millan.escorza.william.andrey.model.figura.Figura;

// La clase Menu proporciona métodos estáticos para mostrar mensajes en la consola.
// Esta clase sigue el principio de **responsabilidad única**, ya que solo se encarga de la interacción con el usuario.
public class Menu {

    // Muestra el menú principal con las opciones disponibles para seleccionar figuras.
    public static void principal() {
        System.out.println("welcome");
        System.out.println("Selecciona una opción");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectángulo");
        System.out.println("3.- Decágono");
        System.out.println("4.- Círculo");
        System.out.println("5.- Pentágono");
        System.out.println("6.- Equilatero");
        System.out.println("7.- Isoceles");
        System.out.println("8.- Escaleno");
        System.out.println("9.- Salir");
    }

    // Muestra un mensaje de opción inválida cuando el usuario ingresa una opción no válida.
    public static void opcionInvalida() {
        System.out.println("Opción invalida");
    }

    // Muestra el perímetro y el área de una figura.
    public static void print(Figura figura) {
        System.out.println("El perímetro es: " + figura.perimetro());
        System.out.println("El área es: " + figura.area());
    }

    // Muestra el menú principal para seleccionar el modo de ejecución (Consola o Ventana).
    public static void principal2() {
        System.out.println("welcome");
        System.out.println("Selecciona una opción");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Historial");
        System.out.println("3.- Salir");
    }

    // Muestra un mensaje para solicitar el lado de un cuadrado.
    public static void menuCuadrado() {
        System.out.println("Dame un lado");
    }

    // Muestra un mensaje para solicitar el lado y la base de un rectángulo.
    public static void menuRectangulo() {
        System.out.println("Dame el lado");
        System.out.println("Dame la base");
    }

    // Muestra un mensaje para solicitar el lado y el apotema de un decágono.
    public static void menuDecagono() {
        System.out.println("Dame el lado");
        System.out.println("Dame el apotema");
    }

    // Muestra un mensaje para solicitar el radio de un círculo.
    public static void menuCirculo() {
        System.out.println("Dame el radio");
    }

    // Muestra un mensaje para solicitar el lado y el apotema de un pentágono.
    public static void menuPentagono() {
        System.out.println("Dame el lado");
        System.out.println("Dame el apotema");
    }

    // Muestra un mensaje para solicitar la base de una figura.
    public static void menuBase() {
        System.out.println("Dame una base");
    }

    // Muestra un mensaje para solicitar la altura de una figura.
    public static void menuAltura() {
        System.out.println("Dame una altura");
    }

    // Muestra un mensaje para solicitar el lado 1 de una figura.
    public static void menuLado1() {
        System.out.println("Dame un lado 1");
    }

    // Muestra un mensaje para solicitar el lado 2 de una figura.
    public static void menuLado2() {
        System.out.println("Dame un lado 2");
    }

    // Muestra un mensaje para solicitar el lado 3 de una figura.
    public static void menuLado3() {
        System.out.println("Dame un lado 3");
    }
}
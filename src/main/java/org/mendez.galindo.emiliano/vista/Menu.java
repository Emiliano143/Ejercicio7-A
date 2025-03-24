package org.mendez.galindo.emiliano.vista;

import org.mendez.galindo.emiliano.model.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println( "-----FIGURAS-----");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Cuadrado");
        System.out.println( "2.- Equilatero");
        System.out.println( "3.- Isoceles");
        System.out.println( "4.- Escaleno");
        System.out.println( "5.- Rectangulo");
        System.out.println( "6.- Rombo");
        System.out.println( "7.- Trapecio regular");
        System.out.println( "8.- Pentagono");
        System.out.println( "9.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println( "Opción invalida");
    }

    public static void print(Figura figura)
    {
        System.out.println( "El perimetro es:" + figura.perimetro() );
        System.out.println( "El area es:" + figura.area() );
    }

    public static void principal2( )
    {
        System.out.println( "Bienvenido");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Consola");
        System.out.println( "2.- Ventana");
        System.out.println( "3.- Historial");
        System.out.println( "4.- Salir");
    }

    public static void menuLado( )
    {
        System.out.println( "Dame un lado");
    }
    public static void menuBase( )
    {
        System.out.println( "Dame una base");
    }
    public static void menuAltura( )
    {
        System.out.println( "Dame una altura");
    }
    public static void menuLado1( )
    {
        System.out.println( "Dame un lado 1");
    }
    public static void menuLado2( )
    {
        System.out.println( "Dame un lado 2");
    }
    public static void menuLado3( )
    {
        System.out.println( "Dame un lado 3");
    }
    public static void menuBmayor(){
        System.out.println("Ingresa la base mayor");
    }
    public static void menuBmenor(){
        System.out.println("Ingresa la base menor");
    }
    public static void menuDmayor(){
        System.out.println("Ingresa la diagonal mayor");
    }
    public static void menuDmenor(){
        System.out.println("Ingresa la diagonal menor");
    }
    public static void menuApotema(){
        System.out.println("Ingresa el apotema");
    }

}

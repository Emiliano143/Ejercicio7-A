package org.millan.escorza.william.andrey.vista;


import org.gerdoc.historial.Historiales;
import org.millan.escorza.william.andrey.model.figura.Cuadrado;
import org.millan.escorza.william.andrey.model.figura.Decagono;
import org.millan.escorza.william.andrey.model.figura.Equilatero;
import org.millan.escorza.william.andrey.model.figura.Figura;
import org.millan.escorza.william.andrey.model.figura.Rectangulo;
import org.millan.escorza.william.andrey.model.figura.Circulo;
import org.millan.escorza.william.andrey.model.figura.Pentagono;
import org.millan.escorza.william.andrey.model.figura.figura2.Escaleno;
import org.millan.escorza.william.andrey.model.figura.figura2.Isosceles;
import org.millan.escorza.william.andrey.util.ReadUtil;

// La clase Consola implementa la interfaz Ejecutable y permite al usuario interactuar con el programa a través de la consola.
// Aplica el patrón de diseño **Singleton** para garantizar que solo exista una instancia de esta clase.
public class Consola implements Ejecutable
{
    // Atributo estático para implementar el patrón Singleton.
    private static Consola consola;
    private Historiales historiales;

    // Constructor privado para evitar la creación de instancias externas.
    private Consola() {
    }

    // Método estático para obtener la única instancia de Consola (Singleton).
    public static Consola getInstance() {
        if (consola == null) {
            consola = new Consola(); // Creación de la instancia única.
        }
        return consola; // Devuelve la instancia única.
    }

    // Método que ejecuta la lógica del menú de la consola.
    // Permite al usuario seleccionar y crear figuras geométricas, leer datos y mostrarlas.
    @Override
    public void run() {
        boolean flag = true; // Controla la ejecución del bucle.
        int opcion = 0; // Almacena la opción seleccionada por el usuario.
        Figura figura = null; // Variable para almacenar la figura seleccionada.

        while (flag) { // Bucle principal del menú.
            figura = null; // Reinicia la figura en cada iteración.
            Menu.principal(); // Muestra el menú principal.
            opcion = ReadUtil.getInstance().leerInt(); // Lee la opción del usuario.

            // Estructura switch para procesar la opción seleccionada.
            switch (opcion) {
                //Crea la figura seleccionada
                case 1:
                    figura = new Cuadrado();
                    break;
                case 2:
                    figura = new Rectangulo();
                    break;
                case 3:
                    figura = new Decagono();
                    break;
                case 4:
                    figura = new Circulo();
                    break;
                case 5:
                    figura = new Pentagono();
                    break;
                case 6:
                    figura = new Equilatero();
                    break;
                case 7:
                    figura = new Isosceles();
                    break;
                case 8:
                    figura = new Escaleno();
                    break;
                case 9:
                    flag = false; // Permite salir del bucle y finalizar el programa.
                    break;
                default:
                    Menu.opcionInvalida(); // Mensaje para opción inválida.
            }

            // Si se ha seleccionado una figura válida.
            if (figura != null) {
                ((org.gerdoc.vista.SolicitaDatos)figura).leerDatos( );
                Menu.print( figura );

                historiales.addFigura( figura );

            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales)
    {
        this.historiales = historiales;

    }


}

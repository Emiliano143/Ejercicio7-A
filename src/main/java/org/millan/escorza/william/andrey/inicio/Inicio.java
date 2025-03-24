package org.millan.escorza.william.andrey.inicio;
//importa para poder hacer usos de las demas clases

import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.millan.escorza.william.andrey.util.ReadUtil;
import org.millan.escorza.william.andrey.vista.Consola;
import org.millan.escorza.william.andrey.vista.Ejecutable;
import org.millan.escorza.william.andrey.vista.Menu;
import org.millan.escorza.william.andrey.vista.Ventana;

public class Inicio {


    public Inicio() {
        // Constructor por defecto. No realiza ninguna acción específica.
    }

    public static void main(String[] args) {
        boolean flag = true; // Controla el bucle principal del programa.
        int opcion = 0; // Almacena la opción seleccionada por el usuario.
        Ejecutable ejecutable = null; // Es la Referencia para aplicar polimorfismo.
        Historiales historiales = null;
        historiales = Historial.getInstance( );
        while (flag) {
            ejecutable = null; // Reinicia la referencia en cada iteración.
            Menu.principal2(); // Muestra el menú principal en la consola.

            // Obtiene la opción del usuario utilizando la clase ReadUtil (hace uso del encapsulamiento).
            opcion = ReadUtil.getInstance().leerInt();

            // Switch para encontrar la opción seleccionada por el usuario.
            switch (opcion) {
                case 1:
                    // Patrón Singleton: getInstance() asegura una única instancia de Consola.
                    ejecutable = Consola.getInstance();
                    break;
                case 2:
                    // Patrón Singleton: getInstance() asegura una única instancia de Ventana.
                    ejecutable = Ventana.getInstance();
                    break;
                case 3:
                    historiales.imprimir();
                    break;    
                case 4:
                    flag = false; // Sale del bucle y finaliza el programa.
                    break;
                default:
                    // Muestra un mensaje de opción inválida si el usuario ingresa un valor incorrecto .
                    Menu.opcionInvalida();
            }

            // Si se seleccionó una opción válida (1 o 2), ejecuta el método run().
            if (ejecutable != null) {
                // Con ayuda del Polimorfismo: ejecuta el método run() de la implementación concreta de una de las opcciones (Consola o Ventana).
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }
        }
    }
}
/*Conceptos del programa:
---Encapsulamiento:
Definición: Es un principio de la POO que consiste en ocultar los detalles internos de una clase y
exponer solo lo necesario a través de métodos públicos.
---Herencia:
Definición: Es un mecanismo que permite a una clase (subclase) heredar atributos y métodos de otra clase (superclase o interfaz).
---Polimorfismo:
Definición: Es la capacidad de un objeto de tomar muchas formas. En POO, permite que un método se comporte de manera diferente según el objeto que lo invoque.
---Abstracción:
Definición: Es el proceso de ocultar los detalles complejos y mostrar solo la funcionalidad esencial.
---Patrón Singleton:
Definición: Es un patrón de diseño que garantiza que una clase tenga solo una instancia y proporciona un punto de acceso global a esa instancia.
---Patrón Factory Method:
Definición: Es un patrón de diseño que define una interfaz para crear objetos, pero permite a las subclases alterar el tipo de objetos que se crearán.
---Sobrecarga de constructores:
Definición: Es la capacidad de una clase de tener múltiples constructores con diferentes parámetros.
---Reutilización de código:
Definición: Es la práctica de usar código existente en lugar de escribirlo nuevamente.
---Interfaces:
Definición: Es un contrato que define un conjunto de métodos que una clase debe implementar.
---Patrón de diseño Plantilla (Template Method):
Definición: Es un patrón de diseño que define el esqueleto de un algoritmo en una operación, dejando algunos pasos para que las subclases los implementen.
---Patrón de diseño Fachada (Facade):
Definición: Es un patrón de diseño que proporciona una interfaz simplificada para un conjunto de interfaces en un subsistema.
---Principio de responsabilidad única:
Definición: Es un principio de diseño que establece que una clase debe tener una única responsabilidad.
---Métodos estáticos:
Definición: Son métodos que pertenecen a la clase en lugar de a una instancia específica.
---Manejo de excepciones:
Definición: Es un mecanismo para manejar errores o situaciones excepcionales en tiempo de ejecución.
*/
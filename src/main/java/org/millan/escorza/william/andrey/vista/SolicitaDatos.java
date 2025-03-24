package org.millan.escorza.william.andrey.vista;

// La interfaz SolicitaDatos define un contrato para las clases que deben implementar un método `leerDatos()`.
// Este enfoque sigue el principio de **abstracción** y permite el uso de **polimorfismo**.
public interface SolicitaDatos {
    // Método abstracto que debe ser implementado por las clases que implementen esta interfaz.
    // Define la lógica para solicitar y leer los datos necesarios para una figura.
    void leerDatos();
}
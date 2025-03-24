package org.millan.escorza.william.andrey.vista;

import org.millan.escorza.william.andrey.historial.Historiales;

// La interfaz Ejecutable define un contrato para las clases que deben implementar un método `run()`.
// Este enfoque sigue el principio de **abstracción** y permite el uso de **polimorfismo**.
public interface Ejecutable extends org.gerdoc.vista.Ejecutable{
    // Método abstracto que debe ser implementado por las clases que implementen esta interfaz.
    // Define la lógica que se ejecutará cuando se invoque este método.
    void run();
   // void addHistoriales( Historiales historiales );
}

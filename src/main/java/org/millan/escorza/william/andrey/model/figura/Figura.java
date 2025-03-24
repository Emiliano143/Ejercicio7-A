package org.millan.escorza.william.andrey.model.figura;

import org.millan.escorza.william.andrey.vista.SolicitaDatos;

/**
 * Clase abstracta que representa una figura geométrica.
 * Define métodos abstractos para calcular el área y el perímetro,
 * que deben ser implementados por las subclases.
 */
public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos {

    /**
     * Constructor por defecto. No realiza ninguna acción específica.
     */
    public Figura() {
    }

    /**
     * Método abstracto para calcular el área
     * Se deja sin implementación porque cada tipo de figura tiene una forma distinta de calcular su área.
     * @return El área de la figura, calculada en las subclases.
     */
    public abstract double area();

    /**
     * Método abstracto para calcular el  perímetro
     * Similar al área, el cálculo del perímetro depende de la figura específica.
     * El principio de **abstracción** permite que cada subclase implemente este método de acuerdo con su propia lógica.
     * @return El perímetro de la figura, calculado en las subclases.
     */
    public abstract double perimetro();
}
package org.millan.escorza.william.andrey.model.figura;

import org.millan.escorza.william.andrey.vista.SolicitaDatos;
import org.millan.escorza.william.andrey.util.ReadUtil;

public class Cuadrado extends Figura implements SolicitaDatos {
    private int lado; // Atributo para almacenar el lado del cuadrado.

    // Constructor por defecto. No realiza ninguna acción específica.
    public Cuadrado() {}

    // Método setter para asignar un valor al lado del cuadrado.
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        // Calcula el área
        return lado * lado;
    }

    @Override
    public double perimetro() {
        // Calcula el perímetro
        return 4 * lado;
    }

    @Override
    public void leerDatos() {
        // Solicita al usuario el valor del lado y lo asigna al atributo correspondiente.
        System.out.println("Dame un lado:");
        this.lado = ReadUtil.getInstance().leerInt();
    }
}
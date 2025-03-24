package org.millan.escorza.william.andrey.model.figura;

import org.millan.escorza.william.andrey.vista.SolicitaDatos;
import org.millan.escorza.william.andrey.util.ReadUtil;

public class Circulo extends Figura implements SolicitaDatos {
    private int radio; // Atributo para almacenar el radio del círculo.

    // Constructor que inicializa el radio del círculo.
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Constructor por defecto. No realiza ninguna acción específica.
    public Circulo() {
    }

    @Override
    public double area() {
        // Calcula el área
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        // Calcula el perímetro
        return 2 * Math.PI * radio;
    }

    @Override
    public void leerDatos() {
        // Solicita al usuario el valor del radio y lo asigna al atributo correspondiente.
        System.out.println("Dame el radio:");
        this.radio = ReadUtil.getInstance().leerInt();
    }
}

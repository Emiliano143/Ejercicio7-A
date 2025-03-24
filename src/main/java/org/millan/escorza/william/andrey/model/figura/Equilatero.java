package org.millan.escorza.william.andrey.model.figura;

import org.millan.escorza.william.andrey.vista.SolicitaDatos;
import org.millan.escorza.william.andrey.util.ReadUtil;

public class Equilatero extends Figura implements SolicitaDatos {
    private int base; // Atributo para almacenar la base del triángulo equilátero.
    private int altura; // Atributo para almacenar la altura del triángulo equilátero.
    private int lado; // Atributo para almacenar la longitud de los lados del triángulo equilátero.

    // Constructor que inicializa los atributos de la clase.
    public Equilatero(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    // Constructor por defecto. No realiza ninguna acción específica.
    public Equilatero() {
    }

    @Override
    public double area() {
        // Calcula el área
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        // Calcula el perímetro
        return 3 * lado;
    }

    @Override
    public void leerDatos() {
        // Solicita al usuario los valores de la base, altura y lado.
        System.out.println("Dame la base:");
        this.base = ReadUtil.getInstance().leerInt();
        System.out.println("Dame la altura:");
        this.altura = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el lado:");
        this.lado = ReadUtil.getInstance().leerInt();
    }
}
package org.millan.escorza.william.andrey.model.figura.figura2;

import org.millan.escorza.william.andrey.model.figura.Figura;
import org.millan.escorza.william.andrey.vista.SolicitaDatos;
import org.millan.escorza.william.andrey.util.ReadUtil;

public class Isosceles extends Figura implements SolicitaDatos {
    private double base; // Atributo para almacenar la base
    private double altura; // Atributo para almacenar la altura
    protected double lado1; // Atributo protegido para almacenar el primer lado
    protected double lado2; // Atributo protegido para almacenar el segundo lado.

    // Constructor que inicializa los atributos de la clase.
    public Isosceles(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Constructor por defecto. No realiza ninguna acción específica.
    public Isosceles() {
    }

    @Override
    public double area() {
        // Calcula el área del
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        // Calcula el perímetro
        return base + lado1 + lado2;
    }

    @Override
    public void leerDatos() {
        // Solicita al usuario los valores de la base, altura, lado1 y lado2.
        System.out.println("Dame la base:");
        this.base = ReadUtil.getInstance().leerInt();
        System.out.println("Dame la altura:");
        this.altura = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el lado 1:");
        this.lado1 = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el lado 2:");
        this.lado2 = ReadUtil.getInstance().leerInt();
    }
}

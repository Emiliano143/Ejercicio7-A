package org.millan.escorza.william.andrey.model.figura.figura2;

import org.millan.escorza.william.andrey.util.ReadUtil;
import org.millan.escorza.william.andrey.vista.Menu;

public class Escaleno extends Isosceles {
    private double lado3; // Atributo privado de la clase Escaleno.

    public Escaleno() {
        // Constructor por defecto. No realiza ninguna acción específica.
    }

    public Escaleno(double base, double altura, double lado1, double lado2, double lado3) {
        // Llama al constructor de la clase padre (Isosceles) para inicializar los valores heredados.
        super(base, altura, lado1, lado2);
        this.lado3 = lado3; // Asigna el nuevo valor privado de Escaleno.
    }

    // Constructor sobrecargado el cual se encarga de inicalizar un triángulo escaleno con sus tres lados.
    public Escaleno(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado3() {
        return lado3; // Getter, obtener el valor de lado3.
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3; // Setter, asignar un valor a lado3.
    }

    @Override
    public double perimetro() {
        // Realiza las operaciones para obtener el valor de el perimetro.
        return lado1 + lado2 + lado3;
    }

    @Override
    public void leerDatos() {
        // Llama al método leerDatos() de la clase padre (Isosceles) para obtener los datos comunes.
        super.leerDatos();
        // Solicita al usuario el valor del tercer lado (lado3).
        Menu.menuLado3();
        lado3 = ReadUtil.getInstance().leerInt();
    }
}


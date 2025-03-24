package org.millan.escorza.william.andrey.model.figura;

import org.millan.escorza.william.andrey.vista.SolicitaDatos;
import org.millan.escorza.william.andrey.util.ReadUtil;

public class Pentagono extends Figura implements SolicitaDatos {
    private int lado; // Atributo para almacenar la longitud
    private int apotema; // Atributo para almacenar la longitud del apotema

    // Constructor que inicializa los atributos de la clase.
    public Pentagono(int lado, int apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    // Constructor por defecto. No realiza ninguna acción específica.
    public Pentagono() {
    }

    @Override
    public double area() {
        // Calcula el área
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double perimetro() {
        // Calcula el perímetro
        return 5 * lado;
    }

    @Override
    public void leerDatos() {
        // Solicita al usuario los valores del lado y el apotema.
        System.out.println("Dame el lado:");
        this.lado = ReadUtil.getInstance().leerInt();
        System.out.println("Dame el apotema:");
        this.apotema = ReadUtil.getInstance().leerInt();
    }
}

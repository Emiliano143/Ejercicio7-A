package org.millan.escorza.william.andrey.model.figura;

import org.millan.escorza.william.andrey.util.ReadUtil;
import org.millan.escorza.william.andrey.vista.Menu;

// La clase Triangulo es una clase abstracta que representa una figura geométrica de tipo triángulo.
// Aplica los principios de POO como la abstracción, herencia y encapsulamiento.
// También sigue el patrón de diseño **Plantilla (Template Method)**, ya que define un método abstracto
public abstract class Triangulo extends Figura {
    // Atributos protegidos para almacenar la base y la altura del triángulo.
    protected double base;
    protected double altura;

    // Constructor por defecto. No realiza ninguna acción específica.
    public Triangulo() {
    }

    // Constructor sobrecargado que inicializa la base y la altura del triángulo.
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del triángulo
    public double area() {
        return (base * altura) / 2;
    }

    // Método abstracto para calcular el perímetro
    // Las clases concretas que hereden de esta deben implementar su propia versión de este método.
    public abstract double perimetro();

    // Getter para obtener el valor de la base.
    public double getBase() {
        return base;
    }

    // Setter para asignar un valor a la base.
    public void setBase(double base) {
        this.base = base;
    }

    // Getter para obtener el valor de la altura.
    public double getAltura() {
        return altura;
    }

    // Setter para asignar un valor a la altura.
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para leer datos desde la entrada del usuario.
    // Aplica el principio de **responsabilidad única**, ya que solo se encarga de la lectura de datos.
    // También utiliza el patrón de diseño **Fachada (Facade)** al usar `Menu` para mostrar mensajes
    // y `ReadUtil` para manejar la entrada de datos de manera más sencilla.
    @Override
    public void leerDatos() {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt();
    }
}

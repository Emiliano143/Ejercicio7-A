package org.mendez.galindo.emiliano.model.figura;

import org.mendez.galindo.emiliano.util.ReadUtil;
import org.mendez.galindo.emiliano.vista.Menu;

public class Pentagono extends Figura
{
    private double lado, apotema;

    public Pentagono(){}

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return (lado*5*apotema)/2;
    }

    @Override
    public double perimetro() {
        return lado*5;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado();
        lado= ReadUtil.getInstance().leerInt();
        Menu.menuApotema();
        apotema= ReadUtil.getInstance().leerInt();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}

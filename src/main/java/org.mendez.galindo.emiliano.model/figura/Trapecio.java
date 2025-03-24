package org.mendez.galindo.emiliano.model.figura;

import org.mendez.galindo.emiliano.util.ReadUtil;
import org.mendez.galindo.emiliano.vista.Menu;

public class Trapecio extends Figura
{
    private double bmayor, bmenor, altura, lado1;

    public Trapecio(){}

    public Trapecio(double bmayor, double lado1, double altura, double bmenor) {
        this.bmayor = bmayor;
        this.lado1 = lado1;
        this.altura = altura;
        this.bmenor = bmenor;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado1( );
        lado1 = ReadUtil.getInstance().leerInt( );
        Menu.menuBmayor( );
        bmayor = ReadUtil.getInstance().leerInt( );
        Menu.menuBmenor( );
        bmenor = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura( );
        altura = ReadUtil.getInstance().leerInt( );
    }

    @Override
    public double perimetro() {
        return bmayor+bmenor+(2*lado1);
    }

    @Override
    public double area() {
        return ((bmayor+bmenor)*altura)/2;
    }

    public double getBmayor() {
        return bmayor;
    }

    public void setBmayor(double bmayor) {
        this.bmayor = bmayor;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getBmenor() {
        return bmenor;
    }

    public void setBmenor(double bmenor) {
        this.bmenor = bmenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

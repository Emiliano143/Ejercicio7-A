package org.mendez.galindo.emiliano.model.figura;

import org.mendez.galindo.emiliano.util.ReadUtil;
import org.mendez.galindo.emiliano.vista.Menu;

public class Rombo extends Figura
{
    private double lado, dmayor, dmenor;

    public Rombo(){}

    public Rombo(double lado, double dmenor, double dmayor) {
        this.lado = lado;
        this.dmenor = dmenor;
        this.dmayor = dmayor;
    }

    @Override
    public double area() {
        return (dmayor*dmenor)/2;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado();
        lado= ReadUtil.getInstance().leerInt();
        Menu.menuDmayor();
        dmayor= ReadUtil.getInstance().leerInt();
        Menu.menuDmenor();
        dmenor= ReadUtil.getInstance().leerInt();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDmenor() {
        return dmenor;
    }

    public void setDmenor(double dmenor) {
        this.dmenor = dmenor;
    }

    public double getDmayor() {
        return dmayor;
    }

    public void setDmayor(double dmayor) {
        this.dmayor = dmayor;
    }


}

package org.mendez.galindo.emiliano.model.figura;
import org.mendez.galindo.emiliano.util.ReadUtil;
import org.mendez.galindo.emiliano.vista.Menu;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;

    /**
     * Default constructor
     */
    public Triangulo()
    {
    }

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    /**
     * 
     */


    /**
     * @return
     */
    public double area()
    {
        return (base*altura)/2;
    }

    /**
     * @return
     */
    public abstract double perimetro();

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public void leerDatos()
    {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt( );
    }
}
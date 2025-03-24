package org.mendez.galindo.emiliano.model.figura;
import org.mendez.galindo.emiliano.vista.SolicitaDatos;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();
}
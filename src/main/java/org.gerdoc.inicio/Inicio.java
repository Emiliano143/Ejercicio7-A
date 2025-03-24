package org.gerdoc.inicio;

import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Cuadrado;
import org.gerdoc.model.figura.Equilatero;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;
import org.gerdoc.vista.Ventana;

/**
 *
 */
public class Inicio
{

    /**
     * Default constructor
     */
    public Inicio()
    {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        Historiales historiales = null;
        historiales = Historial.getInstance( );
        System.out.println("Hola Emiliano");
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    historiales.imprimir();
                    break;
                case 4://Emiliano consola
                    ejecutable  = org.mendez.galindo.emiliano.vista.Consola.getInstance();
                    break;
                case 5://Ventana Emiliano
                    ejecutable  = org.mendez.galindo.emiliano.vista.Ventana.getInstance();
                    break;
                case 6://Willy consola
                    ejecutable  =  org.millan.escorza.william.andrey.vista.Consola.getInstance();
                    break;
                case 7://Ventana willy
                    ejecutable  =  org.millan.escorza.william.andrey.vista.Ventana.getInstance();
                case 8://Salir
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }
        }



    }

}
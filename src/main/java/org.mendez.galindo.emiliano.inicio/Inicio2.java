package org.mendez.galindo.emiliano.inicio;


import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.mendez.galindo.emiliano.util.ReadUtil;
import org.mendez.galindo.emiliano.vista.Consola;
import org.mendez.galindo.emiliano.vista.Ejecutable;
import org.mendez.galindo.emiliano.vista.Menu;
import org.mendez.galindo.emiliano.vista.Ventana;

/**
 *
 */
public class Inicio2
{

    /**
     * Default constructor
     */
    public Inicio2()
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
        System.out.println("Hola Emiliano 2");
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
                case 4:
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
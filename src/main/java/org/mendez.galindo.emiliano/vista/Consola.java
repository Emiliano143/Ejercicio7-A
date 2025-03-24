    package org.mendez.galindo.emiliano.vista;

    import org.gerdoc.historial.Historiales;

    import org.mendez.galindo.emiliano.model.figura.Cuadrado;
    import org.mendez.galindo.emiliano.model.figura.Equilatero;
    import org.mendez.galindo.emiliano.model.figura.Figura;
    import org.mendez.galindo.emiliano.model.figura.Rectangulo;
    import org.mendez.galindo.emiliano.model.figura.Rombo;
    import org.mendez.galindo.emiliano.model.figura.Trapecio;
    import org.mendez.galindo.emiliano.model.figura.Pentagono;
    import org.mendez.galindo.emiliano.model.figura.figura2.Escaleno;
    import org.mendez.galindo.emiliano.model.figura.figura2.Isosceles;
    import org.mendez.galindo.emiliano.util.ReadUtil;

    public class Consola implements Ejecutable
    {
        private static Consola consola;
        private Historiales historiales;


        private Consola()
        {
        }

        public static Consola getInstance( )
        {
            if( consola == null )
            {
                consola = new Consola( );
            }
            return consola;
        }

        @Override
        public void run()
        {
            boolean flag = true;
            int opcion = 0;
            Figura figura = null;
            while( flag )
            {
                figura = null;
                Menu.principal( );
                opcion = ReadUtil.getInstance( ).leerInt( );
                switch( opcion )
                {
                    case 1:
                        figura = new Cuadrado( );
                        break;
                    case 2:
                        figura = new Equilatero( );
                        break;
                    case 3:
                        figura = new Isosceles( );
                        break;
                    case 4:
                        figura = new Escaleno( );
                        break;
                    case 5:
                        figura = new Rectangulo( );
                        break;
                    case 6:
                        figura = new Rombo( );
                        break;
                    case 7:
                        figura = new Trapecio( );
                        break;
                    case 8:
                        figura = new Pentagono( );
                        break;
                    case 9:
                        flag = false;
                        break;
                    default:
                        Menu.opcionInvalida( );
                }
                if( figura != null )
                {
                    ((org.gerdoc.vista.SolicitaDatos)figura).leerDatos( );
                    Menu.print( figura );
                    historiales.addFigura(figura);

                }
            }
        }

        @Override
        public void addHistoriales(Historiales historiales)
        {
            this.historiales = historiales;

        }


    }

package org.mendez.galindo.emiliano.vista;

import org.gerdoc.historial.Historiales;
import org.mendez.galindo.emiliano.model.figura.Cuadrado;
import org.mendez.galindo.emiliano.model.figura.Rombo;
import org.mendez.galindo.emiliano.model.figura.Rectangulo;
import org.mendez.galindo.emiliano.model.figura.Trapecio;
import org.mendez.galindo.emiliano.model.figura.Pentagono;
import org.mendez.galindo.emiliano.model.figura.Equilatero;
import org.mendez.galindo.emiliano.model.figura.figura2.Isosceles;
import org.mendez.galindo.emiliano.model.figura.figura2.Escaleno;

import org.mendez.galindo.emiliano.model.figura.Figura;
import org.mendez.galindo.emiliano.util.ReadUtil;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField1, jTextField2, jTextField3, jTextField4, jTextField5;
    private JButton jButton;
    private JComboBox<String> jComboBox;
    private Historiales historiales;

    private Ventana() {
        super("Ventana de figuras");
        init();
    }

    private void init() {
        jLabel = new JLabel("-----Figuras-----");
        jLabel.setBounds(20, 10, 100, 20);

        JLabel jLabel1 = new JLabel("Selecciona tu figura e ingresa los valores:");
        jLabel1.setBounds(10, 40, 400, 20);

        jComboBox = new JComboBox<>(new String[]{"Cuadrado", "Equilatero", "Isosceles", "Escaleno", "Rectangulo", "Rombo", "Trapecio", "Pentagono"});
        jComboBox.setBounds(10, 70, 150, 20);

        jTextField1 = new JTextField();
        jTextField1.setBounds(10, 100, 100, 20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(10, 130, 100, 20);
        jTextField3 = new JTextField();
        jTextField3.setBounds(10, 160, 100, 20);
        jTextField4 = new JTextField();
        jTextField4.setBounds(10, 190, 100, 20);
        jTextField5 = new JTextField();
        jTextField5.setBounds(10, 220, 100, 20);

        jButton = new JButton("Calcular");
        jButton.setBounds(10, 250, 100, 20);
        jButton.addActionListener(p -> calcular());

        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jLabel1);
        getContentPane().add(jComboBox);
        getContentPane().add(jTextField1);
        getContentPane().add(jTextField2);
        getContentPane().add(jTextField3);
        getContentPane().add(jTextField4);
        getContentPane().add(jTextField5);
        getContentPane().add(jButton);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void calcular() {
        Figura figura = null;
        String figuraSeleccionada = (String) jComboBox.getSelectedItem();

        switch (figuraSeleccionada) {
            case "Cuadrado":
                figura = new Cuadrado();
                ((Cuadrado) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                break;
            case "Equilatero":
                figura = new Equilatero();
                ((Equilatero) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                ((Equilatero) figura).setBase(ReadUtil.string2Integer(jTextField2.getText()));
                ((Equilatero) figura).setAltura(ReadUtil.string2Integer(jTextField3.getText()));
                break;
            case "Isosceles":
                figura = new Isosceles();
                ((Isosceles) figura).setBase(ReadUtil.string2Integer(jTextField1.getText()));
                ((Isosceles) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                ((Isosceles) figura).setLado(ReadUtil.string2Integer(jTextField3.getText()));
                ((Isosceles) figura).setLado2(ReadUtil.string2Integer(jTextField4.getText()));
                break;
            case "Escaleno":
                figura = new Escaleno();
                ((Escaleno) figura).setBase(ReadUtil.string2Integer(jTextField1.getText()));
                ((Escaleno) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                ((Escaleno) figura).setLado(ReadUtil.string2Integer(jTextField3.getText()));
                ((Escaleno) figura).setLado2(ReadUtil.string2Integer(jTextField4.getText()));
                ((Escaleno) figura).setLado3(ReadUtil.string2Integer(jTextField5.getText()));
                break;
            case "Rectangulo":
                figura = new Rectangulo();
                ((Rectangulo) figura).setBase(ReadUtil.string2Integer(jTextField1.getText()));
                ((Rectangulo) figura).setAltura(ReadUtil.string2Integer(jTextField2.getText()));
                break;
            case "Rombo":
                figura = new Rombo();
                ((Rombo) figura).setDmayor(ReadUtil.string2Integer(jTextField1.getText()));
                ((Rombo) figura).setDmenor(ReadUtil.string2Integer(jTextField2.getText()));
                ((Rombo) figura).setLado(ReadUtil.string2Integer(jTextField3.getText()));
                break;
            case "Trapecio":
                figura = new Trapecio();
                ((Trapecio) figura).setBmayor(ReadUtil.string2Integer(jTextField1.getText()));
                ((Trapecio) figura).setBmenor(ReadUtil.string2Integer(jTextField2.getText()));
                ((Trapecio) figura).setAltura(ReadUtil.string2Integer(jTextField3.getText()));
                ((Trapecio) figura).setLado1(ReadUtil.string2Integer(jTextField4.getText()));
                break;
            case "Pentagono":
                figura = new Pentagono();
                ((Pentagono) figura).setLado(ReadUtil.string2Integer(jTextField1.getText()));
                ((Pentagono) figura).setApotema(ReadUtil.string2Integer(jTextField2.getText()));
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }

        System.out.println("Figura: " + figuraSeleccionada);
        System.out.println("Area: " + figura.area());
        System.out.println("Perimetro: " + figura.perimetro());
        historiales.addFigura(figura);
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setBounds(100, 100, 400, 400);
        setVisible(true);
    }



    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}
package org.millan.escorza.william.andrey.vista;


import org.gerdoc.historial.Historiales;
import org.millan.escorza.william.andrey.model.figura.Cuadrado;
import org.millan.escorza.william.andrey.model.figura.Decagono;
import org.millan.escorza.william.andrey.model.figura.Equilatero;
import org.millan.escorza.william.andrey.model.figura.Figura;
import org.millan.escorza.william.andrey.model.figura.Rectangulo;
import org.millan.escorza.william.andrey.model.figura.Circulo;
import org.millan.escorza.william.andrey.model.figura.Pentagono;
import org.millan.escorza.william.andrey.model.figura.figura2.Escaleno;
import org.millan.escorza.william.andrey.model.figura.figura2.Isosceles;
import org.millan.escorza.william.andrey.util.ReadUtil;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;

    private JLabel label1, label2, label3, labelBase, labelAltura, labelRadio, labelApotema;
    private JTextField textField1, textField2, textField3, textBase, textAltura, textRadio, textApotema;
    private JButton calcularButton;
    private JTextArea resultArea;
    private JComboBox<String> figuraComboBox;
    private Historiales historiales;

    private Ventana() {
        super("Ventana de Figuras");
        init();
    }

    private void init() {
        setLayout(null);

        figuraComboBox = new JComboBox<>(new String[]{"Cuadrado", "Rectángulo", "Decágono", "Círculo", "Pentágono", "Equilátero", "Isósceles", "Escaleno"});
        figuraComboBox.setBounds(10, 10, 150, 20);
        figuraComboBox.addActionListener(e -> actualizarCampos());
        add(figuraComboBox);

        label1 = new JLabel("Lado:");
        label1.setBounds(10, 40, 100, 20);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(120, 40, 100, 20);
        add(textField1);

        label2 = new JLabel("Lado 2:");
        label2.setBounds(10, 70, 100, 20);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(120, 70, 100, 20);
        add(textField2);

        label3 = new JLabel("Lado 3:");
        label3.setBounds(10, 100, 100, 20);
        add(label3);

        textField3 = new JTextField();
        textField3.setBounds(120, 100, 100, 20);
        add(textField3);

        labelBase = new JLabel("Base:");
        labelBase.setBounds(10, 130, 100, 20);
        add(labelBase);

        textBase = new JTextField();
        textBase.setBounds(120, 130, 100, 20);
        add(textBase);

        labelAltura = new JLabel("Altura:");
        labelAltura.setBounds(10, 160, 100, 20);
        add(labelAltura);

        textAltura = new JTextField();
        textAltura.setBounds(120, 160, 100, 20);
        add(textAltura);

        labelRadio = new JLabel("Radio:");
        labelRadio.setBounds(10, 190, 100, 20);
        add(labelRadio);

        textRadio = new JTextField();
        textRadio.setBounds(120, 190, 100, 20);
        add(textRadio);

        labelApotema = new JLabel("Apotema:");
        labelApotema.setBounds(10, 220, 100, 20);
        add(labelApotema);

        textApotema = new JTextField();
        textApotema.setBounds(120, 220, 100, 20);
        add(textApotema);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 250, 210, 20);
        calcularButton.addActionListener(e -> calcular());
        add(calcularButton);

        resultArea = new JTextArea();
        resultArea.setBounds(10, 280, 260, 100);
        resultArea.setEditable(false);
        add(resultArea);

        actualizarCampos();
    }

    private void actualizarCampos() {
        String figuraSeleccionada = (String) figuraComboBox.getSelectedItem();
        boolean esTriangulo = figuraSeleccionada.contains("Equilátero") || figuraSeleccionada.contains("Isósceles") || figuraSeleccionada.contains("Escaleno");
        boolean esPentagono = figuraSeleccionada.contains("Pentágono");
        boolean esCirculo = figuraSeleccionada.contains("Círculo");
        boolean esRectangulo = figuraSeleccionada.contains("Rectángulo");
        boolean esDecagono = figuraSeleccionada.contains("Decágono");

        label1.setVisible(!esCirculo);
        textField1.setVisible(!esCirculo);
        label2.setVisible(!esCirculo && !figuraSeleccionada.equals("Equilátero") && !esPentagono && !esRectangulo && !esDecagono);
        textField2.setVisible(!esCirculo && !figuraSeleccionada.equals("Equilátero") && !esPentagono && !esRectangulo && !esDecagono);
        label3.setVisible("Escaleno".equals(figuraSeleccionada));
        textField3.setVisible("Escaleno".equals(figuraSeleccionada));
        labelBase.setVisible(esTriangulo || esRectangulo);
        textBase.setVisible(esTriangulo || esRectangulo);
        labelAltura.setVisible(esTriangulo || esRectangulo);
        textAltura.setVisible(esTriangulo || esRectangulo);
        labelRadio.setVisible(esCirculo);
        textRadio.setVisible(esCirculo);
        labelApotema.setVisible(esPentagono || esDecagono);
        textApotema.setVisible(esPentagono || esDecagono);
    }

    private void calcular() {
        try {
            String figuraSeleccionada = (String) figuraComboBox.getSelectedItem();
            Figura figura;

            if ("Cuadrado".equals(figuraSeleccionada)) {
                int lado = ReadUtil.string2Integer(textField1.getText());
                figura = new Cuadrado();
                ((Cuadrado) figura).setLado(lado);
            } else if ("Rectángulo".equals(figuraSeleccionada)) {
                int base = ReadUtil.string2Integer(textBase.getText());
                int altura = ReadUtil.string2Integer(textAltura.getText());
                figura = new Rectangulo(base, altura);
            } else if ("Decágono".equals(figuraSeleccionada)) {
                int lado = ReadUtil.string2Integer(textField1.getText());
                int apotema = ReadUtil.string2Integer(textApotema.getText());
                figura = new Decagono(lado, apotema);
            } else if ("Círculo".equals(figuraSeleccionada)) {
                int radio = ReadUtil.string2Integer(textRadio.getText());
                figura = new Circulo(radio);
            } else if ("Pentágono".equals(figuraSeleccionada)) {
                int lado = ReadUtil.string2Integer(textField1.getText());
                int apotema = ReadUtil.string2Integer(textApotema.getText());
                figura = new Pentagono(lado, apotema);
            } else if ("Equilátero".equals(figuraSeleccionada)) {
                int base = ReadUtil.string2Integer(textBase.getText());
                int altura = ReadUtil.string2Integer(textAltura.getText());
                int lado = ReadUtil.string2Integer(textField1.getText());
                figura = new Equilatero(base, altura, lado);
            } else if ("Isósceles".equals(figuraSeleccionada)) {
                int base = ReadUtil.string2Integer(textBase.getText());
                int altura = ReadUtil.string2Integer(textAltura.getText());
                int lado1 = ReadUtil.string2Integer(textField1.getText());
                int lado2 = ReadUtil.string2Integer(textField2.getText());
                figura = new Isosceles(base, altura, lado1, lado2);
            } else {
                int base = ReadUtil.string2Integer(textBase.getText());
                int altura = ReadUtil.string2Integer(textAltura.getText());
                int lado1 = ReadUtil.string2Integer(textField1.getText());
                int lado2 = ReadUtil.string2Integer(textField2.getText());
                int lado3 = ReadUtil.string2Integer(textField3.getText());
                figura = new Escaleno(base, altura, lado1, lado2, lado3);
            }

            double area = figura.area();
            double perimetro = figura.perimetro();

            resultArea.setText("Resultados:\n");
            resultArea.append("Figura: " + figuraSeleccionada + "\n");
            resultArea.append("Área: " + area + "\n");
            resultArea.append("Perímetro: " + perimetro + "\n");

            // Agregar la figura al historial
            historiales.addFigura(figura);

        } catch (NumberFormatException ex) {
            resultArea.setText("Por favor, ingrese números válidos.");
        }
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setSize(300, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    @Override
    public void addHistoriales(Historiales historiales) {this.historiales = historiales;}
}
/*
Interfaz gráfica:
Usa componentes de Swing (JFrame, JLabel, JTextField, JButton, etc.) para crear una ventana con campos de entrada, botones y un área de texto para mostrar resultados.
Permite al usuario seleccionar una figura desde un JComboBox.
Lógica de cálculo:
Dependiendo de la figura seleccionada, se solicitan los datos necesarios (lados, base, altura, radio, etc.).
Se calcula el área y el perímetro utilizando las fórmulas correspondientes para cada figura.
Patrones de diseño:
Singleton: La clase Ventana implementa el patrón Singleton para garantizar que solo exista una instancia de la ventana.
Polimorfismo: Se utiliza una referencia de tipo Figura para manejar diferentes tipos de figuras y calcular sus propiedades.
Manejo de errores:
Si el usuario ingresa datos no válidos (por ejemplo, texto en lugar de números), se muestra un mensaje de error en el área de texto.
Actualización dinámica:
Los campos de entrada se muestran u ocultan dinámicamente según la figura seleccionada, lo que mejora la experiencia del usuario.
 */

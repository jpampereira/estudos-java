package fundamentos.exercicios;

import javax.swing.JOptionPane;

// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32) x 5/9 = ºC
        // ((9/5) x ºC) + 32 = ºF

        String entrada = JOptionPane.showInputDialog("Insira a temperatura:");
        String grandeza = JOptionPane.showInputDialog("Indique a grandeza da temperatura inserida [C ou F]:");

        double temperatura = Double.parseDouble(entrada.replace(",", "."));

        double resultado = grandeza.equals("F") ? (temperatura - 32) * (5 / 9.0) : ((9 / 5.0) * temperatura) + 32;
        String grandezaResultante = grandeza.equals("F") ? "C" : "F";

        JOptionPane.showMessageDialog(null,
                String.format("%.2f º%s = %.2f º%s", temperatura, grandeza, resultado, grandezaResultante));
    }
}
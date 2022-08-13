package fundamentos.exercicios;

import javax.swing.JOptionPane;

// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

public class CalculoIMC {
    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Insira o peso da pessoa (em quilos):");
        String entrada2 = JOptionPane.showInputDialog("Insira a altura da pessoa (em centímetros):");

        double peso = Double.parseDouble(entrada1.replace(",", "."));
        double altura = Double.parseDouble(entrada2.replace(",", ".")) / 100;

        double imc = peso / (Math.pow(altura, 2));

        JOptionPane.showMessageDialog(null, String.format("IMC = %.2f", imc));
    }
}
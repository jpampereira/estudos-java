package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String entrada2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        String operador = JOptionPane.showInputDialog("Informe a operação que deseja realizar [+, -, *, /, %]: ");

        double num1 = Double.parseDouble(entrada1);
        double num2 = Double.parseDouble(entrada2);

        double resultado = operador.equals("+") ? num1 + num2 : 0;
        resultado = operador.equals("-") ? num1 - num2 : resultado;
        resultado = operador.equals("*") ? num1 * num2 : resultado;
        resultado = operador.equals("/") ? num1 / num2 : resultado;
        resultado = operador.equals("%") ? num1 % num2 : resultado;

        JOptionPane.showMessageDialog(null, String.format("%.2f %s %.2f = %.2f",
                num1, operador, num2, resultado));
    }
}
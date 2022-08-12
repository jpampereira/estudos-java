package fundamentos;

/* - A biblioteca JOptionPane, do pacote javax.swing, permite que a interação do usuário com o programa seja realizada
 * através de telas, ao invés da linha de comando, como é o padrão.
 *
 * - A conversão de String para um tipo numérico pode ser perigosa, pois nem toda String é número.
 *
 * - Algoritmos para realização de operações precisas entre números com ponto flutuante são custosas, logo, as
 * linguagens de programação, por padrão, utilizam algoritmos mais otimizados que apresentam alguma imprecisão, mas
 * que na maioria dos casos vai passar despercebida. Se a sua aplicação necessita de cálculos precisos (como por
 * exemplo, uma aplicação de sistema bancário), então utilize o tipo "BigDecimal", da biblioteca "java.math".
 */

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número"); // 7.9
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número"); // 8.3

        System.out.println(valor1 + valor2); // Vai concatenar

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2; // 7.9 + 8.3

        System.out.println("Soma é " + soma); // Soma é 16.200000000000003
        System.out.println("Média é " + soma / 2); // Média é 8.100000000000001
    }
}
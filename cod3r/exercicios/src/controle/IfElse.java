package controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número:");

        int numero = Integer.parseInt(valor);

//        if (numero % 2 == 0) {
//            System.out.println("Número par!");
//        }
//
//        if (numero % 2 == 1) {
//            System.out.println("Número ímpar!");
//        }

        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else { // Caso a condição de "if" seja "false", o bloco de código de "else" será executado
            System.out.println("Número ímpar");
        }

        /* - Caso o bloco de código do else seja formado por uma única sentença de código, suas chaves também
         * podem ser omitidas.
         * - If = Se
         * - Else = Senão
         */
    }
}

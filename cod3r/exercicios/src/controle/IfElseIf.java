package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        /* Serão testadas, na ordem estabelecida, todas as condicionais, e caso uma delas tenha o resultado "true"
         * seu bloco de código será executado e as condicionais abaixo serão todas ignoradas.
         */

        // Exemplo: nota = 5.5

        if (nota > 10 || nota < 0) { // false
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A"); // false
        } else if (nota >= 6.1) {
            System.out.println("Conceito B"); // false
        } else if (nota >= 4.1) {
            System.out.println("Conceito C"); // true - Imprime "Conceito C"
        } else if (nota >= 2.1) {
            System.out.println("Conceito D"); // Ignorado
        } else {
            System.out.println("Conceito E"); // Ignorado
        }

        // Continua a partir daqui...

        System.out.println("Fim!");

        entrada.close();
    }
}

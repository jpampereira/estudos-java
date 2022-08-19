package controle.exercicios;

/* Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
 * caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero, soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();

            if (numero >= 0.0) {
                soma += numero;
                System.out.printf("Soma: %.2f\n\n", soma);
            }
        } while (numero >= 0.0);

        System.out.printf("\n##### Soma final: %.2f\n", soma);

        scanner.close();
    }
}
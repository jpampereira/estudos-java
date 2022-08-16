package controle;

/* Desafio: Calcular a média das notas de uma turma.
 * - O programa deve solicitar para que o usuário insira uma nova nota enquanto o mesmo não digitar -1.
 * - Caso o usuário insira uma nota inválida (< 0 ou > 10), uma mensagem deve ser impressa na tela.
 */

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota, soma = 0;
        int qtdNotas = 0;

        do {
            System.out.print("Insira a nota: ");
            nota = scanner.nextDouble();

            if (nota >= 0.0 && nota <= 10.0) {
                // Nota válida...
                soma += nota;
                qtdNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida!");
            }
        } while (nota != -1);

        double media = soma / qtdNotas;

        System.out.printf("Média = %.2f\n", media);

        scanner.close();
    }
}
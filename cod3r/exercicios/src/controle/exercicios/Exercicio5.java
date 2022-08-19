package controle.exercicios;

/* Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
 * O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de
 * tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = (int) (Math.random() * 100);
        String resultado = "Perdeu";

        System.out.println("##### JOGO: TENTE ADIVINHAR O NÚMERO #####");

        for (int tentativas = 9; tentativas >= 0; tentativas--) {
            System.out.print("\nDigite um número: ");
            int numero = scanner.nextInt();

            if (numero == numeroEscolhido) {
                resultado = "Ganhou";
                break;
            } else {
                if (numero > numeroEscolhido) {
                    System.out.println("O número em questão é menor do que o digitado. ");
                } else {
                    System.out.println("O número em questão é maior do que o digitado. ");
                }

                System.out.printf("Tentativas restantes: %d\n", tentativas);
            }
        }

        System.out.printf("\nResultado: %s!\n", resultado);

        scanner.close();
    }
}
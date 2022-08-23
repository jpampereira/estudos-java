package arrays;

import java.util.Scanner;

/* Desafio: Escrever um programa para calcular a média de um aluno. O programa inicialmente deve pedir pro usuário
 * inserir a quantidade de notas e em seguida solicitar cada uma delas. A fim de treinar o uso das estruturas de
 * repetição, deve-se utilizar o "for tradicional" para solicitar as notas ao usuário e o "foreach" para calcular a
 * média delas.
 */

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de notas que deseja inserir: ");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
            } else {
                System.out.println("##### Digite uma nota válida! #####");
                i--;
            }
        }

        double total = 0;

        for (double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;

        System.out.printf("Média do aluno: %.1f\n", media);

        scanner.close();
    }
}
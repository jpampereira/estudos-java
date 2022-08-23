package arrays;

import java.util.Arrays;
import java.util.Scanner;

// Repita o desafio de Arrays mas dessa vez com o intuito de calcular a média de uma classe.

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int qtdAlunos = scanner.nextInt();
        System.out.print("Digite o número de notas de cada aluno: ");
        int qtdNotas = scanner.nextInt();

        // Uma matriz é um Array bidimensional, onde casa posição do mesmo há outro Array armazenado

        /* Nesse caso, a matriz é um Array onde cada posição diz respeito a um aluno e cada aluno armazena um outro
         * Array, que armazena em cada uma de suas posições as notas desse aluno.
         */

        double[][] classe = new double[qtdAlunos][qtdNotas];

        for (int i = 0; i < classe.length; i++) {
            for (int j = 0; j < classe[i].length; j++) {
                System.out.printf("Insira a nota %d do aluno %d: ", i + 1, j + 1);
                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    classe[i][j] = nota;
                } else {
                    System.out.println("##### Digite uma nota válida! #####");
                    j--;
                }
            }
        }

        double totalClasse = 0;

        for (double[] aluno: classe) {
            double totalAluno = 0;

            System.out.println(Arrays.toString(aluno)); // Imprime notas do aluno

            for (double nota: aluno) {
                totalAluno += nota;
            }

            double mediaAluno = totalAluno / aluno.length;

            totalClasse += mediaAluno;
        }

        double mediaClasse = totalClasse / classe.length;

        System.out.printf("Média da classe: %.1f", mediaClasse);

        scanner.close();
    }
}
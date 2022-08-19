package controle.exercicios;

// Crie um programa que recebe 10 valores e ao final imprima o maior número.

import java.util.Objects;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer maior = null;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira um número: ");
            int numero = scanner.nextInt();

            if (Objects.isNull(maior) || numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("\nMaior número inserido: %d\n", maior);

        scanner.close();
    }
}
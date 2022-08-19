package controle.exercicios;

// Criar um programa que receba um número e diga se ele é um número primo.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Número primo: divisível apenas por 1 e por ele mesmo

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        scanner.close();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.printf("%d não é primo!\n", numero);
                return;
            }
        }

        System.out.printf("%d é primo!\n", numero);
    }
}
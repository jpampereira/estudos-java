package controle.exercicios;

// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10) {
            System.out.println("Está dentro do intervalo  [0, 10].");
        } else {
            System.out.println("Está fora do intervalo [0, 10].");
        }

        if (numero % 2 == 0) {
            System.out.println("É par.");
        } else {
            System.out.println("É ímpar.");
        }

        scanner.close();
    }
}
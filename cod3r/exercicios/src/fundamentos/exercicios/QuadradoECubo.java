package fundamentos.exercicios;

import java.util.Scanner;

// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

public class QuadradoECubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.printf("%.2f² = %.2f\n", numero, quadrado);
        System.out.printf("%.2f³ = %.2f\n", numero, cubo);

        scanner.close();
    }
}
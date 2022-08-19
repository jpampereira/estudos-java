package controle.exercicios;

// Criar um programa que receba uma palavra e imprime no console letra por letra.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = scanner.next();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

        scanner.close();
    }
}
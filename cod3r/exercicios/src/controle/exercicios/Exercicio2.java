package controle.exercicios;

// Criar um programa informa se o ano atual é um ano bissexto

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean divisivelPor4 = ano % 4 == 0;
        boolean divisivelPor100 = ano % 100 == 0;
        boolean divisivelPor400 = ano % 400 == 0;

        if ((divisivelPor4 && !divisivelPor100) || (divisivelPor400 && divisivelPor100)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto.");
        }
    }
}
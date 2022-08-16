package controle;

import java.util.Scanner;

/* Desafio: Quando o usuário escrever o dia da semana, por extenso, o valor correspondente deve aparecer.
 * Domingo -> 1
 * Segunda -> 2
 * Terça -> 3
 * ...
 */

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do dia da semana: ");
        String diaDaSemana = scanner.nextLine();

        int valor;

        if (diaDaSemana.equalsIgnoreCase("Domingo")) {
            valor = 1;
        } else if (diaDaSemana.equalsIgnoreCase("Segunda")) {
            valor = 2;
        } else if (diaDaSemana.equalsIgnoreCase("Terça")) {
            valor = 3;
        } else if (diaDaSemana.equalsIgnoreCase("Quarta")) {
            valor = 4;
        } else if (diaDaSemana.equalsIgnoreCase("Quinta")) {
            valor = 5;
        } else if (diaDaSemana.equalsIgnoreCase("Sexta")) {
            valor = 6;
        } else if (diaDaSemana.equalsIgnoreCase("Sábado")) {
            valor = 7;
        } else {
            valor = -1;
        }

        System.out.println(valor);
    }
}
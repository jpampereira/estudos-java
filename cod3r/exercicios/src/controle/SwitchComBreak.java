package controle;

import java.util.Scanner;

/* - Podemos agrupar os cases para executar um mesmo bloco de código.
 *
 * - Utilizando o "break" no final de cada case, não haverá o problema visto em "SwitchSemBreak.java" onde assim que
 * um dos cases era satisfeito, os demais abaixo dele também eram executados. Nesse caso, apenas o bloco de código
 * pertencente ao "case" satisfeito será executado.
 */

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String conceito = "";

        System.out.print("Informe a nota: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                conceito = "não encontrado!";
        }

        System.out.printf("O conceito é %s.\n", conceito);

        scanner.close();
    }
}
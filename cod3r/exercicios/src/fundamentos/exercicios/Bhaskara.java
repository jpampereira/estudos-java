package fundamentos.exercicios;

/* Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
 */

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dada a equação do segundo grau ax² + bx + c = 0.");
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("Equação: %.2fx² + %.2fx + %.2f = 0\n", a, b, c);
        System.out.printf("Delta: %.2f\n", delta);
        System.out.printf("x1: %.2f\n", x1);
        System.out.printf("x2: %.2f\n", x2);

        scanner.close();
    }
}
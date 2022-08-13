package fundamentos.exercicios;

// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

public class AreaTriangulo {
    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);

        double area = (base * altura) / 2;

        System.out.printf("Altura do Triângulo: %.2f\n", area);
    }
}
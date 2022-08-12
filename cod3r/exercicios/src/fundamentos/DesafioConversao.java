package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salarioStr1 = entrada.nextLine();

        System.out.print("Digite o segundo salário: ");
        String salarioStr2 = entrada.nextLine();

        System.out.print("Digite o terceiro salário: ");
        String salarioStr3 = entrada.nextLine();

        entrada.close();

        double salarioDouble1 = Double.parseDouble(salarioStr1.replace(",", "."));
        double salarioDouble2 = Double.parseDouble(salarioStr2.replace(",", "."));
        double salarioDouble3 = Double.parseDouble(salarioStr3.replace(",", "."));

        double media = (salarioDouble1 + salarioDouble2 + salarioDouble3) / 3;

        System.out.printf("Média dos últimos três salários: R$ %.2f\n", media);
    }
}
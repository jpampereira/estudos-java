package controle;

import java.util.Scanner;

/* O Java não possui a mesma flexibilidade do JavaScript que converte algumas situações em valores booleanos, quando
 * necessário. Exemplo: 0, string vazia, array vazio, undefined e null são considerados valores "false".
 */

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if (media >= 7.0 && media <= 10) { // Se a média for maior ou igual a 7, executar o seguinte bloco de código
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        // As chaves podem ser omitidas caso o bloco de código seja formado por uma única sentença

        if (media >= 4.5 && media < 7) System.out.println("Recuperação");

        boolean criterioReprovacaoAtingido = media >= 0 && media < 4.5;
        if (criterioReprovacaoAtingido)
            System.out.println("Reprovado");

        entrada.close();
    }
}

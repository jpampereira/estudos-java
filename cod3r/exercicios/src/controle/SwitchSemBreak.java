package controle;

/* - Diferentemente das estruturas apresentadas anteriormente, o "switch" não recebe uma expressão que retorna
 * "true" ou "false", e sim valores. Devemos utilizar ele quando recebemos um valor e para cada valor possível,
 * devemos determinar o comportamento do código.
 *
 * - Não utilizando o "break", depois que um dos "cases" é satisfeito, os demais abaixo dele tambéms serão
 * executados.
 *
 * - O "default" é equivalente ao "else", ou seja, caso nenhuma condição seja satisfeita, execute o seguinte bloco
 * de código.
 */

public class SwitchSemBreak {
    public static void main(String[] args) {
        // if (bool) ...
        // while (bool) ...
        // for (...; bool; ...) ...

        String faixa = "vermelha";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei nada");
        }

        System.out.println("Fim!");

        int idade = 3;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
        }
    }
}
package controle;

/* Desafio: Qual o problema com esse código?
 *
 * Resposta: Na linha 11, após a expressão condicional do if é inserido um ";", que indica o fim de uma sentença
 * de código. Logo, o bloco de código em seguida sempre será executado, pois ele não está relacionado a estrutura
 * condicional acima.
 */

public class DesafioIf {
    public static void main(String[] args) {
        double nota = 1.3;

        if (nota >= 9.0); {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!");
        }
    }
}

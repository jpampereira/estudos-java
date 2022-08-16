package controle;

/* - A palavra reservada "continue", assim como o "break", interrompe o fluxo de execução natural do código. Mas
 * diferentemente do "break", ele não sai da estrutura de repetição, ele apenas ignora tudo o que está abaixo e
 * pula para a próxima iteração.
 */

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            /* Caso "i" seja ímpar, seu valor não é impresso no console, pois o fluxo
             * acaba executando o bloco de código do "if" que contém o "continue",
             * fazendo com que tudo abaixo dele seja ignorado e a próxima iteração seja
             * executada.
             */
            if (i % 2 == 1) continue;

            System.out.println(i);
        }

        /* Imprime:
         * 0
         * 2
         * 4
         * 6
         * 8
         */
    }
}
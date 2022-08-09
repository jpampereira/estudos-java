package fundamentos;

/* Inicialmente, podemos entender os pacotes como pastas (apesar de eles possuírem outras funcionalidades que serão
 * vistas mais a frente do curso). Logo, utilizamos os pacotes para organizar o nosso projeto e agrupar arquivos
 * relacionados.
 */

/* - A linguagem Java é organizada em sentenças de código terminadas com ponto e vírgula (Analogia com frases que são
 * finalizadas com um ponto);
 * - Essas sentenças podem ser agrupadas por blocos de código, delimitado por pares de chaves (Analogia com parágrafos,
 * que agrupam frases);
 * - O método main é a porta de entrada de um código (é o primeiro método chamado quando o programa é executado);
 * - A identação nos permite visualizarmos a hierarquia das sentenças/blocos de código;
 * Códigos organizados/bem formatados são mais fáceis de serem lidos e previnem bugs;
 * - Um programa Java é formado por diversos arquivos de extensão ".java" que interagem entre sí.
 */

/* - Utilizamos comentários para que o programa ignore trechos do nosso código ou para explicá-los;
 * - Usar comentários apenas quando for relevante, caso contrário, o código vai ficar mais difícil de ser lido.
 */

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Primeiro programa Parte #01!"); // Imprime o texto entre aspas no terminal
        System.out.println("Primeiro programa Parte #02!");

        // Comentário de uma linha

        /*
         * Comentário
         * de
         * Múltiplas
         * Linhas
         */

        /** JavaDoc - Utilizamos para escrever a documentação do código
         *
         * Essa classe representa...
         *
         * @author João Pedro de Abreu Martins Pereira <@email.com>
         * @since 1.0
         */
    }
}
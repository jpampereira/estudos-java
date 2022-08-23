package arrays;

/* - O Foreach é outra estrutura de repetição mas que geralmente é utilizada em um contexto mais específico: quando
 * queremos percorrer um Array, posição por posição, do início ao fim. Por saber que o Array será percorrido por
 * inteiro, não há a necessidade de se utilizar uma variável para controlar o índice da iteração atual, sendo uma
 * estrutura mais simples.
 */
public class Foreach {
    public static void main(String[] args) {
        double[] notas = { 9.9, 8.7, 7.2, 9.4 };

        // Forma tradicional
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        // Foreach
        for (double nota: notas) { // O valor da iteração atual é armazenada em "nota"
            System.out.print(nota + " ");
        }
    }
}
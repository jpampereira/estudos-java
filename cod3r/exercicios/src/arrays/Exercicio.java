package arrays;

/* -  Características de Arrays (Vetores) em Java:
 *
 *      1. Arrays tem tamanho fixo: é necessário especificar o seu tamanho em sua declaração;
 *      2. Arrays são homogêneos: só é possível armazenar dados de um mesmo tipo;
 *      3. Arrays são indexados: nós acessamos os valores de um Array através de índices, iniciando em 0;
 *      4. Array é um Objeto: "length" é um exemplo de atributo do Objeto Array que retorna o seu comprimento;
 *      5. Uma matriz é um array de múltiplas direções (Array de Arrays).
 */

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4]; // Criação de um novo array que armazena três dados do tipo double
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7; // Acessando a posição 2 do Array e armazenando um dado nela
        notasAlunoA[3] = 9.7;

        /* Arrays são Objetos, e lembre-se que variáveis que armazenam Objetos na verdade armazenam um endereço de
         * memória que é onde os dados daquela instância estão armazenado. Logo, se você tentar imprimir um Array dessa
         * forma, será impresso o endereço de memória correspondente a essa estrutura e não seus valores armazenados.
         */

        // System.out.println(notasAlunoA);

        /* Sendo assim, para imprimir um array, podemos utilizar o método ".toString()" que transforma essa estrutura
         * em uma string.
         */

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]); // Imprimindo a primeira nota armazenada no Array
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); // Acessando a última posição do Array
        // System.out.println(notasAlunoA[4]); // ERRO!

        // Percorrendo um Array
        double totalAlunoA = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        // Declarar um Array e já inicializá-lo - Menos comum
        final double notaArmazenada = 5.5;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

        double totalAlunoB = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoA.length);
    }
}
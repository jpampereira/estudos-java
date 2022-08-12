package fundamentos;

/* - Quando convertemos de um tipo de menor para um com maior capacidade de armazenamento, esse processo é feito
 * de forma implícita, ou seja, não é necessário explicitar a conversão, pois entende-se que se um valor cabe em
 * uma variável de menor capacidade, caberá em uma maior. Exemplo: converter um tipo "byte" para um tipo "int".
 *
 * - Porém, quando desejamos fazer a conversão de um tipo maior para um menor, devemos explicitar essa operação.
 * Devemos evitar ao máximo esse tipo de conversão, pois não necessariamente o que cabe em um tipo maior, vai caber
 * em um menor, podendo gerar perda de dados. Exemplo: converter um tipo "long" para um tipo "int".
 *
 * - Exemplo:
 *
 * // byte consegue armazenar num range de -128 à 127
 *
 * int a = 128;
 * byte b = a;
 *
 * // O valor de "b" será -128, pois o tipo de "byte" não consegue armazenar o valor de "a". Ele recebe esse valor
 * // pois o valor seguinte a 127 dentro do tipo byte é -128 (Como se os valores do tipo byte formassem um círculo).
 * // Se "a" fosse 129, "b" armazenaria o valor -127, e assim em diante.
 *
 * - A conversão de um tipo inteiro para um tipo real é implícita, porém, a operação inversa deve ser realizada de
 * forma explícita, uma vez que haverá perda das casas decimais do número real.
 *
 * - Otimizar o código utilizando tipos pequenos como "byte" e "short" não vai trazer grandes resultados para o seu
 * código. Procure utilizar os tipos padrões (int e double) e caso você precise utilizar tipos maiores para números
 * inteiros, então você utiliza o tipo "long". Isso evita você ficar realizando operações de casting no seu código.
 */

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // Conversão implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // Conversão explícita (Casting)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c; // Conversão explícita (Casting)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // Conversão explícita (Casting)
        System.out.println(f);
    }
}
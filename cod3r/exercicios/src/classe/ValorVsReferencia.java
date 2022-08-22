package classe;

/* - Uma variável nada mais é do que um espaço de memória, reservado durante a sua declaração, utilizado para armazenar
 * um determinado valor. Endereços de memória são nomeados através de valores hexadecimais, portanto, os nomes das
 * variáveis funcionam como um apelido que nos permite acessar aquele endereço de memória utilizando um nome mais
 * amigável.
 *
 * - Quando alocamos um tipo primitivo em uma variável, o valor literaL é armazenado no endereço de memória associado a
 * essa variável. A esse tipo de atribuição damos o nome de "Atribuição por valor".
 *
 * - Quando alocamos um Objeto em uma variável, é armazenado um outro endereço de memória e nesse é de fato onde os
 * valores dos atributos estão armazenados. A esse tipo de atribuição damos o nome de "Atribuição por referência".
 *      - Por isso, quando tentamos imprimir um objeto apenas inserindo o nome da variável que o armazena, um valor
 *      estranho aparece na tela, pois ela não armazena valores, e sim um endereço que indica onde os valores estão
 *      armazenados.
 */

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Data d1 = new Data(1, 6, 2022); // Um novo endereço de memória é alocado
        Data d2 = d1; // Atribuição por referência (Objeto) - O endereço de memória de "d1" é copiado para "d2"

        // As laterações serão perceptíveis tanto em "d1" quanto "d2"
        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1); // Valores de "d1" e "d2" se alteram

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c); // Valor de "c" não se altera
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int c) {
        c++;
    }
}
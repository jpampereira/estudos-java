package classe;

import java.util.Date;

/* - Como explicado na aula 'ValorVsReferencia', variáveis de tipos primitivos armazenam os valores literais em seus
 * endereços de memória (atribuição por valor), enquanto variáveis de Objetos armazenam um endereço de memória que é
 * onde de fato os vaLores que dizem respeito àquela instância estão armazenados (atribuição por referência).
 *
 * - Quando vamos realizar uma operação de igualdade utilizamos o operador '=='. Porém, em casos onde a variável
 * armazena Objetos, esse operador não será efetivo pois ele estará comparando valores de endereço de memória, e na
 * maioria das vezes, para comprovar a igualdade de objetos, comparamos os valores de seus atributos.
 *
 * - Nesse caso, devemos utilizar o método '.equals()'. Por padrão, ele já vem implementado na classe, pois é herdado
 * da classe Object (pai de todas as classes). Porém, sua implementação é muito simplória e ela apenas compara o
 * endereço de memória das duas instâncias (mesma coisa que utilizar o ==). Portanto, é necessário sobreescrever esse
 * método e reescrevê-lo de acordo com as suas necessidade.
 *
 * - O HashCode é utilizado por algumas formas de busca para realizar um filtro nos elementos do conjunto em questão
 * antes de realizar a operação de Equals. Isso se deve ao fato da operação do Equals ser muito custosa, portanto, em
 * cenários onde o desempenho da aplicação deve ser levado em consideração, é interessante utilizar esses métodos que
 * se utilizam do HashCode. Assim como o Equals, ele possui uma implementação padrão herdada da classe Object que deve
 * ser sobrescrita de acordo com as necessidades da sua aplicação.
 *      - Exemplo: O HashCode verifica o número de caracteres de um atributo de determinado grupo de elementos e exclui
 *      aqueles que possuírem um comprimento diferente, diminuindo o tamanho da lista onde deve ser realizada a pesquisa.
 */

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1 == u2); // Compara os endereços de memória
        System.out.println(u1.equals(u2)); // ".equals()" implementado - Comparando atributos
        System.out.println(u2.equals(u1));
        System.out.println(u1.equals(new Date()));
    }

    // O hashcode será abordado em outra aula!
}
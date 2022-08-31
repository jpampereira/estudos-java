package oo.composicao;

public class Composicao {
    /* - Uma das vantagens do paradigma de Programação Orientada à Objetos é o reaproveitamento de código. Uma das
     * formas é fazer esse reaproveitamento através da composição, onde um determinado Objeto é decomposto em vários
     * outros Objetos, que juntos, representam algo maior.
     *
     * - Exemplo: um Carro possui diversos componentes, como Motor, Freio, Portas, etc. Podemos criar uma Classe para
     * cada um desses elementos e a Classe Carro conter todos eles, através de atributos.
     *
     * - Os relacionamentos da composição podem ser da seguinte forma:
     *      1. Relacionamento '1 pra 1': Um Carro possui um único Motor, assim como um Motor está relacionado com um
     *      único Carro;
     *      2. Relacionamento '1 pra Muitos': Um Cliente pode fazer várias Compras, porém, uma Compra está relacionada
     *      a um único Cliente;
     *      3. Relacionamento 'Muitos pra Muitos': Um Aluno pode estar matriculado em vários Cursos, assim como um Curso
     *      pode ser realizado por vários Alunos.
     *
     * - Esses relacionamentos podem ser unidirecionais ou bidirecionais, vai dependender da necessidade de cada
     * aplicação.
     *      - Exemplo: Na Classe Cliente há um atributo que é a lista de compras realizadas pelo mesmo. È necessário
     *      manter um atributo na Classe Compra para identificar a qual Cliente aquela compra pertence?
     */
}
package classe;

public class Metodos {
    /* MÉTODOS
     *
     * - Os métodos estão relacionados as ações de um Objeto.
     *
     * - Anatomia do método: tipoRetorno nomeMetodo (tipoParametro nomeParametro, ...) { ... }
     *      - Caso o método retorne algum valor para o ponto em que ele foi invocado, deve ser utilizada a palavra
     *      reservada return e o tipo do mesmo deve ser informado (Exemplo: um método que retorna a soma de dois
     *      números inteiros tem um retorno do tipo inteiro);
     *      - Caso o método não retorne nada, utilizar o tipo "void" (vazio);
     *      - O nome do método, por convenção, começa com letra maiúscula e utiliza o padrão Camel Case;
     *      - Entre parênteses, devem ser inseridos todos os parâmetros que podem ser passados na chamada da função,
     *      informando seu tipo e nome.
     *
     * - O nome do método mais os seus parâmetros formam sua assinatura;
     *      - Ou seja, o tipo do retorno não é levado em consideração!
     *
     * - É possível ter dois métodos com o mesmo nome, em uma mesma classe, desde que suas assintaturas sejam
     * diferentes.
     *
     * class Exemplo {
     *      int soma(int a, int b) {
     *              return a + b;
     *      }
     *
     *      int soma(int a, int b, int c) {
     *              return a + b + c;
     *      }
     * }
     *
     * Os dois métodos possuem o mesmo nome, mas uma quantidade diferente de parâmetros.
     *
     * - Dado o exemplo acima, caso fosse inserido o seguinte método:
     *
     * int soma(int x, int y) {
     *      return x + y;
     * }
     *
     * O mesmo não seria permitido, pois a assinatura não leva em consideração o nome dos parâmetros e sim o seu tipo.
     *
     * - Já isso seria permitido:
     *
     * double soma(double a, double b) {
     *      return a + b;
     * }
     *
     * Pois mesmo que a quantidade de parâmetros seja a mesma, seus tipos variam.
     */

    /* CONSTRUTORES
     *
     * - O construtor é um método que leva o mesmo nome da classe e é  chamado na criação do objeto.
     *
     * - Exemplo:
     *
     * class MinhaClasse { ... }
     *
     * MinhaClasse obj = new MinhaClasse();
     *
     * -MinhaClasse = Classe
     * -MinhaClasse() = Método Construtor
     *
     * - Ele é um tipo de método especial e não possui o tipo retorno. Caso o tipo de retorno seja inserido, ele passa
     * a ser um método normal e não mais um construtor.
     *
     * - Dentro dele podemos definir o que ocorre quando há a instanciação da classe. Exemplo: definir valores padrões
     * pros atributos ou alocar os valores passados como parâmetros para os mesmos.
     *
     * - Toda classe possui um método construtor padrão, mesmo que ele não seja escrito explicitamente em código. Ele é
     * equivalente ao método construtor abaixo:
     *
     * NomeDaClasse() {
     * }
     *
     * Ou seja, ele não faz nada além de permitir a criação do objeto.
     *
     * - É possível que uma classe tenha mais de um método construtor, desde que suas assinaturas sejam diferentes.
     */
}
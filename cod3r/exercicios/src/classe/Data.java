package classe;

/* - Utilizamos a palavra reservada "this" geralmente em situações onde há o conflito de nomes entre parâmetros de
 * métodos ou variáveis locais e atributos de Objetos. Nesse caso, utilizamos o "this" antes do nome para dizermos
 * que estamos fazendo referência ao atributo do objeto.
 *
 * - Quando fazemos "this()", estamos chamando o construtor da classe em questão.
 */

/* Valor padrão:
 *
 * - byte, short, int, long -> 0
 * - float, double -> 0.0
 * - boolean -> false
 * - char -> '\u0000' - Primeiro valor da tabela UNICODE
 * - Objeto -> null (Não aponta para nenhum espaço de memória)
 *
 * - Variáveis criadas dentro do corpo da classe recebem valor padrão quando criadas, logo, podem ser utilizadas pelo
 * programa, mesmo que nunca inicializadas. O mesmo não ocorre com variáveis de métodos, que se não forem inicializadas,
 * não podem ser utilizadas, já que não recebem valor padrão.
 *
 * - Quando declaramos uma constante, obrigatoriamente precisamos inicializá-la (no máximo podemos inicializá-la no
 * construtor da classe).
 */

public class Data {
    // Atributos
    int dia;
    int mes;
    int ano;

    // Métodos Construtores
    Data() {
//        this.dia = 1;
//        this.mes = 1;
//        this.ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Métodos
    String obterDataFormatada() {
        String formato = "%d/%d/%d"; // Variável local - Visível apenas dentro do método
        return String.format(formato, this.dia, this.mes, this.ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
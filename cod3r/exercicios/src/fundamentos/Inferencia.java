package fundamentos;

/* - O Java permite fazer a inferência de tipos, não sendo necessário informar o tipo da variável
 * em sua declaração, assim como no JavaScript, por exemplo. Porém, diferente do JS, depois que um valor
 * é atribuído a essa variável, não é possível reatribuir um valor de outro tipo, apenas do mesmo.
 *
 * Exemplo:
 *
 * var a = 10; // Por inferência, o Java vai determinar que "a" é do tipo "int"
 * a = "Olá, Mundo"; // Vai dar erro, pois o Java ja determinou, por inferência, que "a" é do tipo "int"
 *
 * - Quando utilizarmos a palavra reservada "var" na declaração da variável, é necessário fazer a inicialização
 * dela na mesma linha.
 */

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5; // Variável declarada e inicializada
        System.out.println(a);

        // a = "...";

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5;

        double d; // Declaração da variável
        d = 123.45; // Inicialização da variável
        System.out.println(d); // Variável utilizada

        // Não pode fazer isso!
        // var e;
        // e = 123.45;
    }
}

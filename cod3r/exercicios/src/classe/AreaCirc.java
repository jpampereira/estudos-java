package classe;

/* - Quando utilizamos a palavra reservada "new" junto do construtor de uma determinada classe, estamos criando uma
 * instância da mesma. Nesse momento, um espaço de memória é criado para cada um dos atributos existentes nessa classe
 * para que sejam associados aos valores dessa instância. A esses atributos damos o nome de "atributos de instância".
 *
 * - Duas instâncias de uma mesma classe possuem os mesmos atributos, mas esses atributos estão associados a espaços
 * de memória diferentes.
 *
 * - Porém, se utilizarmos a palavra reservada "static" no início de um atributo (ou método), o mesmo passa a ser um
 * "atributo de classe", pois o valor passa a ser definido pela classe e não por cada uma de suas instâncias. Ou seja,
 * o mesmo valor do atributo passa a ser compartilhado entre todas as instâncias e a alteração desse valor será
 * perceptível em todas elas.
 *      - Na inicialização do programa, os atributos de classe já são associados a um espaço de memória, e caso haja a
 *      instaciação da classe, não há uma nova alocação.
 *
 * - O acesso a atributos e métodos estáticos não é feito através da instância e sim através da classe. Exemplo:
 * Math.PI e Math.pow().
 *
 * - Por questões de segurança, utilizamos atributos estáticos quando queremos nos referir a constante, pois se um valor
 * é constante, não faz sentido que um novo espaço de memória seja alocado para cada instância criada, logo,
 * economizamos memória.
 */

public class AreaCirc {
    double raio; // Atributo de instância
    static final double PI = 3.1415; // Atributo de classe

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
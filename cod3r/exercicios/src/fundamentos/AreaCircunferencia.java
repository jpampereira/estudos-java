package fundamentos;

/* - A convenção para nome de variáveis em Java é o padrão Camel Case, onde, em caso de nomes compostos de variáveis
 * essas são escritas todas juntas e cada palavra com a primeira letra maiúscula. Exemplo: RaioDoCirculo.
 *
 * - Já para constantes, a convenção é escrever o nome em caixa alta, e para casos de nomes compostos, as palavras
 * serem separadas por underline. Exemplo: TAXA_DE_JUROS;
 */
public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159; // A palavra reserva "final" indica que "pi" é uma constante

        double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}

package controle;

/* - Devemos definir qual estrutura de repetição utilizar de acordo com a situação.
 *
 * - Se o número de repetições for pré-determinada, a estrutura mais adequada é o "for".
 * Exemplo: "Repita o seguinte código 10 vezes"
 *
 * - Caso o número de repetições seja indeterminado, a estrutura mais adequada é o "while".
 * Exemplo: "Enquanto x for maior do que zero, execute o seguinte código"
 */

public class For1 {
    public static void main(String[] args) {
        // Utilizando "while"
//        int contador = 1;
//
//        while (contador <= 10) {
//            System.out.printf("contador = %d%n", contador);
//            contador++;
//        }

        // Utilizando "for"
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("contador = %d%n", contador);
        }

//        int x = 2;
//        for (; x < 10;) {
//            System.out.println("x = " + x);
//            x++;
//        }

        // Laço infinito
//        for(;true;) {
//            System.out.println("Fim!");
//        }
    }
}

package controle;

/* - A palavra reservada "break" interrompe de forma abrupta o fluxo de execução natural do código.
 *
 * - Você pode utilizá-lo na estrutura "switch", como já visto anteriormento e em laços de repetição (while e for).
 *
 * - No caso dos laços de repetição, o "break" faz com que o código interrompa a execução do loop e continue
 * a execução no ponto seguinte após a estrutura de repetição.

 */
public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        // O fluxo continua daqui após o break...

        System.out.println("Fim!");
    }
}
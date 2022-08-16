package controle;

/* - O break permite que nós criemos rótulos para determinar de qual ponto do código queremos que o fluxo
 * encerre a execyção.
 *
 * - Evitar ao máximo o uso desse artifício pois torna o código mais difícil de ler.
 */

public class BreakRotulado {
    public static void main(String[] args) {
        // Podemos dar qualquer nome ao rótulo
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    break externo;
                    /* Sem o uso do rótulo, o fluxo sairia do for mais interno e continuaria sua execução no for
                     * mais externo. Porém, com o uso de rótulos, definimos que caso o "break" seja executado, o
                     * fluxo de execução do for mais externo que será interrompido
                     */
                }

                System.out.printf("[%d %d] ", i, j);
            }

            // Sem rótulo a execução do código continuaria daqui...

            System.out.println();
        }

        // Com o uso do rótulo, a execução do código continua daqui
    }
}
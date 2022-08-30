package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* - O <> (Diamond) é utilizado para definir o tipo que a Collection pode armazenar, tornando-a uma estrutura homogênea.
 *
 * - 'Set' é uma Interface e a partir delas existe diferentes implementações, como 'HashSet'.
 *      - 'HashSet' é a implementação padrão da Collection e a mais utilizada
 *
 * - Outra Interface é a 'SortedSet' (que extende 'Set). Uma de suas possíveis implementações é a 'TreeSet'.
 *      - 'TreeSet' respeita a ordem de inserção dos elementos na estrutura. No caso de valores numéricos, os
 *      ordena do menor para o maior.
 */

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaAprovados = new TreeSet<String>();
        // lista.add(1.2); // Não permite, apenas Strings
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int num: nums) {
            System.out.println(num);
        }
    }
}
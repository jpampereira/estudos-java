package colecoes;

import java.util.ArrayList;
import java.util.List;

/* - List é uma Interface implementada por diversas Classes:
 *
 * - A Classe 'ArrayList' implementa uma lista utilizando Arrays que caso sua capacidade seja atingida, o mesmo é
 * realocado dinamicamente para um com 50% a mais do tamanho, isto é, caso o Array possua 10 posições e as 10 estejam
 * preenchidas, seu tamanho é dobrado para 15.
 *
 * - A Classe 'Vector' possui implementação identica a de 'ArrayList' com dois diferenciais: sua lista não aumenta 50%
 * e sim o dobro (Para um Array de 10 posições, ao atingir seu limite o mesmo é dobrado para 20) e é sincronizado, ou
 * seja, é suportado por aplicações thread-safe.
 *
 * - A Classe 'LinkedList' implementa a Estrutura de Dados 'Lista Duplamente Ligada'.
 *
 * - ArrayList's possuem melhor performance em operações de acesso sobrescrita de elementos (acesso direto pelo índice),
 * de enquanto LinkedList's se destacam em operações de adição e remoção de elementos.
 */

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu")); // Permite repetição

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }

        System.out.println(lista.get(3)); // Acessa pelo índice

        System.out.println(">>>>> " + lista.remove(1)); // Retorna o Objeto
        System.out.println(lista.remove(new Usuario("Manu"))); // Retorna 'true' pois conseguiu remover

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        System.out.println("Tem? " + lista.contains(u1));

        // Os métodos 'remove' e 'contains' utilizam o método 'equals' para buscar pelos elementos em questão

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}
package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet(); // Armazena dados de diferentes tipos

        conjunto.add(1.2); // double -> Double - Faz a conversão automática
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add('x'); // Não adiciona, pois 'x' já encontra-se no conjunto

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("x")); // Devolve 'true', pois encontrou 'x' e removeu
        System.out.println(conjunto.remove("teste")); // Devolve 'false', pois não encontrou "teste" no conjunto

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x')); // Devolve 'false', pois não encontrou 'x' - Já foi removido
        System.out.println(conjunto.contains(1)); // Devolve 'true', pois encontrou 1
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet(); // Será visto em OO

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums); // Imprime o conjunto
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Intersecção entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); // Remove todos os dados da Collection
        System.out.println(conjunto);
    }
}

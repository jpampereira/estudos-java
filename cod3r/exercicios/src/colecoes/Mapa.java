package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Roberto"); // Adicionou o elemento com a chave '1'
        usuarios.put(1,"Ricardo"); // Sobrescreveu o valor associado a chave '1'
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // Retorna as chaves
        System.out.println(usuarios.values()); // Retorna os valores
        System.out.println(usuarios.entrySet()); // Retorna chaves e valores

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4)); // Retorna o valor a partir da chave passada como parâmetro
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));

        // Iterando as chaves
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        // Iterando os valores
        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        // Iterando por elemento (chave e valor)
        for (Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " =====> ");
            System.out.println(registro.getValue());
        }
    }
}
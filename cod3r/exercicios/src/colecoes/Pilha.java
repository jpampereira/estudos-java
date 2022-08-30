package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

// 'peek', 'element', 'poll' e 'remove' possuem funcionamento semelhante aos vistos em 'Queue'

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Príncipe"); // Retorna 'false' caso não consiga adicionar o elemento
        livros.push("Don Quixote"); // // Retorna uma exceção caso não consiga adicionar o elemento
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop()); // Retorna uma exceção caso a pilha estiver vazia
        // System.out.println(livros.remove());

        // livros.size();
        // livros.clear();
        // livros.contains();
    }
}
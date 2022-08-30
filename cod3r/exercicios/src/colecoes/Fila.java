package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        // Offer e Add -> Adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Obter o próximo elemento da fila (sem removê-lo)
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // Retorna 'null'
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        // Poll e Remove -> Removem o próximo elemento da fila
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // Retorna 'null'
        // System.out.println(fila.remove()); // Lança uma exceção

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);
    }
}
package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    final Cliente cliente;
    final ArrayList<Item> itens = new ArrayList<Item>();

    Compra(Cliente cliente) {
        this.cliente = cliente;
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco);
        Item item = new Item(produto, quantidade);

        this.itens.add(item);
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");

        Compra compra1 = new Compra(cliente);
        compra1.adicionarItem("Playstation 5", 4499.99, 1);
        compra1.adicionarItem("Jogo PS5", 350.00, 2);
        compra1.adicionarItem("Controle PS5", 379.99, 1);

        Compra compra2 = new Compra(cliente);
        compra2.adicionarItem("Álbum Copa do Mundo", 12.00, 1);
        compra2.adicionarItem("Pacotinhos", 4.00, 50);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.printf("Olá, %s! O valor total das suas compras foi R$ %.2f.\n", cliente.nome, cliente.obterValorTotal());
    }
}
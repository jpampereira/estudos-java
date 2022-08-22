package classe;

public class Produto {
    // Atributos
    String nome;
    double preco;
    static double desconto = 0.25;

    // Métodos Construtores
    Produto() {

    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    // Métodos
    double precoComDesconto() {
        return preco * (1- desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1- desconto + descontoGerente);
    }
}
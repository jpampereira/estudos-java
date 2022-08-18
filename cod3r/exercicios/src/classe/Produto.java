package classe;

public class Produto {
    // Atributos
    String nome;
    double preco;
    double desconto;

    // Métodos Construtores
    Produto() {

    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    // Métodos
    double precoComDesconto() {
        return preco * (1- desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1- desconto + descontoGerente);
    }
}
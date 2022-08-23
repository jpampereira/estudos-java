package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            System.out.printf("Comendo %s...\n", comida.nome);
            this.peso += comida.peso;
        }
    }
}
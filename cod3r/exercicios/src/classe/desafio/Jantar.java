package classe.desafio;

/* Desafio: Criar três classes: Pessoa, Comida e Jantar. A classe Jantar conterá o método "main" e nela você deve
 * instanciar uma pessoa e algumas comidas e fazer com que essa pessoa coma essas comidas e mostrar o seu peso antes
 * e depois do jantar.
 */

public class Jantar {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 93.5);

        Comida c1 = new Comida("Arroz", 0.350);
        Comida c2 = new Comida("Feijão", 0.430);
        Comida c3 = new Comida("Frango", 0.280);

        System.out.printf("Nome: %s.\n", p.nome);
        System.out.printf("Peso antes de jantar: %.2f kg.\n", p.peso);

        System.out.println("\nHora da janta!");
        p.comer(c1);
        p.comer(c2);
        p.comer(c3);

        System.out.printf("\nPeso depois de jantar: %.2f kg.\n", p.peso);
    }
}
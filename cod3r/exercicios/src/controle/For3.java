package controle;

public class For3 {
    public static void main(String[] args) {
        int i;

        for (/*int*/ i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Saiu do for...");
        System.out.println(i);

        /* Se a variável de controle "i" for declarada dentro da estrutura do "for", não será possível acessá-la
         * fora, pois ela existe apenas no contexto daquele bloco.
         */
    }
}

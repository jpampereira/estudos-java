package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio...");
        System.out.println(++a == b--); // true
        System.out.println(a);
        System.out.println(b);

        /* Explicação: no operador pré-fixado, a operação de incremento é realizada antes de qualquer coisa,
         * enquanto no pós-fixado, o decremento é realizado como última etapa. Logo, o incremento em "a" é realizado,
         * a comparação entre "a" e "b" é feita e só depois ocorre o decremento de "b".
         */
    }
}

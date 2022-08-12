package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a'; // Será armazenado em "b" o número 97, que é a posição da letra na tabela UNICODE

        System.out.println(a == b); // Logo, será impresso "true"

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}

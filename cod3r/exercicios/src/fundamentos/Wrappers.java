package fundamentos;

import java.util.Scanner;

/* - Quando utilizamos os Wrappers, damos poderes aos tipos primitivos possibilitando o acesso a atributos e
 * métodos a partir deles, "empacotando-os" em Objetos;
 *
 * - Quando queremos utilizar Wrappers, colocamos o nome do tipo com letra maiúscula (com exceção de int e char que
 * viram Integer e Character).
 */

public class Wrappers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //Integer.parseInt(entrada.next()); // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");
    }
}
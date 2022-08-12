package fundamentos;

/* Tudo em Java é Objeto (ou seja, podemos utilizar a notação ponto para acessar seus atributos
 * e métodos), menos os tipos primitivos. Porém, podemos dar mais poderes a esses tipos primitivos
 * utilizando os Wrappers.
 */

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        //String s = new String("texto");
        String s = "texto"; // Sugar syntax da linguagem
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos primitivos!
        int a = 123;
        System.out.println(a);
    }
}
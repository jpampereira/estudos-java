package fundamentos;

/* - A palavra reservada "import" fica fora da classe, em cima;
 * - O pacote "java.lang" é o pacote mais básico da linguagem Java e não precisa ser importado;
 * - O "import" é utilizado pata importar funcionalidades de bibliotecas que não a padrão, assim como outras classes
 * da sua aplicação.
 */

//import javax.swing.*;
import java.util.Date;

public class Import {
    public static void main(String[] args) {
        java.lang.String b = "Boa tarde!";
        java.lang.System.out.println(b);

        String s = "Bom dia!";
        System.out.println(s);

        Date d = new Date();

//        JButton botao = new JButton();
    }
}

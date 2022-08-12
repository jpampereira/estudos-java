package fundamentos;

/* - Ao final da inserção de um dado de entrada solicitado pela aplicação, pressionamos o "enter" para indicarmos o
 * final da operação. Nesse momento é inserido um caractere de quebra de linha (\n) e enviado junto do que foi digitado
 * pelo usuário. Porém, há um problema com o ".nextInt()" e ".nextDouble()" (e todos os outros métodos de entrada de
 * dados de tipos numéricos), onde esse "\n" é ignorado e permanece no buffer de entrada da aplicação, gerando um
 * problema. Para contornarmos, podemos inserir um ".nextLine()" após cada captura de dados de entrada de tipo numérico.
 *
 * - A diferença entre ".next()" e ".nextLine()" é que o primeiro aceita apenas uma única palavra, enquanto o segundo
 * aceita frases.
 *
 * Exemplo:
 *
 * Scanner teclado = new Scanner(System.in);
 *
 * System.out.print("Digite uma frase: "); // Frase digitada: Olá, Mundo!
 *
 * // Utilizando .next()
 * String frase = teclado.next(); // frase = "Olá,"
 *
 * // Utilizando .nextLine()
 * String frase = teclado.nextLine(); // frase = "Olá, Mundo!"
 */

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n"); // Imprime a string no console

        System.out.println("Bom"); // Imprime a string no console e pula pra linha seguinte
        System.out.println(" dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d",
                1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f%n", 1234.5678); // %n quebra linha como \n
        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();
    }
}

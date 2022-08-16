package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = "";

        // Execute o seguinte bloco de código enquanto o usuário não digitar "Sair"
        while (!frase.equalsIgnoreCase("Sair")) {
            System.out.print("Digite alguma coisa: ");
            frase = scanner.nextLine();
        }

        System.out.println("Fim!");

        scanner.close();
    }
}
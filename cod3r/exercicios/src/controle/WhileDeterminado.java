package controle;

// Enquanto a expressão de while tiver dando "true", o bloco de código será executado
// Quando a expressão de while for "false", o fluxo continua sua execução

public class WhileDeterminado {
    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 10) { // Enquanto "contador" for menor ou igual a 10, executar o seguinte bloco de código
            System.out.printf("contador = %d%n", contador);
            contador++; // Incremento do contador
        }

        // Quando while for "false", a execução continua desse ponto...
    }
}

package controle;

public class For4 {
    public static void main(String[] args) {
        // For aninhado - Muito utilizado para percorrer matrizes
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}
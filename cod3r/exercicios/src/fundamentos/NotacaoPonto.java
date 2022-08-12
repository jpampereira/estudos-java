package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "João".toUpperCase();

        System.out.println(x);

        // Podemos quebrar a linha antes ou depois do ponto
        String y = "Bom dia X"
                .replace("X", "Pedro") // Retorna String
                .toUpperCase() // Retorna String
                .concat("!!!"); // Retorna String

        System.out.println(y);

        // Tipos primitivos não tem o operador "."
    }
}

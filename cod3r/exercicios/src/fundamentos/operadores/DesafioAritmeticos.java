package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
//        int a = 2 + 3 * 4;
//        int b = (int) Math.pow(a, 3); // Cálculo da potência
//        double c = Math.pow(a, 3);
//
//        System.out.println(b);
//        System.out.println(c);

        double numeradorA = Math.pow(6 * (3 + 2), 2);
        double denominadorA = 3 * 2;

        double numeradorB = (1 - 5) * (2 - 7);
        double denominadorB = 2;

        double superiorA = numeradorA / denominadorA;
        double superiorB = Math.pow(numeradorB / denominadorB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        int resultado = (int) (superior / inferior);

        System.out.println(resultado);
    }
}

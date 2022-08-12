package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultado1 = media >= 7.0 ? "aprovado" : "reprovado";
        System.out.println("O aluno está " + resultado1 + ".");

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado2 = temDesconto ? "Sim." : "Não.";
        System.out.println("Tem desconto? " + resultado2);
    }
}

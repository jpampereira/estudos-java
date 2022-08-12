package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        // Se V nos dois, comprar TV de 50 polegadas
        // Se V em apenas um, comprar TV de 32 polegadas
        // Se V em pelo menos um dos dois, tomou sorvete
        // Se V em nenhum deles, pelo menos está mais saudável

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean tv50Polegadas = trabalhoTerca && trabalhoQuinta;
        boolean tv32Polegadas = trabalhoTerca ^ trabalhoQuinta;
        boolean sorvete = trabalhoTerca || trabalhoQuinta;
        boolean saudavel = !sorvete;

        System.out.println("Comprou TV de 50 polegadas? " + tv50Polegadas);
        System.out.println("Comprou TV de 32 polegadas? " + tv32Polegadas);
        System.out.println("Comprou sorvete? " + sorvete);
        System.out.println("Mais saudável? " + saudavel);
    }
}
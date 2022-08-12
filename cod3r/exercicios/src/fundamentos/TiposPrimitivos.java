package fundamentos;

/* - A diferença entre os tipos de um mesmo grupo é a capacidade de armazenamento;
 *
 * - 1 byte = 8 bits (bit mais significativo indica se o número é positivo ou negativo);
 *
 * - Quando escrevemos um número de forma literal no script, por padrão o Java utiliza "int" para números inteiros
 * e double para números reais. Para indicarmos ao interpretador que o nosso número é do tipo float, devemos inserir
 * a letra F no final do número. Para indicarmos que o número é do tipo long, devemos inserir um L no final;
 *
 * - Para números grandes, podemos utilizar o _ para separar as casas dos milhares;
 *
 * - A conversão de um tipo menor para maior acontece naturalmente, já que subentende-se que se o valor cabe no tipo
 * menor, vai caber no maior. No caso contrário, é necessário explicitar a operação e pode não ser bom pois pode haver
 * inconsistência nos dados.
 */

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos númericos inteiros
        byte anosDeEmpresa = 23; // 1 byte
        short numeroDeVoos = 542; // 2 bytes
        int id = 56789; // 4 bytes
        long pontosAcumulados = 3_234_845_223L; // 8 bytes

        // Tipos numéricos reais
        float salario = 11_445.44F; // 4 bytes
        double vendasAcumuladas = 2_991_797_103.01; // 8 bytes

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // NúmeroDeViagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
package fundamentos;

public class JREVsJDK {
    /* - Quando desejamos apenas executar aplicações Java em nosso computador, precisamos baixar apenas o JRE (Java
     * Runtime Environment - Ambiente de Execução Java). Porém, se o objetivo for desenvolver aplicações em Java, é
     * necessário instalar o JDK (Java Development Kit - Kit de Desenvolvimento Java), que já contém a JRE.
     *
     * - Os Sistemas Operacionais e os processadores possuem particularidades, o que implica na necessidade de
     * realizar alterações no código, na maioria das linguagens, dependendo da plataforma onde o mesmo será executado.
     *
     * - A linguagem Java é uma linguagem híbrida, ou seja, é tanto compilada quanto interpretada. Ela segue o
     * conceito de WORA (Write Once, Run Anywhere - Escreva uma vez, Execute em qualquer lugar), onde é possível
     * escrever um código Java e compilá-lo em uma máquina/Sistema Operacional específico e executá-lo (interpretá-lo)
     * em qualquer outra plataforma.
     *
     * - Programas Java são escritos em arquivos ".java". A compilação gera um código intermediário de extensão
     * ".class" chamado de Bytecode. Para executar esse código, é necessário utilizar uma JVM (Java Virtual Machine -
     * Máquina Virtual Java) que realizará a interpretação do código para a plataforma no qual ela está instalada
     * e em seguida executá-lo.
     *
     * - O compilador Java está presente na JDK, enquanto a JVM está presente no JRE.
     *
     * - As IDEs como Intellij, Eclipse e NetBeans já realizam o processo de compilação e interpretação do código
     * automaticamente quando executamos o nosso código através dela, porém, se realizarmos esse mesmo processo via
     * linha de comando, precisamos realizar duas operações:
     *
     * javac MeuPrograma.java
     * java MeuPrograma
     *
     * - O comando "javac" realiza a compilação do arquivo ".java", gerando um arquivo do tipo ".class" (Bytecode),
     * enquanto o comando "java" chama a JVM para interpretar e executar o Bytecode gerado pelo comando anterior
     * (não é necessário passar a extensão .class nesse caso).
     *
     * - Ainda é possível passar parâmetros na execução do arquivo, que serão armazenados em "args" e poderão ser
     * utilizados pelo programa em questão. Veja o código dessa classe.
     *
     * No programa Java:
     *
     * public static void main(String[] args) { }
     */
    public static void main(String[] args) {
        // Na linha de comando:
        // javac MeuPrograma.java
        // java MeuPrograma Joao 25 desenvolvedor

        String nome = args[0]; // Joao
        int idade = Integer.parseInt(args[1]); // 25
        String profissao = args[2]; // desenvolvedor

        System.out.printf("Olá, meu nome é %s, tenho %d anos e trabalho como %s.\n", nome, idade, profissao);
        // Olá, meu nome é Joao, tenho 25 anos e trabalho como desenvolvedor.
    }
}

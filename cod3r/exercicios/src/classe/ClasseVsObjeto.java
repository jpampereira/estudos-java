package classe;

public class ClasseVsObjeto {
    /* - O paradigma de Orientação à Objetos nos permite modelar com maior precisão questões do mundo real
     * para softwares.
     *
     * - Objeto é toda e qualquer coisa abstrata ou física do nosso dia-a-dia, como por exemplo, um carro, uma caneta,
     * um banco, uma pessoa, etc.
     *
     * - Tod objeto é formado por atributos (características) e métodos (coisas que se pode fazer).
     *      - Exemplo: O objeto carro possui, entre vários outros, o atributo "cor" e o método "frear".
     *
     * - Anatomia de uma classe:
     *      1. Palavra reservada "class" (Antes de "class", podem ser inseridos modificadores que serão apresentados
     *      mais a frente);
     *      2. Por convenção, o nome de uma classe começa com letra maiúscula e utiliza-se o padrão Camel Case para
     *      escrita;
     *      3. Após o nome da classe também podem ser inseridos modificadores que serão vistos mais a frente;
     *      4. Membros da classe
     *
     * - Uma classe define um tipo de dados (estrutura de dados) personalizado para atender determinada necessidade.
     *      - Exemplo: Não faz sentido uma linguagem de programação conter um tipo para manipulação de uma agenda.
     *      Caso essa seja a necessidade do seu programa, você pode criá-lo utilizando classes.
     *
     * - Uma classe representa uma abstração (ou simplificação) do mundo real.
     *      - Exemplo: Pensando num sistema bancário. Devemos ter uma classe que represente os clientes desse banco.
     *      Porém, esse cliente tem diversas características que não são relevantes para um sistema bancário, como,
     *      altura, peso, cor dos olhos, etc. Logo, a ideia da abstração é que ao modelarmos um objeto, ignoremos
     *      todos os atributos e métodos que não serão relevantes a nossa aplicação e implementemos apenas o que
     *      for necessário.
     *      - Já pensando no sistema de um hospital, essas informações serão importantes de se armazenar sobre o cliente
     *      (paciente), enquanto outras informações presentes no modelo de cliente de banco podem ser ignoradas.
     *      - Tudo depende do contexto da aplicação.
     *
     * - Objetos podem fazer parte de outros objetos, formando relacionamentos.
     *
     * - A Classe é a definição da estrutura de dados (molde), enquanto o Objeto são os dados armazenados nos atributos
     * dessas classes.
     *      - Analogia: A partir de uma forma de bolo, podemos fazer vários bolos de um mesmo formato (Classe). O que
     *      vai diferenciar um bolo do outro é o seu conteúdo interno, como por exemplo, o sabor (Objeto).
     *
     * - Quando criamos um objeto a partir de uma classe, utilizamos o termo "instanciação".
     *
     * - Exemplo:
     *
     * Classe Produto: Nome, Preço, Desconto
     * Objeto 1: Notebook, R$ 4200,00, 15%
     * Objeto 2: Celular, R$ 1800,00, 20%
     *
     * - O que são os membros de uma classe: Atributos, métodos, construtores e até mesmo outras classes.
     *      - Atributos pode ser tanto variáveis quanto constantes;
     *      - Atributos e métodos podem ser tanto da Classe quanto do Objeto (palavra reservada "static" - Será visto
     *      mais a frente).
     *      - Para acessar um membro: objeto.membro
     */
}
package oo.composicao;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    ArrayList<Curso> cursos = new ArrayList<Curso>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        Curso procurado = null;

        for (Curso curso: this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return procurado;
    }

    /* O método '.toString()' define como o Objeto será impresso para o usuário. Por padrão, ele é implementado pela
     * Classe Object, mas pode ser sobrescrito para atender a necessidade da aplicação, como nesse caso.
     */
    public String toString() {
        return nome;
    }
}
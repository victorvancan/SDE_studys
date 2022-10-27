package br.com.GerenciadorDeCursos;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class TestaCursoComAlunos {
    public static void main(String[] args) {
        Curso javacolecoes = new Curso("dominando as colecoes", "Paulo Silveira");

        javacolecoes.adiciona(new Aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new Aula("Criando uma aula", 20));
        javacolecoes.adiciona(new Aula("Modelando listas", 28));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 78512);
        Aluno a3 = new Aluno("Victor Vancan", 852147);

        javacolecoes.matricula(a1);
        javacolecoes.matricula(a2);
        javacolecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javacolecoes.getAlunos().forEach(System.out::println);

        System.out.println("O Alunos " + a1 + "esta matriculado: ");
        System.out.println(javacolecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println(javacolecoes.estaMatriculado(turini));

        System.out.println(a1.equals(turini));

        Set<Aluno> alunos = javacolecoes.getAlunos();
        Iterator<Aluno>  iterador = alunos.iterator();
        while (iterador.hasNext())
        {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }
    }
}

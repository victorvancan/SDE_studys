package br.com.GerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javacolecoes = new Curso("dominando as colecoes", "Paulo Silveira");

//        javacolecoes.getAulas().add(new Aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new Aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new Aula("Criando uma aula", 20));
        javacolecoes.adiciona(new Aula("Modelando listas", 28));

        List<Aula> aulasImutaveis = javacolecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javacolecoes.getTempoTotal());
        System.out.println(javacolecoes);

    }
}

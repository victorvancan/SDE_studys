package br.com.GerenciadorDeCursos;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Victor Vancan");
        alunos.add("Nico Steppat");
        alunos.add("Rodrigo sheppard");
        alunos.add("Sergio lopes");
        alunos.add("Alberto Souza");
        alunos.add("Mauricio Aniche");

        boolean pauloMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloMatriculado);

        System.out.println(alunos.size());

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {System.out.println(aluno);});
    }
}

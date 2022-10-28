package br.com.java8;

import java.util.*;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

}


public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));


//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
//        cursos.stream().map(Curso::getAlunos).filter(alunos -> alunos >= 100).forEach(System.out::println);
//       int sum = cursos.stream().mapToInt(Curso::getAlunos).filter(alunos -> alunos >= 100).sum();

        OptionalDouble media = cursos.stream().mapToInt(Curso::getAlunos).filter(alunos -> alunos >= 100).average();

//        System.out.println(sum);

//        Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();
//
//        List<Curso> resultado = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
//        Curso curso = optionalCurso.get();
//        System.out.println(curso.getNome());

//        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
        Map mapa = cursos
                .stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

        System.out.println(mapa);
    }
}
package br.com.GerenciadorDeCursos;

public class TesteBusca {
    public static void main(String[] args) {
        Curso javacolecoes = new Curso("dominando as colecoes", "Paulo Silveira");

        javacolecoes.adiciona(new Aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new Aula("Criando uma aula", 20));
        javacolecoes.adiciona(new Aula("Modelando listas", 28));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 78512);
        Aluno a3 = new Aluno("Victor Vancan", 852147);
        Aluno a4 = new Aluno("Anderson Vancan", 852147);

        javacolecoes.matricula(a1);
        javacolecoes.matricula(a2);
        javacolecoes.matricula(a3);
        javacolecoes.matricula(a4);

        System.out.println(javacolecoes.getAlunos());
        System.out.println("Quem é o aluno com a matricula 34672");
        Aluno aluno = javacolecoes.buscaMatriculado(34672);
        System.out.println(aluno);
    }
}

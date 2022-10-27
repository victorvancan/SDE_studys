package br.com.GerenciadorDeCursos;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javacolecoes = new Curso("dominando as colecoes", "Paulo Silveira");

//        javacolecoes.getAulas().add(new Aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new Aula("trabalhando com arraylist", 21));
        javacolecoes.adiciona(new Aula("Criando uma aula", 20));
        javacolecoes.adiciona(new Aula("Modelando listas", 28));

        System.out.println(javacolecoes.getAulas());

    }
}

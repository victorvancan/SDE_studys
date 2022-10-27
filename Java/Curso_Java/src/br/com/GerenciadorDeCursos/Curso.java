package br.com.GerenciadorDeCursos;

import java.util.*;

public class Curso {

    private String nome;

    private String instrutor;

    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula)
    {
        this.aulas.add(aula);
    }

    public int getTempoTotal()
    {
//        int tempoTotal = 0;
//        for (Aula aula:aulas) {
//            tempoTotal += aula.getTempo();;
//        }
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal() + "]"+"\nAulas: " + this.aulas;
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
    if(!matriculaParaAluno.containsKey(numero))
    {
        throw new NoSuchElementException();
    }
     return matriculaParaAluno.get(numero);
    }
}

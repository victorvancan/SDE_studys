package br.com.GerenciadorDeCursos;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null)
        {
            throw  new NullPointerException("Nome n pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.getNumeroMatricula() + "]";
    }

    @Override
    public boolean equals(Object obj) {

        Aluno outro = (Aluno) obj;

        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}

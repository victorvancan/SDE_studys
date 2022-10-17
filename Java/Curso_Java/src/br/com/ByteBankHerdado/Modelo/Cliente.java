package br.com.ByteBankHerdado.Modelo;
/*
* Classe que representa um Cliente seus atributos e metodos
*
* @author Victor Vancan
* Version 0.1
* */
public class Cliente implements Autenticavel {
    private String nome;
    private String CPf;
    private String profissao;

    private AutenticacaoUtil autenticador;

    public Cliente()
    {
        this.autenticador = new AutenticacaoUtil();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPf() {
        return CPf;
    }

    public void setCPf(String CPf) {
        this.CPf = CPf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }
}

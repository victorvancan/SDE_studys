package br.com.JavaIo;


import java.io.Serializable;

/*
* Classe que representa um Cliente seus atributos e metodos
*
* @author Victor Vancan
* Version 0.1
* */

public class Cliente implements  Serializable {

    private String nome;
    private String CPf;
    private String profissao;
    private static final long serialVersionUID = 1L;


    public String getNome() {
        return nome;
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

}

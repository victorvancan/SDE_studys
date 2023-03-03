package br.com.loja.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CategoriaID implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String nome;
	public CategoriaID() {
		super();
	}
	public CategoriaID(String tipo, String nome) {
		
		this.tipo = tipo;
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

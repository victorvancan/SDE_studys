package br.com.loja.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
	
	@EmbeddedId
	private CategoriaID id;
	
	public Categoria()
	{
		
	}
	
	
	
	public Categoria(String nome) {
		super();
		this.id = new CategoriaID(nome, "xpto");
	}



	public String getnome() {
		return this.id.getNome();
	}
		

}

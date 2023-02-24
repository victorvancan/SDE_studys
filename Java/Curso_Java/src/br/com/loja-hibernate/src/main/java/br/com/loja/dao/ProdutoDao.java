package br.com.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.loja.modelo.Produto;

public class ProdutoDao {
	
	
	private EntityManager em;
	
	
	public ProdutoDao (EntityManager em)
	{
		this.em = em;
	}
	
	
	public void cadastrar(Produto produto)
	{
		this.em.persist(produto);
	}
	
	public Produto buscarPorId(long id) {
	return em.find(Produto.class, id);
	}
	
	public List<Produto> buscarTodos()
	{	
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	
	public List<Produto> buscarPorNome(String nome) {
        String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                        .getResultList();
	}
    public List<Produto> buscarPorNomeDaCategoria(String nome) {
        String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

}

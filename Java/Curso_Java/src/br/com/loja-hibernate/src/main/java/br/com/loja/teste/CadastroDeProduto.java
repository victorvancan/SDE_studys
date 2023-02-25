package br.com.loja.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.loja.dao.CategoriaDao;
import br.com.loja.dao.ProdutoDao;
import br.com.loja.modelo.Categoria;
import br.com.loja.modelo.Produto;
import br.com.loja.util.JPAUtil;

public class CadastroDeProduto {
	public static void main(String[] args) {
		cadastrarProduto();
		
		EntityManager em = JPAUtil.getEntityManager();
		
		ProdutoDao produtoDao = new ProdutoDao(em);
		
		Produto p = produtoDao.buscarPorId(1l);
		System.out.println(p.getPreco());
		
		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(produto -> System.out.println(p.getNome()));

	}

	private static void cadastrarProduto() {
		Categoria celualres = new Categoria("Celulares");
		Produto celular = new Produto("Xiaomi Redmi","Muito legal",new BigDecimal("800"), celualres);

		EntityManager em = JPAUtil.getEntityManager();
		
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao catergoriaDao = new CategoriaDao(em);
		
		
		em.getTransaction().begin();
		catergoriaDao.cadastrar(celualres);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}
}

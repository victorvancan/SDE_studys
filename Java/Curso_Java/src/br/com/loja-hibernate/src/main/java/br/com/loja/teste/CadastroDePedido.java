package br.com.loja.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.loja.dao.CategoriaDao;
import br.com.loja.dao.ClienteDao;
import br.com.loja.dao.PedidoDao;
import br.com.loja.dao.ProdutoDao;
import br.com.loja.modelo.Categoria;
import br.com.loja.modelo.Cliente;
import br.com.loja.modelo.ItemPedido;
import br.com.loja.modelo.Pedido;
import br.com.loja.modelo.Produto;
import br.com.loja.util.JPAUtil;
import br.com.loja.vo.RelatorioDeVendasVo;

public class CadastroDePedido {
	public static void main(String[] args) {

		popularBancoDeDados();

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		ClienteDao clienteDao = new ClienteDao(em);

		Produto produto = produtoDao.buscarPorId(1l);
		Cliente cliente = clienteDao.buscarPorId(1l);
		em.getTransaction().begin();
		Pedido pedido = new Pedido(cliente);
		pedido.adicionaItem(new ItemPedido(10, pedido, produto));

		PedidoDao pedidoDao = new PedidoDao(em);
		pedidoDao.cadastrar(pedido);

		em.getTransaction().commit();

		BigDecimal totalVendido = pedidoDao.valorTotalVendido();
		System.out.println("Valor total" + totalVendido);

		List<RelatorioDeVendasVo> relatorio = pedidoDao.relatorioDeVendas();
		relatorio.forEach(System.out::println);
	}

	private static void popularBancoDeDados() {
		Categoria celualres = new Categoria("Celulares");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celualres);

		Cliente cliente = new Cliente("Rodrigo", "12345678");

		EntityManager em = JPAUtil.getEntityManager();

		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao catergoriaDao = new CategoriaDao(em);
		ClienteDao clientedao = new ClienteDao(em);

		em.getTransaction().begin();
		catergoriaDao.cadastrar(celualres);
		produtoDao.cadastrar(celular);
		clientedao.cadastrar(cliente);
		em.getTransaction().commit();
		em.close();
	}
}

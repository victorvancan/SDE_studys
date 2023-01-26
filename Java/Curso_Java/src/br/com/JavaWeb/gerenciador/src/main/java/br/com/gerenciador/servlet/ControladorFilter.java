package br.com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.acao.Acao;

//@WebFilter("/entrada")
public class ControladorFilter  implements Filter {
 
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		HttpServletResponse response = (HttpServletResponse) servletresponse;
		
		String paramAcao = request.getParameter("acao");
		String nome;
		String nomeDaClasse ="br.com.gerenciador.acao." + paramAcao;
		
		try {
		Class<?> classe = Class.forName(nomeDaClasse);
		@SuppressWarnings("deprecation")
		Acao acao = (Acao) classe.newInstance();
		nome = acao.executa(request, response);
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")){
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/"+ tipoEEndereco[1]);
		rd.forward(request, response);
		}
		else
		{
			response.sendRedirect(tipoEEndereco[1]);
		}
//		
	}


}

package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.acao.Acao;


@WebServlet(name = "entrada", urlPatterns = { "/entrada" })
public class unicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
//		
//		HttpSession sessao = request.getSession();
//		boolean usuarioEstaLogado = (sessao.getAttribute("usuarioLogado") == null); 
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
//		
//		
//		if(usuarioEstaLogado && ehUmaAcaoProtegida)
//		{
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;
//		}
		
		
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
//		if(paramAcao.equals("ListarEmpresas"))
//		{	
//			ListarEmpresas acao = new ListarEmpresas();
//			 nome = acao.executa(request, response);
//		}
//		else if(paramAcao.equals("RemoveEmpresa"))
//		{
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("MostraEmpresas"))
//		{
//			MostrarEmpresas acao = new MostrarEmpresas();
//			nome = acao.executa(request, response);
//					
//		}
//		else if(paramAcao.equals("AlteraEmpresa"))
//		{
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//					
//		}
//		else if(paramAcao.equals("NovaEmpresa"))
//		{
//			NovaEmpresa acao = new NovaEmpresa();
//			nome =acao.executa(request, response);
//					
//		}
//		else if(paramAcao.equals("NovaEmpresaFrom"))
//		{
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome =acao.executa(request, response);
//					
//		}
		
	
	}

}

package br.com.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("Senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.exiteUsuario(login, senha);
		
		if(usuario != null)
		{   HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=ListarEmpresas";
		}
		else 
		{
			return "redirect:entrada?acao=LoginForm";
		}
	}

}

package command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import service.UsuarioService;

public class FazerCadastro implements Command{
	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nome = request.getParameter("username");
		String senha = request.getParameter("passwd");
		Usuario usuario = new Usuario();
		usuario.setUsername(nome);
		usuario.setPassword(senha);
		UsuarioService service = new UsuarioService();

		service.cadastrar(usuario);
		HttpSession session = request.getSession();
		session.setAttribute("logado", usuario);
		System.out.println("Logou "+usuario);
		response.sendRedirect("index.jsp");
	}
}

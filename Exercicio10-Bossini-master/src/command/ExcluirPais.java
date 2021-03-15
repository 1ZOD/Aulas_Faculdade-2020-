package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pais;
import service.PaisService;

public class ExcluirPais implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pId = request.getParameter("id");
		int id = Integer.parseInt(pId);
		
		Pais pais = new Pais();
		pais.setId(id);
		PaisService cs = new PaisService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		
		cs.excluir(pais.getId());
		ArrayList<Pais> lista = (ArrayList<Pais>) session .getAttribute( "lista" );
		lista.remove(Busca.busca(pais.getId(), lista));
		session.setAttribute("lista", lista);
		view = request.getRequestDispatcher("ListarPaises.jsp");
		view.forward(request, response);

	}

}

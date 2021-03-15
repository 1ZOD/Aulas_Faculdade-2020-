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

public class AlterarPais implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pId = request.getParameter("id");
		String nome = request.getParameter("nome");
		String populacaoString = request.getParameter("populacao");
		String areaString = request.getParameter("area");
		int id = Integer.parseInt(pId);
		long populacao = Long.parseLong(populacaoString);
		double area = Double.parseDouble(areaString);
		
		Pais pais = new Pais(0,nome,populacao,area);
		pais.setId(id);
		pais.setNome(nome);
		pais.setPopulacao(populacao);
		pais.setArea(area);
		PaisService cs = new PaisService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		
		cs.atualizar(pais);
		ArrayList<Pais> lista = (ArrayList<Pais>) session .getAttribute( "lista" );
		int pos = Busca.busca(pais.getId(), lista);
		lista.remove(pos);
		lista.add(pos, pais);
		session.setAttribute("lista", lista);
		request.setAttribute("pais", pais);
		view = request.getRequestDispatcher("VisualizarPais.jsp");
		view.forward(request, response);

	}

}

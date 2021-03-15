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

public class CriarPais implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String populacaoString = request.getParameter("populacao");
		String areaString = request.getParameter("area");
		long populacao = Long.parseLong(populacaoString);
		double area = Double.parseDouble(areaString);
		
		Pais pais = new Pais(0,nome,populacao,area);
		pais.setNome(nome);
		pais.setPopulacao(populacao);
		pais.setArea(area);
		PaisService cs = new PaisService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		
		cs.criar(pais);
		ArrayList<Pais> lista = new ArrayList<>();
		lista.add(pais);
		session.setAttribute("lista", lista);
		view = request.getRequestDispatcher("ListarPaises.jsp");
		view.forward(request, response);
	}
	

}

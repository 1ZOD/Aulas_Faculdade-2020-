package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pais;
import service.PaisService;

@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManterPaisController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pAcao = request.getParameter("acao");
		String pId = request.getParameter("id");
		String nome = request.getParameter("nome");
		String populacaoString = request.getParameter("populacao");
		String areaString = request.getParameter("area");
		int id= -1;
		long populacao = 0;
		double area = 0;
		try {
			id = Integer.parseInt(pId);
		} catch (NumberFormatException e) {

		}
		try {
			populacao = Long.parseLong(populacaoString);
			area = Double.parseDouble(areaString);
		} catch (NumberFormatException e) {
			
		}
		Pais pais = new Pais(0,nome,populacao,area);
		pais.setId(id);
		pais.setNome(nome);
		pais.setPopulacao(populacao);
		pais.setArea(area);
		PaisService cs = new PaisService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();

		if (pAcao.equals("Criar")) {
			cs.criar(pais);
			ArrayList<Pais> lista = new ArrayList<>();
			lista.add(pais);
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarPaises.jsp");
		} else if (pAcao.equals("Excluir")) {
			cs.excluir(pais.getId());
			ArrayList<Pais> lista = (ArrayList<Pais>) session .getAttribute( "lista" );
			lista.remove(busca(pais.getId(), lista));
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarPaises.jsp");
		} else if (pAcao.equals("Alterar")) {
			cs.atualizar(pais);
			ArrayList<Pais> lista = (ArrayList<Pais>) session .getAttribute( "lista" );
			int pos = busca(pais.getId(), lista);
			lista.remove(pos);
			lista.add(pos, pais);
			session.setAttribute("lista", lista);
			request.setAttribute("pais", pais);
			view = request.getRequestDispatcher("PaisCadastrado.jsp");
		} else if (pAcao.equals("Visualizar")) {
			pais = cs.carregar(pais.getId());
			request.setAttribute("pais", pais);
			view = request.getRequestDispatcher("PaisCadastrado.jsp");
		} else if (pAcao.equals("Editar")) {
			pais = cs.carregar(pais.getId());
			request.setAttribute("pais", pais);
			ArrayList<Pais> lista = (ArrayList<Pais>) session .getAttribute( "lista" );
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("AlterarPais.jsp");
		}

		view.forward(request, response);

	} 
	public int busca(int id, ArrayList<Pais>lista) {
		Pais to;
		System.out.println(id);
		for(int i=0;i<lista.size();i++){
			to=lista.get(i);
			System.out.println(to);
			if(to.getId() == id){
				return i;
			}
			
		}
		return-1;
	} 
	
}



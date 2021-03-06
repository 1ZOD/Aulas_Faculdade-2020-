package controller;

import java.util.ArrayList;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pais;
import service.PaisService;

@WebServlet("/listar_paises.do")
public class ListaPaisesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ListaPaisesController() {
		super(); 
	} 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String chave = request.getParameter("data[search]");
		String acao = request.getParameter("acao");
		PaisService service = new PaisService();
		ArrayList <Pais> lista = null;
		HttpSession session = request.getSession();
		if(acao.equals("buscar")) {
			if(chave != null && chave.length()>0) {
				lista = service.listarPaises(chave);
			} else {
				lista = service.listarPaises();
			}
			session.setAttribute("lista", lista);
		}else if(acao.equals("reiniciar")) {
			session.setAttribute("lista", null);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("ListarPaises.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}

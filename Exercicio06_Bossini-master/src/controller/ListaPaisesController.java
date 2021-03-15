package controller;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

@WebServlet(name="/ListarPaisesController", urlPatterns={"/index.html", "/paises"})
public class ListaPaisesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ListaPaisesController() {
		super(); 
	} 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PaisService service = new PaisService();
		List <Pais> paises = service.listar();
		request.setAttribute("paises", paises);
		request.getRequestDispatcher("Pais.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

@WebServlet("/ManterPaisController.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ManterPaisController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		long populacao = Long.parseLong(request.getParameter("populacao"));
		double area = Double.parseDouble(request.getParameter("area"));
		Pais pais = new Pais(0,nome,populacao,area);
		PaisService ps = new PaisService();
		int id = ps.criar(pais);
		pais = ps.carregar(id);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Pais Cadastrado</title></head><body>");
		out.println("id:"+pais.getId()+"<br>");
		out.println("nome:"+pais.getNome()+"<br>");
		out.println("populaçao:"+pais.getPopulacao()+"<br>");
		out.println("area:"+pais.getArea()+"<br>");
		out.println("</body></html>");
		
	}

}

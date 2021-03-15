import model.Pais;
import service.PaisService;

public class TestePais {
	public static void main(String [] args){
		Pais pais = new Pais(1,"França",12412442,3463443);
		
		PaisService ps = new PaisService();
		int id = ps.criar(pais);
		
		ps.atualizar(new Pais (id,"Alemanha",22225222,777777));
		pais = ps.carregar(id);
		System.out.println(pais);
		
		ps.excluir(id);
		
	}
}

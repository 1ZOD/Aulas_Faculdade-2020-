import java.util.ArrayList;
import java.util.List;

public class Geometria {
	public static void main(String[]args){
		List<Figura> figuras = new ArrayList<>();
		
		figuras.add(new Circulo (19));
		figuras.add(new Losango (54,10));
		figuras.add(new Retangulo (10,8));
		figuras.add(new Quadrado (10));
		figuras.add(new Triangulo (5,10));
		
		for(Figura figura : figuras ){
			System.out.println(figura.area());
		}
		
		List<Retangulo> retangulos = new ArrayList<>();
		
		retangulos.add(new Retangulo (1,2));
		retangulos.add(new Quadrado (10));
		retangulos.add(new Retangulo (3,4));
		retangulos.add(new Quadrado (11));
		
		for(int i=0;i<retangulos.size();i++) {
			System.out.println(retangulos.get(i).diagonal());
		}
	}

}

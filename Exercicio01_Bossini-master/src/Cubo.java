
public class Cubo extends Quadrado implements Solido{
	public Cubo(double aresta) {
		super(aresta);
		
	}
	
	@Override
	public double volume() {
		return super.area() * super.getBase();
		
	}
	
}


public class Esfera extends Circulo implements Solido {
	public Esfera(double raio) {
		super(raio);
		
	}
	@Override
	public double volume() {
		return super.area()* 4/3;
		
	}
}

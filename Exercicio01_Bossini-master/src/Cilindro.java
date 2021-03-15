
public class Cilindro extends Circulo implements Solido {
	private double altura;
	
	public Cilindro(double raio,double altura) {
		super(raio);
		this.altura = altura;
		
		
	}
	@Override
	public double volume() {
		return super.area() * altura;
	}

}
 

public class Piramide extends Retangulo implements Solido {
	private double comprimento;
	public Piramide(double base, double altura,double comprimento){
		super(base, altura);
		this.comprimento = comprimento;

	}
	@Override
	public double volume() {
		return super.area()* comprimento * 1/3;
	}

}

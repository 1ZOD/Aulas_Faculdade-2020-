
public class Retangulo extends Losango implements Diagonal{
	public Retangulo(double base, double altura) {
		super(base,altura);
	}
	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(super.getBase(), 2) + Math.pow(super.getAltura(), 2));
	}
	@Override
	public double perimetro() {
		return 2 * super.getBase() + 2 * super.getAltura();
	}
}

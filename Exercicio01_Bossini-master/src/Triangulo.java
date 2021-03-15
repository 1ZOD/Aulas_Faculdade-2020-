
public class Triangulo extends Poligono{
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double base, double altura){
		super(base,altura);
	
	}
	
	public Triangulo(double base,double altura,double ladoA, double ladoB, double ladoC){
		super(base,altura);
		this.ladoA= ladoA;
		this.ladoB= ladoB;
		this.ladoC= ladoC;
	}
		
	@Override
	public double area() {
		return (super.getBase() * super.getAltura()) / 2;
	}
	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}
}

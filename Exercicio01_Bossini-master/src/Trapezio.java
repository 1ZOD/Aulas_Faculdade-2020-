
public class Trapezio extends Poligono {
	private double baseMenor;
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double ladoD;
	
	public Trapezio(double baseMaior,double baseMenor,double altura){
		super(baseMaior,altura);
		this.baseMenor = baseMenor;
	}
	
	public Trapezio(double baseMaior,double baseMenor,double altura,double ladoA ,double ladoB, double ladoC,double ladoD) {
		super(baseMaior,altura);
		this.baseMenor = baseMenor;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		
		
	}
	@Override
	public double area() {
		return ((super.getBase()+ baseMenor) * super.getAltura())/2;
	}
	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC + ladoD;
	}
}

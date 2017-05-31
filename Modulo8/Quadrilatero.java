public abstract class Quadrilatero implements FiguraGeometrica{
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;

	public Quadrilatero(double l1, double l2, double l3, double l4){
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
		this.lado4 = l4;
	}
	
	public double getLado1(){
		return lado1;
	}

	public double getLado2(){
		return lado2;
	}

	public double getLado3(){
		return lado3;
	}

	public double getLado4(){
		return lado4;
	}
}
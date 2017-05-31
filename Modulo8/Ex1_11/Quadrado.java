public  class Quadrado extends Quadrilatero implements FiguraGeometrica{

	public Quadrado(double l1){
		super(l1, l1, l1, l1);
		if (l1 <= 0)
			throw new IllegalArgumentException("Valor invalido, o valor esperado e maior que 0 (zero)");

	}

	public double calcularArea(){
		return (getLado1()*getLado1());
	}
	public double calcularPerimetro(){
		return (4*getLado1());
	}
}
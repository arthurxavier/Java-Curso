public  class Retangulo extends Quadrilatero implements FiguraGeometrica{

	public Retangulo(double l1, double l2){
		super(l1, l2, l1, l2);

		if (l1 <= 0 || l2 <= 0)
			throw new IllegalArgumentException("Valor invalido, o valor esperado e maior que 0 (zero)");
		if (l1 == l2)
			throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
	}
	
	public double calcularArea(){
		return (getLado1()*getLado2());
	}
	public double calcularPerimetro(){
		return (2*getLado1() + 2*getLado2());
	}
}
class Triangulo{
	//Estado
	private PontoPlanoCartesiano[] triangulo;

	//Construtor
	public Triangulo() {
		PontoPlanoCartesiano[] triangulo = new PontoPlanoCartesiano[3];
	}

	//Metodos
	public PontoPlanoCartesiano[] getPontos(){
		return this.triangulo;
	}

	public void setX0(int x0, int y0, int x1, int y1, int x2, int y2){
		this.triangulo[0].setX(x0);
		this.triangulo[0].setX(y0);

		this.triangulo[0].setX(x1);
		this.triangulo[0].setX(y1);

		this.triangulo[0].setX(x2);
		this.triangulo[0].setX(y2);
	}
}
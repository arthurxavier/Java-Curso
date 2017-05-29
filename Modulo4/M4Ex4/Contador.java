class Contador {
	private double valorInicial;
	private double valorAtual;
		
	public Contador(double valorInicial) {
		this.valorInicial=valorInicial;
		this.valorAtual = this.valorInicial;
	}

	public void informaValorInicial(){
		System.out.println(""+this.valorInicial);
	}

	public void incrementarValor(){
		this.valorAtual++;
	}

	public void decrementarValor(){
		this.valorAtual--;
	}

	public void informaValorAtual(){
		System.out.println(""+this.valorAtual);
	}
}
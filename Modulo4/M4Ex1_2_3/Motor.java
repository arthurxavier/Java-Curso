class Motor {
	//Estado
	private Integer potencia = 1;

	//Construtor
	public Motor(Integer potencia) {
		if(potencia >= 1 && potencia <= 100)
			this.potencia = potencia;
		else if(potencia < 1)
			this.potencia = 1;
		else if(potencia > 100)
			this.potencia = 100;
	}

	//Metodos
	public Integer getPotencia() {
		return potencia;
	}
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	
/*	
	public void imprimeDadosMotor(){
		System.out.println("Potencia: "+potencia);
	}
*/
}
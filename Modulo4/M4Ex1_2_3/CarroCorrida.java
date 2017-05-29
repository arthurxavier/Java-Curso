class CarroCorrida {
	//Estado
	private Integer numeroIdentificacao;
	private Double velocidadeAtual = 0.0;
	private Double velocidadeMaxima = 100.0;
	private Piloto piloto;
	private Motor motor;

	//Construtor
	public CarroCorrida(Integer numeroIdentificacao, Double velocidadeMaxima) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public CarroCorrida(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	//Metodos
	
	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}


	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeAtual;
	}


	public Motor getMotor(){
		return motor;
	}
	public void setMotor(Motor motor){
		this.motor = motor;
	}



	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}



	public void desligar(){
		System.out.println("MMMmmmm......");
	}
	
	public void acelerar(){
	velocidadeAtual += 10*(motor.getPotencia()*1.10);
		if(velocidadeAtual > velocidadeMaxima){
			velocidadeAtual = velocidadeMaxima;
		}
	}
	
	public void frear(Integer intensidadeFreada){
		if(intensidadeFreada > 100){
			intensidadeFreada = 100;
		}
		else if(intensidadeFreada < 0){
			intensidadeFreada = 0;
		}
		
		velocidadeAtual -= intensidadeFreada*0.25;
		if(velocidadeAtual < 0){
			velocidadeAtual = 0.0;
		}
	}

/*
	public void imprimeDadosCarro(){
		System.out.println("--DadosCarro--");
		System.out.println("numeroIdentificacao: "+getNumeroIdentificacao());
		System.out.println("velocidadeAtual: "+getVelocidadeAtual());
		System.out.println("velocidadeMaxima: "+getVelocidadeMaxima());
		System.out.println("----DadosMotor----");
		System.out.println("motor: "+getMotor().imprimeDadosMotor());
		System.out.println("----DadosPiloto----");
		System.out.println("piloto: "+getPiloto().imprimeDadosPiloto());
	
	}
*/
}
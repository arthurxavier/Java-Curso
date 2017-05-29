class Endereço{
	//Atributos
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String cep;
	private String telefone;

	//Construtor
	public Endereço(String estado, String cidade, String bairro, String rua, String cep, String telefone){
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.telefone = telefone;
	}

	//Metodos
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}

	public String getCidade(){
		return cidade;
	}
	public void setCidade(String estado){
		this.cidade = cidade;
	}
}
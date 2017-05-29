class Pessoa{
	//Atributos
	private String nome;
	private Integer idade;
	private String cpf;
	private Endereço endereço;

	//Construtor
	public Pessoa(String nome, Integer idade, String cpf, Endereço endereço){
		if(nome != "" && idade!= null && cpf!="" && endereço!= null)
		{
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
			this.endereço = endereço;
		}else{
			System.out.println("Para cadastrar Pessoa, deve possuir todos os dados");
		}
	}

	//Metodos
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public Integer getIdade(){
		return idade;
	}
	public void setIdade(Integer idade){
		this.idade = idade;
	}

	public String getCPF(){
		return cpf;
	}
	public void setCPF(String cpf){
		this.cpf = cpf;
	}

	public Endereço getEndereço(){
		return endereço;
	}
	public void setEndereço(){
		this.endereço = endereço;
	}

	public void ImprimeDados(){
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("CPF: "+getCPF());
	}
}
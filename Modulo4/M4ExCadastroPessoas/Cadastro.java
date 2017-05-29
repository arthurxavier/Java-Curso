import java.util.List;

class Cadastro{
	private List<Pessoa> pessoas;
	int NUMERO_MAXIMO = 100;

	//Construtor
	public Cadastro(List<Pessoa> pessoas){
		this.pessoas = pessoas;
	}

	public void cadastraPessoa(Pessoa pessoa){
		if(pessoas.size() < NUMERO_MAXIMO){
			pessoas.add(pessoa);
		}else{
			System.out.println("Numero maximo atingido");
		}
	}

	public void removerPessoa(Pessoa pessoa){
		if(!pessoas.isEmpty()){
			pessoas.remove(pessoa);
		}else{
			System.out.println("Lista vazia...");
		}
	}

	public void listar(){
		for(Pessoa pessoa: pessoas){
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("CPF: " + pessoa.getCPF());
			System.out.println("Cidade:" + pessoa.getEndereço().getCidade());
		}
	}

}
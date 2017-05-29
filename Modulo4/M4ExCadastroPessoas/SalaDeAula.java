class SalaDeAula{
	//Atributos
	private Pessoa[] pessoa;

	//Construtor
	public SalaDeAula(int numeroAluno){
		if(numeroAluno>=1 && numeroAluno<=10){
			pessoa = new Pessoa[numeroAluno];
			System.out.println("\nCadastrado "+numeroAluno+" Alunos");
		}
		else
			System.out.println("\nSala não Cadastrada.\nNumero de alunos deve ser entre 1 e 10");
	}

}
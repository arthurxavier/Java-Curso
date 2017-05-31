public class Cachorro extends Animal{
	

	public Cachorro(String name, int idade, String som, String tipo){
		setName(name);
		setIdade(idade);
		setSom(som);
		setTipo(tipo);
	}

	public void deveCorrer(){
		System.out.println("Cachorro Correndo!");
	}

}
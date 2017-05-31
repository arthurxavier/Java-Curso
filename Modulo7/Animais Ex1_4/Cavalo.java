public class Cavalo extends Animal{
	

	public Cavalo(String name, int idade, String som, String tipo){
		setName(name);
		setIdade(idade);
		setSom(som);
		setTipo(tipo);
	}

	public void deveCorrer(){
		System.out.println("Cavalo Correndo!");
	}

}
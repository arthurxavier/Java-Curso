public class Preguica extends Animal{
	

	public Preguica(String name, int idade, String som,String tipo){
		setName(name);
		setIdade(idade);
		setSom(som);
		setTipo(tipo);
	}

	public void subirArvores(){
		System.out.println("Suindo em Árvores!");
	}

}
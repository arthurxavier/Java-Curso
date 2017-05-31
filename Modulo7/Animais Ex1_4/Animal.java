public class Animal{
	private String name;
	private int idade;
	private String som;
	private String tipo;

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}

	public String getSom(){
		return som;
	}
	public void setSom(String som){
		this.som = som;
	}

	public void emitirSom(){
		System.out.println("Som:"+getSom());
	}

}
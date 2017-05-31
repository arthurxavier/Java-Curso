import java.util.*;

public class Modulo7{
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Boby",15,"Auau!","cachorro");
		System.out.println("Nome:"+dog.getName());
		System.out.println("Idade:"+dog.getIdade());
		dog.emitirSom() ;
		dog.deveCorrer();


		Cavalo horse = new Cavalo("Zeus",19,"Relincho!","cavalo");
		System.out.println("Nome:"+horse.getName());
		System.out.println("Idade:"+horse.getIdade());
		horse.emitirSom() ;
		horse.deveCorrer();


		Preguica preguica = new Preguica("Mona",23,"...!","preguica");
		System.out.println("Nome:"+preguica.getName());
		System.out.println("Idade:"+preguica.getIdade());
		preguica.emitirSom() ;
		preguica.subirArvores();
		
	}
}
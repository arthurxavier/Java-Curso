import java.util.*;

public class Zoologico {
	public static void main(String[] parametros) {
		
		Animal[] jaulas = {	new Cachorro("Boby",15,"Auau!","cachorro"), 
							new Cavalo("Zeus",19,"Relincho!","cavalo"),
							new Preguica("Mona",23,"...!","preguica")};

		for (int i=0; i<jaulas.length; i++) 
		{
			jaulas[i].emitirSom();
			if (jaulas[i].getTipo().equals("cachorro")){
				((Cachorro)jaulas[i]).deveCorrer();
			} 
			else if(jaulas[i].getTipo().equals("cavalo")){
				((Cavalo)jaulas[i]).deveCorrer();
			}
		}

	}
}
import java.util.ArrayList;
import java.util.Collections;

public class M9Ex11 {
	public static void main(String[] parametros) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");
		pesquisaElemento(lista);
	
	}

	public static void pesquisaElemento(ArrayList<String> l){
		int pesquisa = Collections.binarySearch(l, "String 2");
		System.out.println(pesquisa);
	}
} 
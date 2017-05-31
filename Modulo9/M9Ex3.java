import java.util.HashSet;

public class M9Ex3 {
	public static void main(String[] parametros) {
		HashSet<String> lista = new HashSet<String>();
		lista.add("String1");
		lista.add("String1");
		lista.add("String2");
		lista.add("String2");
		lista.add("String3");
		lista.add("String3");
		imprimeLista(lista);
	}

	public static void imprimeLista(HashSet<String> l){
		for(String i: l)
			System.out.println(i);
	}
} 

//Tem 3 elementos
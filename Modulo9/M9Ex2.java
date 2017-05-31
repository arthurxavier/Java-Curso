import java.util.ArrayList;

public class M9Ex2 {
	public static void main(String[] parametros) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("String1");
		lista.add("String1");
		lista.add("String2");
		lista.add("String2");
		lista.add("String3");
		lista.add("String3");
		imprimeLista(lista);
	}

	public static void imprimeLista(ArrayList<String> l){
		for(String i: l)
			System.out.println(i);
	}
} 

//Tem 6 elementos
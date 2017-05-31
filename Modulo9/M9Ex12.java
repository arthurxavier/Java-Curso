import java.util.ArrayList;
import java.util.Collections;

public class M9Ex12 {
	public static void main(String[] parametros) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");
		ordenaImprime(lista);
	}

	public static void ordenaImprime(ArrayList<String> l){
		Collections.sort(l);
		for (String i:l)
			System.out.println(i);
	}
} 
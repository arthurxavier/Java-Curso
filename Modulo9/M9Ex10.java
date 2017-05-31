import java.util.ArrayList;
import java.util.Collections;

public class M9Ex10 {
	public static void main(String[] parametros) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");
		calculaMedia(lista);

	}

	public static void calculaMedia(ArrayList<String> l){
		Collections.shuffle(l);
		for (String i:l)
			System.out.println(i);
	}
} 
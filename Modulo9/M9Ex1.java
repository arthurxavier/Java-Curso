import java.util.ArrayList;

public class M9Ex1 {
	public static void main(String[] parametros) {
		ArrayList<String> lista = new ArrayList<String>();
		for (int i=0; i<200; i++)
			lista.add("String "+i);
		imprimeLista(lista);
	}

	public static void imprimeLista(ArrayList<String> l){
		for(String i: l)
			System.out.println(i);
	}
} 
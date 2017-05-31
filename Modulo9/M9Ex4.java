import java.util.Map;
import java.util.HashMap;

public class M9Ex4 {
	public static void main(String[] parametros) {
		Map lista = new HashMap();
		lista.put(1, "String1");
		lista.put(1, "String1");
		lista.put(2, "String2");
		lista.put(2, "String2");
		lista.put(3, "String3");
		lista.put(3, "String3");
		imprimeLista(lista);
	}

	public static void imprimeLista(Map l){
		for(int i=1; i<l.size()+1; i++)
			System.out.println(l.get(i));
	}
} 

//Tem 3 elementos

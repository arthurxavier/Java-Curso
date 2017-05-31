import java.util.ArrayList;
import java.util.Iterator;

public class M9Ex6 {
	public static void main(String[] parametros) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(100);
		lista.add(20);
		lista.add(200);
		lista.add(30);
		lista.add(80);
		lista.add(40);
		lista.add(100);
		lista.add(200);
		calculaMedia(lista);
	}

	public static void calculaMedia(ArrayList<Integer> l){
		
		Iterator<Integer> iteratorLista = l.iterator();
		int media = 0;
		while (iteratorLista.hasNext()) {
			media += iteratorLista.next();
		}
		media /= l.size();
		System.out.println("Media: "+media);
	}
} 
import java.util.ArrayList;

public class M9Ex5 {
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
		double media = 0.0;
		for(int i: l)
			media += i;
		media /= l.size();
		System.out.println("Media: "+media);
	}
} 

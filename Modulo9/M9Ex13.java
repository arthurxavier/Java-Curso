import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Calendar;

public class M9Ex13 {
	public static void main(String[] parametros) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for (int i=0; i<20000; i++) {
			hashSet.add(i);
			hashMap.put(i,i);
		}
		pesquisaInTempo(hashSet,hashMap);	
	}

	public static void pesquisaInTempo(HashSet<Integer> hashSet, HashMap<Integer,Integer> hashMap){
		
		long tempoInicial = Calendar.getInstance().getTimeInMillis();
		hashSet.contains(17900);
		long tempoFinal = Calendar.getInstance().getTimeInMillis();
		System.out.println("tempo do HashSet: " + (tempoFinal - tempoInicial));
		tempoInicial = Calendar.getInstance().getTimeInMillis();
		hashMap.containsValue(17900);
		tempoFinal = Calendar.getInstance().getTimeInMillis();
		System.out.println("tempo do HashMap: " + (tempoFinal - tempoInicial));
	}
} 
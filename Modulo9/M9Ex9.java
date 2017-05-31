import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M9Ex9 {
	public static void main(String[] parametros) {
		Set<Integer> hashSet = new HashSet<Integer>();
		
// 8 Elementos Diferentes		
		hashSet.add(100);
		hashSet.add(20);
		hashSet.add(200);
		hashSet.add(30);
		hashSet.add(80);
		hashSet.add(40);
		hashSet.add(110);
		hashSet.add(220);
		calculaMedia(hashSet);
	}

	public static void calculaMedia(Set<Integer> l){
		Iterator<Integer> iteratorHashSet = l.iterator();
		int media = 0;
		for(int i: l)
			media += iteratorHashSet.next();

		media /= l.size();
		System.out.println("Media: "+media);
	}
} 


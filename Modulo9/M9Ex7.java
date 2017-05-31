import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M9Ex7 {
	public static void main(String[] parametros) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(20);
		hashSet.add(200);
		hashSet.add(30);
		hashSet.add(80);
		hashSet.add(40);
		hashSet.add(100);
		hashSet.add(200);
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

//M9Ex8
/*As médias ficaram diferentes porque em qualquer Set 
não permite duplicatas, dessa maneira ignorando 2 dos 
números inseridos (100 e 200) assim obtendo uma média diferente.

*/
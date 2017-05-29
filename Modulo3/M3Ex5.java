import java.util.Arrays;

public class M3Ex5
{
	public static void	main(String[] parametros)
	{
		int i;
		boolean[] boolean2 = new boolean[]{true,true,true};
		boolean[] boleean1 = new boolean[]{true,true,true};

		if(ehIdentico(boleean1,boolean2))
			System.out.println("Ambos são identicos");
		else
			System.out.println("Ambos NÂO são identicos");	

	}

	public static boolean ehIdentico(boolean[] x, boolean[] y){
		if(mesmoTamanho(x,y) && mesmoElementos(x,y))
			return true;
		else
			return false;
	}

	public static boolean mesmoTamanho(boolean[] x, boolean[] y){
		if(x.length == y.length)
			return true;
		else
			return false;
	}		

	public static boolean mesmoElementos(boolean[] x, boolean[] y){
		if(mesmoTamanho(x,y)){
			for(int i = 0; i <x.length;i++){
				if(x[i]==y[i])
					continue;
				else
					return false;
			}
			return true;
		}
		else
			return false;
	}
}

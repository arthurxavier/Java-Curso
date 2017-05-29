import java.util.Scanner;

public class M2Ex19
{
	public static void	main(String[] parametros)
	{
		int i;
		int cont =0;


		for(i=15; i<=35; i++){
			if(ehPrimo(i))
			{
				System.out.printf("Quadrado do primo %d: %d\n",i,(i*i));
			}
		}

			
	}

	public static boolean ehPrimo(int n){

		int i;
		int cont=0;

		for(i=1; i<=n; i++){
			if(n%i == 0){
				cont ++;
			}
		}
		if(cont == 2){
			return true;
		}
		else 
			return false;
	}
}


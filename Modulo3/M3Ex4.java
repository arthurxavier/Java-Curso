import java.util.Arrays;

public class M3Ex4
{
	public static void	main(String[] parametros)
	{
		int i;
		float soma = 1;
		int[] vetor = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] x = new int[vetor.length];

		System.out.println("Vetor normal:");
		for(i=0; i<vetor.length; i++){
			x[i]=vetor[vetor.length-i-1];
			System.out.print(" "+vetor[i]);
		}

		System.out.println("\nVetor invertido:");
		for(i=0;i<10;i++){
			System.out.print(" "+x[i]);
		}
		System.out.println("\n");
	}


}

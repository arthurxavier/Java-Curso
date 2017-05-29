import java.util.Arrays;
import java.util.Scanner;

public class M3Ex15
{
	public static void	main(String[] parametros)
	{
		int[] vetor = new int[10];

		System.out.println("Entre com 10 numeros inteiros");
		preencheVetor(vetor);
		verifyMaiorMenorDif(vetor);
		
	}
	public static void preencheVetor(int[] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++)
			x[i] = s.nextInt();
	}
	
	public static void verifyMaiorMenorDif(int[] x){
		int maior = x[0];
		int menor = x[0];
		for(int i=1; i<x.length; i++ ){
			if(menor > x[i])
				menor = x[i];
			
			if(maior < x[i])
				maior = x[i];
		}
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		System.out.println("Diferença: "+(maior-menor));
	}
}

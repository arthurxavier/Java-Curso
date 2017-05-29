import java.util.Arrays;
import java.util.Scanner;

public class M3Ex11
{
	public static void	main(String[] parametros)
	{
		int[] vetor = new int[10];

		System.out.println("Entre com 10 numeros inteiros");
		preencheVetor(vetor);
		
		for(int i=0; i<vetor.length-1; i++)
			System.out.println("Numero: "+vetor[i]+
				" |  Frequencia: "+verifiqueFrequencia(vetor,vetor[i]));

		
	}
	public static void preencheVetor(int[] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++)
			x[i] = s.nextInt();
	}

	public static int verifiqueFrequencia(int[] x, int n){
		int frequencia = 0;
		for(int i=0;i<x.length-1;i++)
			if(x[i] == n)
				frequencia++;

		return frequencia;
	}
	
}

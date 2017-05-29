import java.util.Arrays;
import java.util.Scanner;

public class M3Ex14
{
	public static void	main(String[] parametros)
	{
		int[] vetor = new int[10];

		System.out.println("Entre com 10 numeros inteiros");
		preencheVetor(vetor);
		verifyProgArit(vetor);
		
	}
	public static void preencheVetor(int[] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++)
			x[i] = s.nextInt();
	}
	
	public static void verifyProgArit(int[] x){
		int p = x[1]-x[0];
		for(int i=1; i<x.length-1; i++ ){
			if(p != x[i+1]-x[i]){
				System.out.println("Não possue Progressçao Aritmética");
				return;
			}
		}
		System.out.println("Progressçao Aritmética: "+p);
	}
}

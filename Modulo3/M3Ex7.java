import java.util.Arrays;
import java.util.Scanner;

public class M3Ex7
{
	public static void	main(String[] parametros)
	{
		double[] vetor = new double[10];
		System.out.println("Entre com 10 numeros quaisquer");
		preencheVetor(vetor);
		Arrays.sort(vetor);
		imprimeVetor(vetor);
		
	}
	public static void preencheVetor(double[] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++)
			x[i] = s.nextDouble();
	}

	public static void imprimeVetor(double[] x)
	{
		for(int i=0; i<x.length;i++)
			System.out.printf(" %.2f",x[i]);
		System.out.printf("\n");
	}

	
}

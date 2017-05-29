import java.util.Arrays;
import java.util.Scanner;

public class M3Ex10
{
	public static void	main(String[] parametros)
	{
		int[] base = new int[10];
		int[] comp = new int[5];

		System.out.println("Entre com 10 numeros inteiros");
		preencheVetor(base);
		System.out.println("Entre com 5 numeros inteiros");
		preencheVetor(comp);

		if(Arrays.asList(base).containsAll(Arrays.asList(comp)))
			System.out.println("Ventor esta contido");
		else
			System.out.println("Ventor NÃO esta contido");
		
	}
	public static void preencheVetor(int[] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++)
			x[i] = s.nextInt();
	}
	
}

import java.util.Scanner;

public class M3Ex3
{
	public static void	main(String[] parametros)
	{
		int i;
		float soma = 1;
		int[] v = new int[]{1,2,3,4,5,6,7,8,9,10};

		for(i=0;i<10;i++)
			soma = soma * v[i];

		System.out.printf("%.2f \n",soma);
	}
		
}

import java.util.Scanner;

public class M2Ex7
{
	public static void	main(String[] parametros)
	{
		int i = 1;
		int soma = 0;

		while(i<= 30)
		{
			if(i%2 == 1)
			{
				soma = soma + i;
				System.out.println("Impar "+i);
			}
			i++;
		}
		System.out.println("Soma: "+soma);

	}
}
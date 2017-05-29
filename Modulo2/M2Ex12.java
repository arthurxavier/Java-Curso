import java.util.Scanner;

public class M2Ex12
{
	public static void	main(String[] parametros)
	{
		int num;
		int i;
		int soma = 0;
		Scanner s = new Scanner(System.in);

		do{
		
			num = s.nextInt();
			for(i = 1; i < num; i++)
			{
				if(num%i == 0)
					soma = soma + i;
			}

			if(soma == num)
				System.out.println("Numero Perfeito");
			else
				System.out.println("Numero não Perfeito");
			
		}while(num != 0);

	}
}
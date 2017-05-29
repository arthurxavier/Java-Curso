import java.util.Scanner;

public class M2Ex9
{
	public static void	main(String[] parametros)
	{
		int num;
		int inv = 0;
		int aux;
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um numero de 4 digitos");
		num = s.nextInt();

		inv = (int)(num/1000);
		num = num - 1000*(int)(num/1000);

		inv = inv + 10*(int)(num/100);
		num = num - 100*(int)(num/100);	

		inv = inv + 100*(int)(num/10);
		num = num - 10*(int)(num/10);

		inv = inv + 1000*(int)(num/1);
		num = num - 1*(int)(num/1);
		
		System.out.println("inv: "+inv);
	}
}
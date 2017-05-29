import java.util.Scanner;

public class M2Ex18
{
	public static void	main(String[] parametros)
	{
		double invest = 100.00;
		int cont;

		for(cont = 0; invest <= 200.00; cont++){
			invest = invest*1.05;
		}

		System.out.println("Mesês para ultrapassar R$ 200,00: "+cont);
	}
	
}
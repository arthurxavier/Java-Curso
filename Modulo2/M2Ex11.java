import java.util.Scanner;

public class M2Ex11
{
	public static void	main(String[] parametros)
	{
		int dias;
		double salario;
		
		Scanner s = new Scanner(System.in);

		System.out.printf("Dias trabalhados: ");
		dias = s.nextInt();
		System.out.printf("Slario integral: ");
		salario = s.nextDouble();

		System.out.println("\nSalario proporcional: "+ ((salario*dias)/22));
		
	}
}
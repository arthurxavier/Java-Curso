import java.util.Scanner;

public class M2Ex17
{
	public static void	main(String[] parametros)
	{
		double h;
		double b;
		double B;
		double Area;

		Scanner s = new Scanner(System.in);
		System.out.println("Digite: altura,base menor, base maior");
		h = s.nextDouble();
		b = s.nextDouble();
		B = s.nextDouble();

		System.out.println("Área: "+((h*(b+B))/2));
	}
	
}
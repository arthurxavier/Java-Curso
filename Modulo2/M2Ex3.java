import java.util.Scanner;

public class M2Ex3
{
	public static void	main(String[] parametros)
	{
		int num;
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 7");
		num = s.nextInt(); 

		switch(num){
			case 1:
				System.out.println("Domingo");

			case 2:
				System.out.println("Segunda-feira");
				break;

			case 3:
				System.out.println("Terça-feira");
				break;

			case 4:
				System.out.println("Quarta-feira");
				break;

			case 5:
				System.out.println("Quinta-feira");
				break;

			case 6:
				System.out.println("Sexta-feira");
				break;

			case 7:
				System.out.println("Sabado");
				break;

			default:
				System.out.println("numero invalido");
				break;
		}

	}
}
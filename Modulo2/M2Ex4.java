import java.util.Scanner;

public class M2Ex4
{
	public static void	main(String[] parametros)
	{
		int num;
		Scanner s = new Scanner(System.in);

		do{
			System.out.println("Digite um numero de 1 a 7");
			System.out.println("0 para sair");
			num = s.nextInt(); 

			switch(num){
				case 0:
					System.out.println("Exit");
					break;

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
		}while(num!= 0);

	}
}
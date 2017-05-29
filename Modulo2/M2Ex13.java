import java.util.Scanner;

public class M2Ex13
{
	public static void	main(String[] parametros)
	{
		int i;
		int op;
		int fat;
		int x1, x2, x3;
		Scanner s = new Scanner(System.in);

	do{
		System.out.println("Digite um numero de 1 a 3");
		op = s.nextInt();
		menu: switch(op){
			case 1:
				System.out.println("Digite o numero para cacular Fat");
				x1 = s.nextInt();
				fat = numberFat(x1);
				System.out.println("Fatorial: "+fat);
				break;

			case 2:
				System.out.println("Digite 3 valores: ");
				x1 = s.nextInt();
				x2 = s.nextInt();
				x3 = s.nextInt();
				System.out.println("Raiz Quadrada de X1: "+Math.sqrt(x1));
				System.out.println("Raiz Quadrada de X2: "+Math.sqrt(x2));
				System.out.println("Raiz Quadrada de X3: "+Math.sqrt(x3));
				break;

			case 3:
				for(i=1;i<=10;i++){
					System.out.printf("10 * %d = %d\n",i,10*i);
				}
				break;

			case 4:
				System.out.println("Exit");
				break menu;

			default:
				System.out.println("Opção invalida");
				break;
		}

	}while(op!=4);
}
	public static int numberFat(int x){
		int soma = 1;
		for(;x>0;x--)
		{
			soma = soma*x;
		}
		return soma;
	}
}
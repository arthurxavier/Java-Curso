import java.util.Scanner;

public class M2Ex10
{
	public static void	main(String[] parametros)
	{
		int num;
		int i;
		int cont =0;
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um numero");
		num = s.nextInt();

		for(i=1; i<=num; i++){
			if(num%i == 0){
				cont ++;
			}
		}

		if(cont == 2)
			System.out.printf("O valor %d eh INTEIRO\n",cont);
		else
			System.out.printf("O valor %d NÃO eh INTEIRO\n",cont);	
		
	}
}
import java.util.Scanner;

public class M2Ex8
{
	public static void	main(String[] parametros)
	{
		int i;
		int j;

		for(i=0;i<=10;i++){
			for(j=0;j<=10;j++){

				if(i == j){
					System.out.println("---IGUAIS---");
					System.out.println("contador i: "+i);
					System.out.println("contador j: "+j);
					break;
				}
				else{
					System.out.println("i: "+i);
					System.out.println("j: "+j);
				}
			}
			System.out.println(" ");
		}

	}
}
import java.util.Scanner;

public class M2Ex20
{
	public static void	main(String[] parametros)
	{
		int i,j,k;


		for(i=1; i<=8; i++){
			for(j=1;j<=i;j++){
				System.out.printf("*");
			}
			for(k=j;k<=8;k++){
				System.out.printf(" ");
			}
			System.out.printf("\n");
		}

		System.out.printf("\n\n\n\n");

		for(i=8; i>=1; i--){
			for(j=i;j>=1;j--){
				System.out.printf("*");
			}
			for(k=i;k<8;k++){
				System.out.printf(" ");
			}
			System.out.printf("\n");
		}

		System.out.printf("\n\n\n\n");

		for(i=1; i<=8; i++){
			for(j=1;j<i;j++){
				System.out.printf(" ");
			}
			for(k=j;k<=8;k++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		System.out.printf("\n\n\n\n");

		for(i=8; i>=1; i--){
			for(j=i;j>=1;j--){
				System.out.printf(" ");
			}
			for(k=i;k<=8;k++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
		
}

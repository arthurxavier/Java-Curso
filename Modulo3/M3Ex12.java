import java.util.Arrays;
import java.util.Scanner;

public class M3Ex12
{
	public static void	main(String[] parametros)
	{
		int[][] matriz = new int[4][4];

		System.out.println("Entre com 16 numeros inteiros");
		System.out.println("matriz[0].length-1:  "+(matriz[0].length));
		System.out.println("matriz.length-1:  "+ (matriz.length));
		preencheMatriz(matriz);
		transposiçãoMatriz(matriz);
		
		
	}
	public static void preencheMatriz(int[][] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++){
			for(int j=0; j<x[0].length;j ++){
				x[i][j] = s.nextInt();
			}
		}
	}

	public static void transposiçãoMatriz(int[][] x){
		System.out.println("\n Matriz transposta: \n");
		for (int linha = 0; linha < x.length; linha++) {
			for (int coluna = 0; coluna < x[0].length; coluna++) {
				System.out.printf("M[%d][%d]: ", linha, coluna);
				System.out.printf("%d ", x[coluna][linha]);
			}
			System.out.println();
		}
	}
	
}

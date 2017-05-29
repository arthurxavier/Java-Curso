import java.util.Arrays;
import java.util.Scanner;

public class M3Ex16
{
	public static void	main(String[] parametros)
	{
		int[] vetor = new int[10];
		int[] vetorFinal = new int[10];

		System.out.println("Entre com 10 numeros inteiros");
		preencheVetor(vetor);
		vetorFinal = ordenaVetor(vetor);
		System.out.println("");
		System.out.println("--Vetor ORDENADO--");
		imprimeVetor(vetorFinal);	
	}

	public static void preencheVetor(int[] x){
		Scanner s = new Scanner(System.in);

		for(int i=0; i<x.length;i++)
			x[i] = s.nextInt();
	}
	
	public static int searchIndiceBigest(int[] x, int n){
		int indice_maior = 0;

		for(int i=1; i<=n; i++){
			if(x[indice_maior] < x[i])
				indice_maior = i;
		}

		return indice_maior;
	}

	public static int [] ordenaVetor(int[] vetor)
	{
		int[] ordenado = new int[10];
		int indice_maior;
		int n = vetor.length-1; 	//TAMANHO A CONSIDERAR DO VEOTR
		int j = ordenado.length-1;	//PONTEIRO DE VETOR ORDENADO

		for(j=ordenado.length-1; j>=0 ;j--)
		{
			//Procura maior no vetor ate Pos n;
			indice_maior = searchIndiceBigest(vetor,n);
			ordenado[j]=vetor[indice_maior];
			//Se maior é antes do ultimo consideravel do vetor
			if(indice_maior < vetor.length-1)
			{
					//troca o maior com o ultimo consideravel
					int aux = vetor[indice_maior];
					vetor[indice_maior] = vetor[n];
					vetor[n] = aux;
					//e diminui o tamanho consideravel do vetor
			}
			else if(indice_maior > vetor.length-1){
				System.out.println("Posição indice maior, MAIOR que tamnho de vetor");
				return null;
			}
			n--;
		}
		return ordenado;
	}

	public static void imprimeVetor(int[] x)
	{
		for(int i=0;i<x.length;i++)
			System.out.printf("%d ",x[i]);
		System.out.println("");
	}

}

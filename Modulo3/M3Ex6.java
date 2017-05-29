import java.util.Arrays;

public class M3Ex6
{
	public static void	main(String[] parametros)
	{
		int i;
		double[] v1 = new double[]{10.0,11.1,12.2,13.3,14.4,15.5,16.6,17.7};
		double[] v2 = new double[]{10.0,11.1,12.2,13.3,14.4,15.5,16.6,17.7};
		
		System.out.printf("Produto Escalar: %.2f\n",prodEscalar(v1,v2));

		
	}
	public static boolean mesmoTamanho(double[] x, double[] y)
	{
		if(x.length == y.length)
			return true;
		else
			return false;
	}	

	public static void multcaMatriz(double[] x, double[] y, double[] z){
		if(mesmoTamanho(x,y))
		{
			for(int i=0 ; i<x.length;i++)
			{
				z[i] = x[i] * y[i];
			}
		}
	}

	public static double prodEscalar(double[] x, double[] y)
	{
		double[] vSoma = new double[x.length];
		double total = 0;

		multcaMatriz(x,y,vSoma);
		for(int i=0; i<vSoma.length-1;i++)
			total += vSoma[i];

		return total;
	}
	
}

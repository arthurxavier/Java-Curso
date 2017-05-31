import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainFiguraGeometrica {
	
	public static void main(String[] parametros) {
		
		try {
			System.out.println("Entre com 2 parametros");
			Scanner s = new Scanner(System.in);
			double lado1 = s.nextInt();
			double lado2 = s.nextInt();
			Quadrado quadrado = new Quadrado(lado1);
			System.out.println("area: " + quadrado.calcularArea());
			System.out.println("perimetro: " + quadrado.calcularPerimetro());
		
		} catch (Throwable t) {
			t.printStackTrace();
			JOptionPane.showMessageDialog(null, t.getMessage());
		
		}
	}
}
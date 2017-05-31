import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainContaCorrente {
	public static void main(String[] parametros) {
		
		try {
			ContaCorrenteEspecial conta = new ContaCorrenteEspecial(1200.0, 200.0, 200.0);
			System.out.println(conta.toString());
			conta.depositar(250.0);
			System.out.println(conta.toString());
			conta.sacar(1400.0);
			System.out.println(conta.toString());
			conta.sacar(20.0);
			System.out.println(conta.toString());
			conta.depositar(100.0);
			System.out.println(conta.toString());
			conta.sacar(500.0);
			System.out.println(conta.toString());
		} catch (Throwable t) {
			t.printStackTrace();
			JOptionPane.showMessageDialog(null, t.getMessage());
		}

	}
}
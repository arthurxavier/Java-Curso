import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args)
	{
		
		//Criação dos carros
		String s = "Aula Modulo 5 Java";
		Dados dados = new Dados(s);
		dados.firstFourChars(s);
		dados.verifyStringNumber("t3ste");
		dados.verifyNumberMax();
		dados.verifyToYear();

		
	}
}
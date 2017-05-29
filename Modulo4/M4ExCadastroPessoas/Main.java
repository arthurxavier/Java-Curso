import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args)
	{
		
		//Criação dos carros
		Pessoa pessoa = new Pessoa("Arthur", 22, "02662118105", new Endereço("Minas Gerais", "Udia", "Santa Monica", "Av Salomao", "38408160", "3492237659"));
		List<Pessoa> pessoas = new ArrayList<>(100);

		Cadastro cadastro = new Cadastro(pessoas);
		cadastro.cadastraPessoa(pessoa);
		cadastro.listar();

		cadastro.removerPessoa(pessoa);
		cadastro.listar();	
		cadastro.removerPessoa(pessoa);	

		
	}
}
import java.util.HashSet;
public class M9Ex15 {

	public static void main(String[] parametros) {
		HashSet<ContaCorrente> lista = new HashSet<ContaCorrente>();
		lista.add(new ContaCorrente("2109-X",123,"Arthur","02662118105",7000.0));
		lista.add(new ContaCorrente("4345-2",456,"Adalto","14509865600",100.0));
		lista.add(new ContaCorrente("6263-4",789,"Juca","39930038876",300.0));
		lista.add(new ContaCorrente("9194-8",123,"Joao","41144446609",15960.0));
		lista.add(new ContaCorrente("2324-X",456,"Luiz","19910014376",2050.0));
		for (ContaCorrente conta:lista)
			System.out.println(conta.imprimeDados());
	}
} 
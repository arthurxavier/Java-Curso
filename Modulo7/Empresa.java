import java.util.*;
import java.util.ArrayList;

public class Empresa {

	public static void main(String[] parametros) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new FuncionarioBasico("Bruno","101010",new Vendedor(),"Escola A"));
		funcionarios.add(new FuncionarioBasico("Bruna","101011",new Vendedor(),"Escola A"));
		funcionarios.add(new FuncionarioBasico("Bernado","101012",new Vendedor(),"Escola A")); 
		funcionarios.add(new FuncionarioBasico("Brenda","101013",new Vendedor(),"Escola A")); 
		funcionarios.add(new FuncionarioMedio("Marcos","101020",new Vendedor(),"Escola A","Escola AX")); 
		funcionarios.add(new FuncionarioMedio("Mario","101021",new Vendedor(),"Escola A","Escola AX"));
		funcionarios.add(new FuncionarioMedio("Maria","101022",new Vendedor(), "Escola A","Escola AX")); 
		funcionarios.add(new FuncionarioMedio("Meire","101023",new Supervisor() ,"Escola A","Escola AX"));  
		funcionarios.add(new FuncionarioSuperior("Lucas","101030",new Supervisor(),"Escola A","Escola AX","UFU")); 
		funcionarios.add(new FuncionarioSuperior("Leticia","101031",new Gerente() ,"Escola A","Escola AX","UFU"));
		

		exibeDadosFuncionarios(funcionarios);
		calculaCustosSalarios(funcionarios);
	}

	public static void calculaCustosSalarios(ArrayList<Funcionario> funcionarios){
		double custos = 0.0;
		for (Funcionario f:funcionarios) 
		{
			custos += f.getRendaFinal();
		}
		System.out.println("");
		System.out.println("Custos com salarios: " + custos);
	}

	public static void exibeDadosFuncionarios(ArrayList<Funcionario> funcionarios){
		double custos = 0.0;
		for (Funcionario f:funcionarios){ 
			f.exibeDados();
		}
	}

}
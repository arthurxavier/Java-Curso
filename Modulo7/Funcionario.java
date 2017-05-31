public class Funcionario{
	private String nome;
	private String codigo;
	private double rendaBasica = 1000.00;
	private double rendaFinal;
	private Comissao comissao;

	public Funcionario(String nome, String codigo, Comissao comissao){
		this.nome = nome;
		this.codigo = codigo;
		this.comissao = comissao;
	}

	public String getNome(){
		return nome;
	}
	
	public String getCodigo(){
		return codigo;
	}
	
	public double getRendaFinal(){
		return rendaFinal;
	}
	public void setRendaFinal(double rendaFinal){
		this.rendaFinal = rendaFinal;
	}

	public double reajusteRenda(){
		rendaFinal = rendaBasica;
		return rendaFinal;
	}

	public double rendaTotal(){
		rendaFinal = reajusteRenda()+getComissao();
		return rendaFinal;
	}

	public double getComissao(){
		return comissao.getAdicional();
	}
}
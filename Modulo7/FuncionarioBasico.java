public class FuncionarioBasico extends Funcionario{

	private String escola;

	public FuncionarioBasico(String nome, String codigo, Comissao comissao, String escola){
		super(nome,codigo,comissao);
		setEscola(escola);
		rendaTotal();
		System.out.println("Comissão: "+getComissao()+"   RendaTotal"+rendaTotal()+"  RendaFinal "+getRendaFinal());
	}

	public void setEscola(String escola){
		this.escola = escola;
	}

	public double reajusteRenda(){
		double rendaFinal = super.reajusteRenda()*1.10;
		return rendaFinal;
	}

	public double rendaTotal(){
		double rendaFinal = reajusteRenda()+getComissao();
		setRendaFinal(rendaFinal);
		return rendaFinal;
	}
}
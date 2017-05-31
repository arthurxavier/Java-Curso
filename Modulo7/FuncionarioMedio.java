public class FuncionarioMedio extends FuncionarioBasico{

	private String escola;

	public FuncionarioMedio(String nome, String codigo, Comissao comissao, String escolaBasico, String escolaMedia){
		super(nome,codigo,comissao,escolaBasico);
		setEscolaMedia(escolaMedia);
		rendaTotal();
	}
	
	public void setEscolaMedia(String escola){
		this.escola = escola;
	}

	public double reajusteRenda(){
		double rendaFinal = super.reajusteRenda()*1.50;
		return rendaFinal;
	}

	public double rendaTotal(){
		double rendaFinal = reajusteRenda()+getComissao();
		setRendaFinal(rendaFinal);
		return rendaFinal;
	}
}
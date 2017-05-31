public class FuncionarioSuperior extends FuncionarioMedio{

	private String universidade;

	public FuncionarioSuperior(String nome, String codigo, Comissao comissao, String escolaBasico, String escolaMedia, String universidade){
		super(nome,codigo,comissao, escolaBasico ,escolaMedia);
		setUniversidade(universidade);
		rendaTotal();
	}
	
	public void setUniversidade(String universidade){
		this.universidade = universidade;
	}

	public double reajusteRenda(){
		double rendaFinal = super.reajusteRenda()*2;
		return rendaFinal;
	}

	public double rendaTotal(){
		double rendaFinal = reajusteRenda()+getComissao();
		setRendaFinal(rendaFinal);
		return rendaFinal;
	}
}
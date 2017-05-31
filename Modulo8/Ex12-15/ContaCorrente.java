public abstract class ContaCorrente {
	private double saldoTotal;

	public ContaCorrente(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public double sacar(double saque) {
		saldoTotal = saldoTotal - saque;
		return saque;
	}

	public void depositar(double deposito) {
		saldoTotal = saldoTotal + deposito;
	}

	public double obterSaldo() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
}
package exerciciosGiHub;

public class ContaPoupanca extends ContaBancaria {
	protected double diaRendimento;
	
	public ContaPoupanca(String NomeCliente, int NumConta, double Saldo, double DiaRendimento) {
		super(NomeCliente, NumConta, Saldo);
		this.diaRendimento=DiaRendimento;
	}
	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(double taxaRendimento) {
		double porcent = (this.saldo*taxaRendimento)/100;
		setSaldo(saldo+porcent);
	}
}

package exerciciosGiHub;

public class ContaEspecial extends ContaBancaria {
	protected float limite;
	
	public ContaEspecial(String NomeCliente, int NumConta, double Saldo, float Limite) {
		super(NomeCliente, NumConta, Saldo);
		this.limite=Limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override
	public void sacar(double quantRetirar) {
		if(quantRetirar<limite) {
			super.sacar(quantRetirar);
		}else {
			System.out.println("Quantidade de retirada ultrapassou o limite da conta.");
		}
	}
}

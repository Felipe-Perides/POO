package exerciciosGiHub;

public class ContaBancaria {
	protected int numConta;
	protected String nomeCliente;
	protected double saldo;
	
	public ContaBancaria(String NomeCliente, int NumConta, double Saldo) {
		this.nomeCliente=NomeCliente;
		this.numConta=NumConta;
		this.saldo=Saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// sacar
	public void sacar(double quantRetirar) {
		if (quantRetirar <= saldo) {
            setSaldo(getSaldo() - quantRetirar);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
	}
	// depositar
	public void depositar(double quantDepositar) {
		setSaldo(getSaldo()+quantDepositar);
	}
	// detalhes da conta
	public void mostrarDetalhes() {
        System.out.println("Conta: " + numConta);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}
